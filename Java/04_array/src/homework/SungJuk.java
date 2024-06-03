package homework;

import java.util.Scanner;

public class SungJuk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name;
		String[] subject;
		int[] jumsu;
		int tot=0;
		double avg=0;
		
		// 입력
		System.out.print("인원수: ");
		int cnt= scan.nextInt();
		name = new String [cnt];
		
		for (int i=0; i<name.length; i++) {
			System.out.print("이름 입력: ");
			name[i]= scan.next();
		
		
			System.out.print("과목: ");
			int subjectcnt= scan.nextInt();
			subject = new String[subjectcnt];
			jumsu = new int [subjectcnt];
			
			for (int j=0; j<subject.length; j++) {
				System.out.print("과목명 입력: ");
				subject[j] = scan.next();
			} //for j
			
			for (int k=0; k<subject.length; k++) {
				System.out.print(subject[k] + "점수 입력: ");
				jumsu[k] = scan.nextInt();
			}
			

			
			System.out.print("이름\t" );
			for (int j=0; j<subject.length; j++) {
				System.out.print(subject[j] + "\t");
			}
			System.out.println("총점\t평균");	
			
			for (int j=0; j<name.length; j++) {
				System.out.print(name[j] + "\t");
			}
			
			for (int j=0; j<jumsu.length; j++) {
				System.out.print(jumsu[j] + "\t");
			}
			
			for (int j=0; j<jumsu.length; j++) {
				tot += jumsu[j];
				avg = tot/jumsu.length;
			}
			System.out.print(tot);
			System.out.println("\t" + avg);
			
		} //for i
			

	}

}

/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어	  영어   총점     평균
홍길동    95	  100   xxx	  xx.xx

이름		국어  영어   과학    총점      평균
이기자		95   100   90	 xxx      xx.xx
*/