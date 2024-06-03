package homework;

import java.util.Scanner;

public class MemberService01 {
	private MemberDTO01[] ar = new MemberDTO01[5];
	Scanner scan = new Scanner(System.in); //모든 함수에서 사용 가능
	
	
	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("****************");
			System.out.println("  1. 가입");
			System.out.println("  2. 출력");
			System.out.println("  3. 수정");
			System.out.println("  4. 탈퇴");
			System.out.println("  5. 끝내기");
			System.out.println("****************");
			System.out.print("번호: ");
			num = scan.nextInt();
			
			if (num==5) break;
			if (num==1) insert();
			else if (num ==2) list();
			else if (num ==3) update();
			else if (num == 4) delete();
			
		} //while
	}
	
	public void insert() {
		System.out.println();
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null)break;
		}
		
		if(i==5) System.out.println("정원이 꽉 찼습니다.");
		else {
			ar[i] = new MemberDTO01();
			
			System.out.println("1 row created");
		}
	}
	
	public void list() {
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				System.out.println(ar[i]);
			}
		} //for

		
	}
	
	public void update() {
		System.out.print("핸드폰 번호 입력: ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null && ar[i].getPhone().equals(phone)) {
				//수정
				System.out.println(ar[i].getName() + "\t"
								+ ar[i].getAge() + "\t"
								+ ar[i].getPhone() + "\t"
								+ ar[i].getAddress());
				
				System.out.println();
				System.out.print("수정할 이름 입력: ");
				String name = scan.next();
				System.out.print("수정할 나이 입력: ");
				int age = scan.nextInt();
				System.out.print("수정할 핸드폰 입력: ");
				phone = scan.next();
				System.out.print("수정할 주소 입력: ");
				String address = scan.next();
				
				ar[i].setName(name);
				ar[i].setAge(age);
				ar[i].setPhone(phone);
				ar[i].setAddress(address);
				
				System.out.println("1 row deleted");
				
				break;
			}
		} //for
		
		if(i==5) System.out.println("찾는 회원이 없습니다"); 
	}
	
	public void delete() {
		System.out.print("핸드폰 번호 입력: ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null && ar[i].getPhone().equals(phone)) {
				ar = null;
				System.out.println("1 row deleted");
				
				break;
			}
		} //for
		
		if(i==5) System.out.println("찾는 회원이 없습니다"); 
		
	}

}
