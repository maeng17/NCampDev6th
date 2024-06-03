package method;

public class MethodTest01 {

	public static void main(String[] args) {
		MethodTest01 m = new MethodTest01();
		System.out.println("객체 m = " + m);
		System.out.println("객체 m = " + m.toString()); //주소의 값을 문자열로 처리해서 출력
		
		//호출
		m.display();
		MethodTest01.output();
		m.output();
		output();
		
		
	}
	
	//구현
	public void display() {
		System.out.println("method...");
	}
	
	public static void output() {
		System.out.println("static method...");
	}

}
