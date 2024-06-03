package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
			System.out.print("배열 크기 입력: ");
			int size = scan.nextInt();
			
			int[] ar = new int[size];
			
			for (int i=0; i<size; i++) { // size대신 ar.length 도 가능
			System.out.print("ar[" + i + "] 입력: ");
			ar[i] = scan.nextInt();
			sum += ar[i];
			}
			
			for (int data : ar) {
				System.out.print(data + "  ");
			}
			System.out.println();
			System.out.println("합은 " + sum);
	

	}

}


/*
배열 크기 입력: 3

ar[0] 입력:25
ar[1] 입력:12
ar[2] 입력:37

25 12 37
합 = XXX

*/