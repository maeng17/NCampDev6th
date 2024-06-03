package homework;

import java.io.IOException;

public class OperatorInput {

	public static void main(String[] args)throws IOException {
		
		System.out.print("문자 입력: ");
		int ch = System.in.read();
		
		char result = (ch>=65 && ch <=90) ? (char)(ch+32) : (char)(ch-32);
		System.out.println((char)ch + " -> " + result);
		
		/*강사님 풀이
		char ch;
		
		System.out.print("문자 입력: ");
		ch = (char) System.in.read();
		
		int result = ch>='A' && ch <='Z' ? ch+32 : ch-32;
		
		System.out.println(ch + " -> " + (char)result);
		
		*/
		
		

	}

}

/*
[문제] 문자를 입력하여 대문자이면 소문자로 변경 후 출력하고
만약에 대문자가 아니면 대문자로 변경 후 출력하시오

[조건]
System.in.read(), 조건연산자를 사용하시오

[실행결과]
문자 입력 : T
T -> t

또는 

문자 입력 : e
e -> E
*/
