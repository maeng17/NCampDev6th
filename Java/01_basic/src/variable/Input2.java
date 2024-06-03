package variable;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //static이 없어서 'new'추가 / 키보드에서 입력받아 생성하는 클래스
		
		System.out.print("정수 입력: ");
		int a = scan.nextInt();
		System.out.print("실수 입력: ");
		double b = scan.nextDouble();
		
		System.out.println(a + " + " + b + " + " + (a+b));
		
	}

}
