package homework;

import java.io.IOException;
import java.util.Scanner;

public class BaseBall01 {

	public static void main(String[] args) throws IOException {
		//강사님 풀이
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
		int strike, ball;
		
		do {
			System.out.print("게임을 실행하시겠습니따(Y/N): ");
			yn = scan.next();
			
		}while(!yn.equals("Y")&& !yn.equals("y")&& !yn.equals("N")&&!yn.equals("n"));
		
		if (yn.equals("Y")|| yn.equals("y")) {
			System.out.println("\n게임을 시작합니다.");
			
			//난수 발생
			for (int i=0; i<com.length; i++) {
				com[i] = (int) (Math.random()*9+1);
				
				//중복체크
				for (int j=0;j<i;j++) {
					if(com[i]==com[j]) {
						i--;
						break;
					}
				}
			} //for i
			//System.out.println(com[0] + ", " + com[1] + ", " +com[2]);
			
			//사용자 입력
			while(true) {
				System.out.print("\n숫자 입력: ");
				for (int i=0; i<com.length; i++) {
					user[i] = System.in.read()-'0'; 
				}
				System.in.read();
				System.in.read();
				
				// System.out.println(user[0] + ", " + user[1] + ", " +user[2]);
				
				//비교
				strike = ball = 0;
				for(int i=0; i<com.length; i++) {
					for(int j=0; j<user.length; j++) {
						if (com[i]==user[j])
							if(i==j) strike ++;
							else ball++;
					} //for j
				} //for i
				System.out.println(strike + "스트라이트 " + ball + "볼");
				
				if(strike==3) break;
				
			} //while
			
		} //if
		
		System.out.println("프로그램을 종료합니다.");
	}

}
