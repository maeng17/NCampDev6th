package homework;

import java.lang.reflect.Member;
import java.util.Scanner;

public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5];
	
	public MemberService() {
		for(int i=0; i<5; i++) {
			ar[i] = new MemberDTO();
		}
		
	}
		
	
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("번호: ");
			int num = scan.nextInt();
			
			if (num == 1) insert();
			else if (num ==2) list();
			else if (num ==3) update();
			else if (num == 4) delete();
			else break;
			
		} //while
		
	}
	
	public void insert() {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			if (ar[i] ==null ||ar[i].getName() == null) {
				System.out.print("이름 입력: ");
				String name = scan.next();
				ar[i].name(name);
				System.out.println();
				
				System.out.print("나이 입력: ");
				int age = scan.nextInt();
				ar[i].age(age);
				System.out.println();
				
				System.out.print("핸드폰 입력: ");
				String phone = scan.next();
				ar[i].phone(phone);
				System.out.println();
				
				System.out.print("주소 입력: ");
				String address = scan.next();
				ar[i].address(address);
				System.out.println();
				
				System.out.println("1 row created");
				break;
			} //if
			else System.out.println("5명 정원이 꽉 찼습니다.");
		}
	}
	
	public void list() {
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i].getName() + "\t"
							+ ar[i].getAge() + "\t"
							+ ar[i].getPhone() + "\t"
							+ar[i].getAddress() + "\t");
		} //for
		
	}
	
	public void update() {
		Scanner scan = new Scanner(System.in);
		System.out.print("핸드폰 번호 입력: ");
		String num = scan.next();
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i].getName() == num) {
				System.out.print("수정할 이름 입력: " );
				String n = scan.next();
				ar[i].replaceName(ar[i].getName(),n);
				System.out.println();
				
				System.out.print("수정할 핸드폰 입력: " );
				String p = scan.next();
				ar[i].replacePhone(ar[i].getPhone(),p);
				System.out.println();
				
				System.out.print("수정할 주소 입력: " );
				String add = scan.next();
				ar[i].replaceAddress(ar[i].getAddress(),add);
				System.out.println();
				break;
				}//if
			else System.out.println("찾는 회원이 없습니다.");
		}
	}
	
	public void delete() {
		Scanner scan = new Scanner(System.in);
		StringBuffer buffer = new StringBuffer();
		
		System.out.print("핸드폰 번호 입력: ");
		String num = scan.next();
		
		for (int i=0; i<ar.length; i++) {
			if(ar[i].getName() == num) {
				buffer.delete(0, buffer.length());
			} //if
			else System.out.println("찾는 회원이 없습니다.");
		} //for
		
		
	}
	

}