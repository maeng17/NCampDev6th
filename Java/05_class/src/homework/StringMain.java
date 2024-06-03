package homework;

import java.util.Scanner;

class string{
	private String num, num1, num2;
	private int count = 0;
	private int index = 0;
	Scanner scan = new Scanner(System.in);
	
	public string() {
		System.out.print("문자열 입력 : ");
		num = scan.next();
		num = num.toLowerCase();
		
		System.out.print("현재 문자열 입력 : ");
		num1 = scan.next();
		System.out.print("바꿀 문자열 입력 : ");
		num2 = scan.next();
		
	}
	public void str() {
		while ((index = num.indexOf(num1, index + num1.length())) != -1 ) { 
			count++;
		}
		if ((index = num.indexOf(num1, num1.length())) == -1 )  {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			System.out.println("치환할 수 없습니다.");
				
		}
		
		
		System.out.println(num.replaceAll(num1, num2));		
		System.out.println(count + "번 치환");

	}
}

public class StringMain {

	public static void main(String[] args) {
		string aa = new string();
		aa.str();
		

	}

}


/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
*/