package user.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import user.bean.UserDTO;

public interface UserService {

	public void write(UserDTO userDTO);

	public String isExistId(String id);

	public Page<UserDTO> getUserList(Pageable pageable);

	public Optional<UserDTO> getUser(String id);

	public void update(UserDTO userDTO);

	public void delete(String id);

	public List<UserDTO> getUserSearchList(String columnName, String value);

}
