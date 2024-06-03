package user.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserInsertService implements UserService {
	@Autowired //생성된 bean들 중에서 UserDTO를 찾아서 자동 매핑해라
	private UserDTO userDTO;
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		
		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);
		
		userDAO.write(userDTO);
		
		System.out.println(name + "님의 데이터를 저장하였습니다.");
		

	}

}
