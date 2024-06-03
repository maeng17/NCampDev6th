package user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;


//풀이
public class UserUpdateService implements UserService {
	@Setter
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 아이디 입력 : ");
		String id = scan.next();
		UserDTO userDTO = userDAO.idCheck(id);
		
		if(userDTO == null) {
			System.out.println("찾고자하는 아이디가 없습니다.");
			return;
		}
		System.out.println("이름\t아이디\t비번");
		System.out.println(userDTO);
		
		System.out.print("수정할 이름 입력 : ");
		String name = scan.next();
		System.out.print("수정할 비밀번호 입력 : ");
		String pwd = scan.next();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);
		map.put("id", id);
		map.put("pwd", pwd);
		
		userDAO.update2(map);
		
		System.out.println(id + "님의 데이터를 수정하였습니다.");
		
	}
}







/*
수정할 아이디 입력 : angel
찾고자하는 아이디가 없습니다.

수정할 아이디 입력 : hong --> queryForObject()

이름	아이디		비밀번호
홍길동	hong	111

수정할 이름 입력 : 홍당무
수정할 비밀번호 입력 : 333

hong님의 데이터를 수정하였습니다.
 */