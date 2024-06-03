package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
	int big = Math.max(25,36);
	System.out.println("큰값 = " + big);
	
	double small = Math.min(12.3, 78.5);
	System.out.println("작은 값 = " + small);
	System.out.println();
	
	int sum = 2 + 5;
	System.out.println("합 = " + sum);
	int sum2 = '2' -48 + '5'-'0';
	System.out.println("합 = " + sum2); //7
	
	int sum3 = Integer.parseInt("2") + Integer.parseInt("5"); //문자열을 숫자로 바꾸기
	System.out.println("합 = " + sum3);
	
	float a = Float.parseFloat("43.8f");
	double b = Double.parseDouble("43.8");
	System.out.println("합 = " + (a+b));
	
	double c = Math.random();
	System.out.println(c);
	
	int d = (int) (Math.random() *26 + 65); //65 ~90 사이의 난수;
	System.out.println(d);
	System.out.println((char)d);
	
	double e = new Random().nextDouble();
	System.out.println(e);
	
	}

}

/*
 난수 
  -> 컴퓨터가 불규칙하게 발생하는 수
  -> 0 <- 난수 <1
  
  x ~y사이의 난수 발생
  (int) (Math.random() *(y-x+1) + x)
 */
