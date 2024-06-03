package user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import user.bean.UserDTO;

@Mapper
public interface UserDAO {
	public void write(UserDTO uesrDTO);

	public UserDTO isExistId(String id);

	public List<UserDTO> getUserList(Map<String, Integer> map);

	public int getTotalA();

	public UserDTO getUser(String id);

	public void update(UserDTO userDTO);

	public void delete(String id);

	//public List<UserDTO> getUserList(int startNum);


}
