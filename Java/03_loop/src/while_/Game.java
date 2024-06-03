package while_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int com, user, count = 0;
		
		while(true) {
		com = (int) (Math.random() *100 + 1); // while안에 넣어야 새 게임에 새로운 난수 발생
		System.out.println(com);
		System.out.println("1 ~ 100사이의 숫자를 맞추세요");
		count = 0; // 새로운 게임 시작시 count 초기화
		
			while(true) {
				System.out.print("숫자 입력: ");
				user = scan.nextInt();
				count++; //while안에만 들어가 있으면 됨. 입력 받은 다음 숫자 추가하는 방식
					
				if (user == com) {
					System.out.println("딩동뎅..." + count + "번만에 맞추셨습니다."); 
					break; //while을 벗어나라
				} //블록으로 묶어 하나로 취급 and enter 쳐서 구역 만들어줌
				else if(com > user) System.out.println(user + "보다 큰 숫자 입니다.");
				else System.out.println(user + "보다 작은 숫자 입니다.");
			} // while
			System.out.println();
		
		System.out.println("또 할래?(y/n) ");
		String yn = scan.next();
		
		if (yn.equals("n")) break; // 문자열의 비교는 .equals()사용
		} //while
		System.out.println("프로그램을 종료합니다.");
		

	}

}

/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (77)

숫자 입력 : 50
50보다 큰 숫자입니다
숫자 입력 : 80
80보다 작은 숫자입니다.
~
~
숫자 입력 : 77
딩동뎅...x번만에 맞추셨습니다

한 번 더?(y/n): n
프로그램을 종료합니다.

한 번 더?(y/n): y


*/