package homework;

import java.io.IOException;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		int b, s;
		String yn;
		
		// com 난수 발생
		for (int i=0; i<com.length; i++) {
			com[i] = (int) (Math.random()*9+1);
			
			for (int j=0; j<i; j++) {
				if (com[i]==com[j]) {
					i--;
					break;
				} //if
			}//for j
		}//for i
		
		while(true) {
			do {
				System.out.print("게임을 실행하시겠습니다(Y/N): ")  ;
				yn =scan.next();
			} while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("n") && !yn.equals("N"));
			
			if (yn.equals("n") || yn.equals("N")) 
				break;
			else if (yn.equals("y") || yn.equals("Y"))
				System.out.println("게임을 시작합니다.");
			
			System.out.println();
			

			
			for (int data : com) {
				System.out.print(String.format("%4d", data));
			}
			System.out.println();
			
			while (true) {
				System.out.print("숫자 입력: ");
				for (int i=0; i<user.length; i++) {
					user[i]=System.in.read()-48;
				}
				
				for (int j=0; j<com.length;j++) {
					for(int k=0; k<user.length; k++) {
						b=0;
						s=0;
						if (com[0] == user[0]) s++;
						if (com[0] == user[1]) b++;
						if (com[0] == user[2]) b++;
						
						if (com[1] == user[0]) b++;
						if (com[1] == user[1]) s++;
						if (com[1] == user[2]) b++;
					
						if (com[2] == user[0]) b++;
						if (com[2] == user[1]) b++;
						if (com[2] == user[2]) s++;
					
						System.out.println(s+ "스트라이크 " + b + "볼");
						System.out.println();
						if (s==3) break;
					}
				}
												
				
			} //while
			
		} //while
		System.out.println("프로그램을 종료합니다.");
		
	}

}


/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123

0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
*/