package homework;

import java.util.Scanner;

public class MemberDTO01 {
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public MemberDTO01() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = scan.next();
		System.out.print("나이 입력: ");
		age = scan.nextInt();
		System.out.print("핸드폰 입력: ");
		phone = scan.next();
		System.out.print("주소 입력: ");
		address = scan.next();
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public String getPhone() {return phone;}
	public String getAddress() {return address;}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name + "\t" + age + "\t" + phone + "\t" + address;
	}

}
