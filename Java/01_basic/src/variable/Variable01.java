package variable;

public class Variable01 {

	public static void main(String[] args) {
		boolean a;
		a = false;
		System.out.println("a = " + a);
		
		char b;
		b = 'A';
		System.out.println("b = " + b);
		
		char c;
		c = 65;
		System.out.println("c = " + c);
		
		int d;
		d = 65;
		System.out.println("d = " + d);
		
		int e;
		e = 'A';
		System.out.println("e = " + e);
		
		long f;
		f = 25L; //25L or 25l. long형 상수라 함
		System.out.println("f = " + f);
		
		float g;
		//g = 43.8; // 43.8은 double형 상수. error
		g = 43.8f; //43.8f or 43.8F 은 float형 상수
		g = (float)43.8; //강제형변환, 잠시 변환
		System.out.println("g = " + g);
		
		
	}

}
