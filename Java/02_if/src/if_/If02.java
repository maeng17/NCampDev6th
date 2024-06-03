package if_;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("a의 값: ");
		int a = scan.nextInt();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.print("b의 값: ");
		int b = scan1.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("c의 값: ");
		int c = scan2.nextInt();
		
		int avg = (a+b+c) / 3;
		
		if (avg >= 60 & a>=40 & b >= 40 & c >=40) System.out.println("합격");
		else if (avg >= 60) System.out.println("과락으로 불합격"); 
		else System.out.println("불합격");
		
		/* 강사님 풀이
		Scanner scan0 = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a1 = scan0.nextInt();
		System.out.print("b의 값: ");
		int b1 = scan0.nextInt();
		System.out.print("c의 값: ");
		int c1 = scan0.nextInt();
		
		double avg1 = (a+b+c) / 3.;
		
		if (avg1 >=60)
			if (a1>=40 && b1 >= 40 && c1 >=40) System.out.println("합격");
			else System.out.println("과락으로 불합격"); 
		else System.out.println("불합격");
		
		*/
		
		
		

	}

}


/*
 3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85
합격

a의 값 : 98
b의 값 : 90
c의 값 : 35
과락으로 불합격

a의 값 : 68
b의 값 : 50
c의 값 : 45
불합격
 */