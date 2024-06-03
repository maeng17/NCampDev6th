package multi;

public class MultiArray04 {

	public static void main(String[] args) {
		//변수
		String [] name = {"홍길동", "프로도", "라이언"};
		int [][] jumsu = new int[][] {{90,95,100,0}, {100,89,76,0}, {75,80,48,0}};
		double [] avg = new double[3];
		char [] grade = new char[3];
		
		//총점, 평균, 학점
		for(int i=0; i<jumsu.length; i++) { //행
			for(int j=0; j<jumsu[i].length-1; j++) { // 마지막 방은 안들어가기 때문에 -1
				jumsu[i][3] += jumsu[i][j]; //총점
			
			} //for j
		
			avg[i] = (double) jumsu[i][3]/3; // 평균
			
			//학점
			if(avg[i]>=90) grade[i]= 'A' ;
			else if(avg[i]>=80) grade[i]= 'B' ;
			else if(avg[i]>=70) grade[i]= 'C' ;
			else if(avg[i]>=60) grade[i]= 'D' ;
			else grade[i] = 'F';
			
		} //for i

		
		//출력
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학	\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		for(int i=0; i<jumsu.length; i++) { //행
			System.out.print(name[i] + "\t");
			
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			} //for j
			System.out.println(String.format("%.2f", avg[i]) + "\t" + grade[i]);
		} //for i
		System.out.println("----------------------------------------------------");
		
		


		

	}

}

/*
[문제] 성적계산
1.공식
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점은 평균이 	90 이상이면 A
			80 이상이면 B
			70 이상이면 C
			60 이상이면 D
그 외는 F
2. 평균은 소수 이하 2째자리 까지 출력
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동		90		95		100
프로도		100		89		76
라이언		75		80		48
----------------------------------------------------
*/
