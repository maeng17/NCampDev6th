package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x,y;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x 입력: ");
		x = scan.nextInt();
		System.out.print("y 입력: ");
		y = scan.nextInt();
	}
	
	public void output() {
		int mul = 1;
		
		if(y >= 0) {
			for (int i=1; i<=y; i++) {
				mul *= x;
			} //for
			
			System.out.println(x + "의 " + y + "승은 " + mul);
		} else {
			//System.out.println("y의 값은 0보다 크거나 같아야 한다.");
			
			try {
				//강제로 Exception 발생
				//throw new Exception("y의 값은 0보다 크거나 같아야 한다.");
				throw new MakeException("y의 값은 0보다 크거나 같아야 한다.");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ExceptionMain2 em = new ExceptionMain2();
		em.input();
		em.output();
			
	
		
	

		
		
		

	}

}


/*
[문제] 제곱 연산
- x의 y승을 처리 한다.

[실행결과]
x 입력 : 2
y 입력 : 10			input()
----------------------------------
2의 10승은 xxx        output()
 */