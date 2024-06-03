package homework;

//1인분
public class MemberDTO {
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public void name (String name) {
		this.name = name;
	}
	
	public void age (int age) {
		this.age = age;
	}
	
	public void phone (String phone) {
		this.phone = phone;
	}
	
	public void address (String address) {
		this.address = address;
	}
	
	

	public void replaceName(String name2, String name3) {
		this.name.replace(name2, name3);	
	}
	
	public void replacePhone(String phone2, String phone3) {
		this.phone.replace(phone2, phone3);	
	}
	
	public void replaceAddress(String address2, String address3) {
		this.address.replace(address2, address3);	
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public String getPhone() {return phone;}
	public String getAddress() {return address;}
	
	
	
		
}
