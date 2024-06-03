package inheritance;

public class SubMain extends Super {
	protected String name;
	protected int age;

	public SubMain() {
		System.out.println("SubMain 기본 생성자");
	}
	
	public SubMain(String name, int age, double weight, double height) {
		super(weight, height);//부모생성자 호출 
		
		System.out.println("SubMain 생성자");
		this.name = name;
		this.age = age;
		
		//this.weight = weight;
		//this.height = height;
		//super.weight = weight; //부모의 참조값을 가짐.
		//super.height = height;
	}
	
	public void output( ) {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		//System.out.println("몸무게 = " + weight);
		//System.out.println("키 = " + height);
		disp(); //호출
	}
	
	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25, 70.3, 176.5); //자식 클래스 생성시 내것과 부모 것 동시에 같이 만듬
		aa.output();
		System.out.println("-------------------");
		
		aa.disp(); //나한테서 찾다가 자연스럽게 부모한테 넘어가서 찾는다.
		System.out.println();
		
		Super bb = new SubMain("코난", 13, 45.8, 153.6);
		//bb.output(); //error
		bb.disp();
		
	}
}
