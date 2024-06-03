package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;


@Repository
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {

	//JdbcDaoSupport의 setDataSource가 final이기 때문에 Override할 수 없다.
	@Autowired
	public void setDS(DataSource dataSource){
		setDataSource(dataSource); //JdbcDaoSupport의 setDataSource 호출
	}
	
	@Override
	public void write(UserDTO userDTO) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		String sql = "insert into usertable values(:name, :id, :pwd)";
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		return getJdbcTemplate().query(sql,
								  new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
	}


	@Override
	public UserDTO getUpdateList(String id) {
		String sql = "select * from usertable where id="+id;
		return getJdbcTemplate().queryForObject(sql,
				  new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
		
	}

	@Override
	public void update(UserDTO userDTO) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		String sql = "update usertable set name=:name, pwd=:pwd where id=:id";
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}

	@Override
	public void delete(String id) {
		String sql = "delete from usertable where id="+id;
		getJdbcTemplate().update(sql, id);
		
	}

	@Override
	public UserDTO idCheck(String id) {
		String sql = "select * from usertable where id=?";
		
		try {
			return getJdbcTemplate().queryForObject(
					sql, 
					new BeanPropertyRowMapper<UserDTO>(UserDTO.class),
					id);
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public void update2(Map<String, String> map) {
		String sql = "update usertable set name=:name, pwd=:pwd where id=:id";
		getNamedParameterJdbcTemplate().update(sql, map);
	}

	@Override
	public void delete2(String id) {
		String sql = "delete from usertable where id=?";
		getJdbcTemplate().update(sql,id);
		
	}
	
}
