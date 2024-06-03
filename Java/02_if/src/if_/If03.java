package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = scan.nextInt();
		System.out.print("b의 값: ");
		int b = scan.nextInt();
		System.out.print("c의 값: ");
		int c = scan.nextInt();
		
		if (a>b && a>c && b>c) System.out.println(c + " " + b + " " + a);
		else if (a<b && a>c && b>c) System.out.println(c + " " + a + " " + b);
		else if (a>b && a>c && b<c) System.out.println(b + " " + c + " " + a);
		else if (a>b && a<c && b<c) System.out.println(b + " " + a + " " + c);
		else if (a<b && a<c && b>c) System.out.println(a + " " + c + " " + b);
		else System.out.println(a + " " + b + " " + c);
		
		/* 강사님 풀이
		 if (a<c && a<b) { //a가 가장 작다면
		 	if(b<c) System.out.println(a + " " + b + " " + c);
		 	else System.out.println(a + " " + c + " " + b);
		 }
		 
		 else if (b<c) {  //b가 가장 작다면 'b<a'은 필요 없음(위에서 아니라 이미 말했기 때문) 
		 	if(a<c) System.out.println(b + " " + a + " " + c);
		 	else System.out.println(b + " " + c + " " + a);
		 }
		 
		 else { //위와 마찬가지의 이유로 'if (c<a && c<b)' 필요 없음
		 	if(a<b) System.out.println(c + " " + a + " " + b);
		 	else System.out.println(c + " " + b + " " + a);
		 }
		*/
		
	
		
		
	}

}

/*
 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85

85 90 98

a의 값 : 75
b의 값 : 25
c의 값 : 36

25 36 75
 */
