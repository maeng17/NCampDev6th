package class_;

class Person{
	private String name; //필드, 초기화
	private int age;
	
	public void setName (String n) {
		name = n;
	}
	public void setAge (int a) {
		age = a;
	}
	
	public void setData (String n, int a ) { //오버로드
		name = n;
		age = a;
	}
	
	public void setData () {} //오버로드
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}


//----------------------------
public class PersonMain {
	
	
	public static void main(String[] args) {
		Person aa = new Person(); // 생성
		System.out.println("객체 aa = " + aa);
		
		aa.setName("홍길동"); //호출
		aa.setAge(25);

		System.out.println(aa.getName() + "\t" + aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		System.out.println("객체 bb = " + bb);
		
		bb.setName("코난");
		bb.setAge(13);
		
		System.out.println(bb.getName() + "\t" + bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		System.out.println("객체 cc = " + cc);
		cc.setData("라이언", 30);
		
		System.out.println(cc.getName() + "\t" + cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		System.out.println("객체 dd = " + dd);
		dd.setData();
		
		System.out.println(dd.getName() + "\t" + dd.getAge());
		System.out.println();
		
	}

}
