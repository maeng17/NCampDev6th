package array;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] ar = new boolean[5];
		
		System.out.println("주차장 관리 프로그램");
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("	1. 입차");
			System.out.println("	2. 출차");
			System.out.println("	3. 리스트");
			System.out.println("	4. 종료");
			System.out.println("**************");
			System.out.print("메뉴: ");
			int num = scan.nextInt();
			
			if (num == 1) {
				System.out.print("위치 입력: ");
				int num1 = scan.nextInt();
				
				if (ar[num1-1] == true) 
					System.out.println(num1 + "위치에 입차 / 이미 주차되어 있습니다." );
				else {
					System.out.println(num1 + "위치에 입차 / 주차되어 있지 않습니다." );
					ar[num1-1] = true;
				}
			}
			
			else if (num == 2) {
				System.out.print("위치 입력: ");
				int num2 = scan.nextInt();
				
				if (ar[num2-1] == true) {
					System.out.println(num2 + "위치에 출차 / 이미 주차되어 있습니다." );
					ar[num2-1] = false;
				}
				else 
					System.out.println(num2 + "위치에 출차 / 주차되어 있지 않습니다." );
					
			}
			
			else if (num == 3 )
				for (int i=0; i<ar.length; i++) {
					System.out.println((i+1) + "위치: " + ar[i]);
				}
			
			else break;
		}
		System.out.println("프로그램을 종료합니다.");
		
		/*강사님 풀이
		System.out.println("주차장 관리 프로그램");
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("	1.	입차");
			System.out.println("	2.	출차");
			System.out.println("	3.	리스트");
			System.out.println("	4.	종료");
			System.out.println("**************");
			System.out.print("메뉴: ");
			int num = scan.nextInt();
			
			if (num == 4) break;
			else if (num == 1 ){
				System.out.print("위치 입력: ");
				int pos = scan.nextInt();
				
				if (ar[pos-1]) 
					System.out.println(pos + 이미 주차되어 있습니다." );
				else {
					ar[pos-1] = true;
					System.out.println(pos + "위치에 입차);
				}
			}
			else if (num == 2 ){
				System.out.print("위치 입력: ");
				int pos = scan.nextInt();
			
				if (ar[pos-1]) {
					ar[pos-1] ==false;
					sysout(pos + "위치에 출차");
				}
				else sysout ("주차되어 있지 않습니다.");
			}
			else if (num == 3 ){
				for (int i=0; i<ar.length; i++) {
					System.out.println((i+1) + "위치: " + ar[i]);
			}
			
			
			
			
		}
		*/

	}

}


/*
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/