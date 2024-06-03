package for_;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		
		int dan;
		System.out.print("원하는 단을 입력: ");
		dan = System.in.read() -48 ; //1개 문자이므로 -48로 숫자값을 만들 필요가 있다.
		
		for (int i = 1; i <=9; i++) {
			System.out.println(dan + " * " +  i + " = " + dan*i);
		}
		
		

	}

}

/*
원하는 단을 입력 : 2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
*/