package homework;

import java.util.Scanner;

public class StringMain01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String inputStr = scan.next().toLowerCase();
		System.out.print("현재 문자열 입력 : ");
		String targetStr = scan.next().toLowerCase();
		System.out.print("바꿀 문자열 입력 : ");
		String changeStr = scan.next().toLowerCase();
		
		if(inputStr.length() < targetStr.length())
			System.out.println("입력한 문자열의 크기가 작습니다.");
		else {
			int index = 0;
			int count = 0;
			
			while((index = inputStr.indexOf(targetStr, index)) !=-1) {
				index += targetStr.length();
				count++;
			}
		
			System.out.println(inputStr.replace(targetStr, changeStr));
			System.out.println(count + "개 치환");
		}
		
		

	}

}
