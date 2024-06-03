package for_;

import java.io.IOException;

public class For05 {

	public static void main(String[] args) throws IOException {
		int mul = 1;
		
		System.out.print("x: ");
		int x = System.in.read() -48 ;
		System.in.read();
		System.in.read();
		
		System.out.print("y: ");
		int y = System.in.read() -48 ;
		
		for (int i =1; i<=y; i++) {
			mul *=x ;
		}
		System.out.println(x + "의 " + y + "승 " + mul);

	}

}


/*
[문제] x의 y승을 구하시오 (for)

[실행결과]
x : 2
y : 5
2의 5승 xx

or 

x : 3
y : 4
3의 4승 xx
*/