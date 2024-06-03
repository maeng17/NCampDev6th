package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		
		System.out.println("천원: " + money/1000 + "장");
		System.out.println("백원: " + money%1000/100 + "개");
		System.out.println("십원: " + money%1000%100 /10 + "개");
		System.out.println("일원: " + money%1000%100%10 + "개");
		
		
		//강사님 풀이
		Scanner scan1 = new Scanner(System.in);
		System.out.print("현금 입력 : ");
		int money1 = scan1.nextInt(); //1234
		
		int thousand = money1 / 1000 ; //1
		int thousand_mod = money1 % 1000; //234
		
		int hundred = thousand_mod / 100 ; //2
		int hundred_mod = thousand_mod % 100; //34
		
		int ten = hundred_mod / 10; //3
		
		int one = hundred_mod % 10; //4
		
		System.out.println("천원: " + thousand + "장");
		System.out.println("백원: " + hundred + "개");
		System.out.println("십원: " + ten + "개");
		System.out.println("일원: " + one + "개");
		
	}

}


/*
문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개
*/