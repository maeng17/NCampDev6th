package homework;

import java.io.IOException;
import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int money = 1000;
		
		while(true) {
			int com = 0;
			
			while (money>0) {
				com = (int) (Math.random() *3 + 1);
				
				System.out.print("가위(1), 바위(2), 보자기(3) 입력 : ");
				int user = scan.nextInt();
				System.out.print("배팅 금액: ");
				int coin = scan.nextInt();
				money -= coin;
				System.out.println("결과를 보시려면 Enter를 치세요");
				int enter = System.in.read();
				
				if (com == 1) {
					System.out.print("컴퓨터는 가위, ");
				
					if (user == 1 )
						System.out.println("나는 가위");
					else if (user == 2)
						System.out.println("나는 바위");
					else 
						System.out.println("나는 보");
				}
				
			
				else if (com == 2) {
					System.out.print("컴퓨터는 바위, ");
					
					if (user == 1 )
						System.out.println("나는 가위");
					else if (user == 2)
						System.out.println("나는 바위");
					else 
						System.out.println("나는 보");
				}

				else {
					System.out.print("컴퓨터는 바위, ");
				
					if (user == 1 )
						System.out.println("나는 가위");
					else if (user == 2)
						System.out.println("나는 바위");
					else 
						System.out.println("나는 보");
				}	
					
				if (com - user ==0) 
					System.out.println("비겼다");
				else if (com-user == -1 || com-user == 2)
					System.out.println("야~호 이겼다");
				else 
					System.out.println("ㅠㅠ. 졌다");
				
				System.out.println("현재 금액은 " + money );
				System.out.println();
				
			} //while
			
			System.out.print("또 할래? : ");
			String sy = scan.next();
		
			if (sy.equals("n")) 
				break;
			else {
				System.out.print("insert coin: ");
				int coin1 = scan.nextInt();
				money += coin1;
				continue;
			}
		} //while
	
		System.out.println("프로그램을 종료합니다.");
		
		/* 강사님 풀이
		Scanner scan = new Scanner(System.in);
		int com, user;
		int money = 1000;
		int batting;
		String yn;
		int coin;
		
		while(true) {
			com = (int) (Math.random() *3 + 1); // 1~3 사이의 난수
			//sysout("com");
			
			System.out.print("가위(1), 바위(2), 보자기(3) 입력 : ");
			int user = scan.nextInt();
			
			do {
				System.out.print("배팅 금액: ");
				batting = scan.nextInt();
				
				if (batting > money) System.out.println("당신의 현재 금액은" + money + "원 입니다.");
				else break; //조건에 따라 추가로 출력값이 있다면 이런 방법으로~
			} while(true);
			
			System.out.println("결과를 보시려면 Enter를 치세요");
			System.in.read();
			System.in.read(); // enter값 기다리기
			
			if (com ==1) { //컴퓨터가 가위
				if (user == 1){
					Systm.out.println("컴퓨터: 가위, 나:가위");
					Systm.out.println("비겼다");
				}
				else if (user == 2);{
					Systm.out.println("컴퓨터: 가위, 나:바위");
					Systm.out.println("이겼다");
					money += batting;
				}
				else if (user == 3);{
					Systm.out.println("컴퓨터: 가위, 나:보자기");
					Systm.out.println("졌다");
					money -= batting;
				}
			}
			else if (com==2) { // 컴퓨터가 바위
				if (user == 1){
					Systm.out.println("컴퓨터: 바위, 나:가위");
					Systm.out.println("졌다");
					money -= batting;
				}
				else if (user == 2);{
					Systm.out.println("컴퓨터: 바위, 나:바위");
					Systm.out.println("비겼다");
				}
				else if (user == 3);{
					Systm.out.println("컴퓨터: 바위, 나:보자기");
					Systm.out.println("이겼다");
					money += batting;
				}
			}
			else if(com==3){ // 컴퓨터 보자기
				if (user == 1){
					Systm.out.println("컴퓨터: 보자기, 나:가위");
					Systm.out.println("이겼다");
					money += batting;
				}
				else if (user == 2);{
					Systm.out.println("컴퓨터: 보자기, 나:바위");
					Systm.out.println("졌다");
					money -= batting;
				}
				else if (user == 3);{
					Systm.out.println("컴퓨터: 보자기, 나:보자기");
					Systm.out.println("비겼다");
				}
			}
			System.out.println("현재 금액은 " + money + "원");
			
			if (money <= 0) { //돈이 0보다 작거나 같으면
				System.out.print()"\n또 할래(Y/N): ");
				yn = scan.next();
				if (yn.equals("n") || yn.equals("N")) break; // while을 벗어나라
				
				System.out.print("insert coin : ");
				coin = scan.nextInt();
				money += coin;
			}
			
		} //while
		
		
		
		
		*/

	}

}

/*
[문제] 가위 바위 보 게임
- 가위(1), 바위(2), 보자기(3)으로 설정한다.
- 컴퓨터는 난수 1 ~ 3 사이의 숫자를 발생한다.
- 기본 금액은 1000원을 기본으로 설정한다.
- 배팅 금액이 현재 금액보다 크면 현재 금액을 알려주고 다시 입력한다.
- 돈이 떨어지면(0 이하이면) 게임을 계속할지 물어보고 계속하려면 현금 입력을 받고 다시 게임을 한다.

[실행결과]
가위(1), 바위(2), 보자기(3) 입력 : 1
배팅 금액 : 1500
당신의 현재 금액은 1000원 입니다.
배팅 금액
결과를 보시려면 Enter를 치세요

컴퓨터 바위, 나는 가위
ㅠㅠ..졌다
현재 금액은 900윈
---------------------

가위(1), 바위(2), 보자기(3) 입력 : 1
배팅 금액 : 100
결과를 보시려면 Enter를 치세요

컴퓨터 보자기, 나는 가위
야~호 이겼다.
현재 금액은 -100윈

또 할래 (y/n) : n
프로그램을 종료합니다.

또는
또 할래 (y/n) : y
insert coin :
 */