package class_2;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.Math.*; //와일드카드(*: all)

import static java.lang.String.format;

import static java.lang.System.out;

import static java.util.Arrays.sort;

public class ImportStatic {

	public static void main(String[] args) {
		System.out.println("난수 = " + random()); // Math.random말고 이런 형식으로 사용 가능
		System.out.println("제곱 = " + pow(3,4));
		
		System.out.println("소수이하 2째자리 = " + format("%.2f", 34.789));
		
		int [] ar = {25, 37, 20, 78, 55};
		sort(ar);//오름차순
		
		for (int data : ar) System.out.print(data + "\t");
		
	}

}
