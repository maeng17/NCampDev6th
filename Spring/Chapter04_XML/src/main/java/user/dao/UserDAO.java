package user.dao;

import java.util.List;
import java.util.Map;

import user.bean.UserDTO;

public interface UserDAO {

	public void write(UserDTO userDTO);

	public List<UserDTO> getUserList();

	public UserDTO getUpdateList(String id);

	public void update(UserDTO userDTO);

	public void delete(String id);

	public UserDTO idCheck(String id);

	public void update2(Map<String, String> map);

	public void delete2(String id);

}
