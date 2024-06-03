package class_2;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	public StringBufferMain() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력: ");
		dan = scan.nextInt();
	}
	
	public void display() {
		StringBuffer buffer = new StringBuffer();
		
		for (int i=1; i<10; i++) {
			//System.out.println(dan + "*" + i + " = " + dan*i);
		
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString()); //StringBuffer를  String 변환
			
			buffer.delete(0,buffer.length()); // 각 문자열의 수가 다르므로 길이 구하는 값 이용
		}
	}

	public static void main(String[] args) {
		StringBufferMain sbf =new StringBufferMain();
		sbf.display();
		

	}

}
