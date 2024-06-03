package user.service;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

/*
public class UserDeleteService implements UserService {
	@Setter
	private List<UserDTO> list;
	@Setter
	private UserDAO userDAO;

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 아이디 입력 : ");
		String id = scan.next();
		List<UserDTO> list = userDAO.getUserList();
		
		System.out.println();
		int su = 0;
		
		for(UserDTO userDTO : list) {
			if(userDTO.getId().equals(id)) {
				su=1;
				
				userDAO.delete(id);
				
				System.out.println("\n" + id + "님의 데이터를 삭제하였습니다.");
				break;
			} //if
		}//while
		if(su == 0)
			System.out.println("찾고자하는 아이디가 없습니다.");

	}

}
*/

public class UserDeleteService implements UserService {
	@Setter
	private UserDAO userDAO;

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 아이디 입력 : ");
		String id = scan.next();
		UserDTO userDTO = userDAO.idCheck(id);
		
		if(userDTO == null) {
			System.out.println("찾고자하는 아이디가 없습니다.");
			return;
		}
		userDAO.delete2(id);
		System.out.println(id + "님의 데이터가 삭제돠었습니다.");
	}
	
}


/*
삭제할 아이디 입력 : angel
찾고자하는 아이디가 없습니다.

삭제할 아이디 입력 : hong

hong님의 데이터를 삭제하였습니다.
*/