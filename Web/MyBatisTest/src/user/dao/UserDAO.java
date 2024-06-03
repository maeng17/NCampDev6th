package user.dao;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import user.bean.UserDTO;

public class UserDAO {
	private SqlSessionFactory sqlSessionFactory;
	
	public static UserDAO userDAO = new UserDAO();
	
	public static UserDAO getInstance() {
		return userDAO;
	}
	
	public UserDAO() {
		try {
			//Reader reader = Resources.getResourceAsReader("mybatis-confug.xml");
			//sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(UserDTO userDTO) {
		SqlSession sqlSession = sqlSessionFactory.openSession(); //생성
		sqlSession.insert("userSQL.write", userDTO);
		sqlSession.commit();
		sqlSession.close();
		
		
	}

	public List<UserDTO> getUserList() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<UserDTO> list = sqlSession.selectList("userSQL.getUserList");
		sqlSession.close();
		return list;
	}


	public UserDTO getUser(String id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserDTO userDTO = sqlSession.selectOne("userSQL.getUser", id);
		sqlSession.close();
		return userDTO;
	}

	public void update(UserDTO userDTO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("userSQL.update", userDTO);
		sqlSession.commit();
		sqlSession.close();
		
	}

	public void delete(String id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("userSQL.delete", id);
		sqlSession.commit();
		sqlSession.close();
		
	}

	public List<UserDTO> search(int num) {
		Scanner scan = new Scanner(System.in);
		if(num == 1) {
			System.out.print("겁색할 이름 입력 : ");
			String name = scan.next();
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<UserDTO> list = sqlSession.selectList("userSQL.search", name);
			sqlSession.close();
			return list;	
		}
		else if(num == 2) {
			System.out.print("겁색할 아이디 입력 : ");
			String id = scan.next();
			SqlSession sqlSession = sqlSessionFactory.openSession();
			List<UserDTO> list = sqlSession.selectList("userSQL.search", id);
			sqlSession.close();
			return list;	
		}
		return null;

	}

	public List<UserDTO> search1(Map<String, String> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		List<UserDTO> list = sqlSession.selectList("userSQL.search1", map);
		
		sqlSession.close();
		return list;
	}
	
}
