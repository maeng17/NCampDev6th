package homework;

import java.util.Scanner;

public class ExamMain01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("인원 수 입력: ");
		int size = scan.nextInt();
		
		Exam01[] ar = new Exam01[size];
		
		for(int i=0; i<size; i++) {
			ar[i] = new Exam01();
			ar[i].compare();
			System.out.println();
		}
		
		//출력
		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		for (int i=0; i<size; i++) {
			System.out.print(ar[i].getName() + "\t");
			
			for (int j=0; j<ar[i].getOx().length; j++) {
				System.out.print(ar[i].getOx()[j] + "\t");
			}
			System.out.println(ar[i].getScore());
		}
		
		

	}

}
