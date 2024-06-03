package method;

public class Method03 {

	public static void main(String[] args) {
		Method03 m = new Method03();
		
		System.out.println("합 = " + m.sum(10,20));
		System.out.println("합 = " + m.sum(10,20,30));
		System.out.println("합 = " + m.sum(10,20,30,40));

	}
	
	public int sum(int...ar) { //인수의 개수를 자유롭게, 내부적으로 배열화
		int hab = 0;
		for (int i=0; i<ar.length; i++) {
			hab += ar[i];
		}
		return hab;
	
	}
	
	
	
	//Overload: 함수명은 똑같고 매개변수는 똑같음.
	/*
	public int sum(int a, int b) { //인수, 매개변수
		return a+b;
	}
	
	public int sum(int a, int b, int c) { //인수, 매개변수
		
		return a+b+c;
	}
	
	public int sum(int a, int b, int c, int d) { //인수, 매개변수
		
		return a+b+c+d;
	}
	*/
	

}
