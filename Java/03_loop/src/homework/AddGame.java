package homework;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, user, count, count1 = 0;
				
		ABC :while(true) {
			count = 0;
			count1 = 0;
			
			for (int i=1; i<=5; i++) {
				a = (int) (Math.random() *90 + 10);
				b = (int) (Math.random() *90 + 10);
				
				for (int j=0; j<=1;) {
					
					System.out.print("[" + i + "]" + a + " + " + b + " = "  );
					user = scan.nextInt();
					
					if (user == a+b) {
						System.out.println("딩동뎅");
						count++;
						count1 += 20;
						break;
					}
					else { j++;
						if (j==1) System.out.println("틀렸다");
						else System.out.println("틀렸다 정답은 " + (a+b));
					}
					
				} //for j
				System.out.println();
				
			} //for i
			System.out.println("당신은 총" + count + "문제를 맞추어서 점수 " + count1 + "점 입니다.");
			System.out.println("");
			
			System.out.println("또 할래? : ");
			String yn = scan.next();
			
			if (yn.equals("y")) continue;
			else 
				if (yn.equals("n")) break;
				else {
					while (true) {
						System.out.println("또 할래? : ");
						yn = scan.next();
						
						if (yn.equals("n")) break ABC;
						if (yn.equals("y")) break;
					}					
					
				}
			
			
		} //while
		System.out.println("프로그램을 종료합니다.");
		
		/*강사님 풀이
		Scanner scan = new Scanner(System.in);
		int a,b, dab, count=0;
		String yn;
		
		while(true) {
		count = 0;
		System.out.println(); 
		
			for (int i=1; i<=5; i++ { //5문제
				a = (int) (Math.random() *90 + 10); //10~99
				b = (int) (Math.random() *90 + 10); //10~99
				
				for (int j=1; j<=2; j++) { //틀리면 1번 더 
					System.out.print("[" + i + "] " + a + " + " + b + " = "  );
					dab = scan.nextInt();
					
					if (dab == a+b) {
					 System.out.println("정답입니다."); 
					 count++; 
					 break;; //for j를 벗어나라
					}
					if(j==2) system.out.println("오답입니다. 정답은 " + (a+b));
					else System.out.println("오답입니다.");
				} //for j
			} //for i
			System.out.println();
			System.out.println("당신은 총" + count + "문제를 맞추어서 점수 " + count*20 + "점 입니다.");
			
			System.out.println();
			do {
				System.out,.print("또할래? Y/n: );
				yn = scan.next();
			} while (!yn.equals("Y") && !yn.equals("y") && !yn.equals("n") && !yn.equals("N"));
			
			
			
			if (yn.equals("n") || yn.equals("N")) break;
			
		} //while
		
		*/
		

	}

}


/*
 [문제] 덧셈 계산 (for, while, 다중 for)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 xx

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

또 할래(Y/N) : a
또 할래(Y/N) : w
또 할래(Y/N) : n

프로그램을 종료합니다.
*/
