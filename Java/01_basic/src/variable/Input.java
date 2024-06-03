package variable;

import java.io.IOException;

public class Input {

	public static void main(String[] args)throws IOException {
		System.out.print("정수 입력: ");
		int a = System.in.read();  //1개의 문자만 받을 수 있음
		System.in.read();  
		System.in.read();  // \r and \n을 읽어 들임
	
		
		System.out.print("정수 입력: ");
		int b = System.in.read();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		

	}

}
