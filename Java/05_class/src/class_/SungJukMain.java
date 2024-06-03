package class_;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		
		aa.setData("홍길동", 90, 96, 100);
		aa.calc();
		
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		System.out.println(aa.getName() + "\t" 
						+ aa.getKor() + "\t" 
						+ aa.getEng() + "\t" 
						+ aa.getMath() + "\t" 
						+ aa.getTot() + "\t" 
						+ aa.getAvg() + "\t" //String.format("%.2f", aa,getAvg()
						+ aa.getGrade());
		
		//----------------------------------------------
		SungJuk bb = new SungJuk();
		
		bb.setData("라이언", 80, 65, 72);
		bb.calc();

		System.out.println(bb.getName() + "\t" 
						+ bb.getKor() + "\t" 
						+ bb.getEng() + "\t" 
						+ bb.getMath() + "\t" 
						+ bb.getTot() + "\t" 
						+ bb.getAvg() + "\t" //String.format("%.2f", aa,getAvg()
						+ bb.getGrade());
		
		//----------------------------------------------
			SungJuk cc = new SungJuk();
			
			cc.setData("프로도", 70, 68, 52);
			cc.calc();

			System.out.println(cc.getName() + "\t" 
							+ cc.getKor() + "\t" 
							+ cc.getEng() + "\t" 
							+ cc.getMath() + "\t" 
							+ cc.getTot() + "\t" 
							+ cc.getAvg() + "\t" //String.format("%.2f", aa,getAvg()
							+ cc.getGrade());

	}

}

/*
[문제] 성적처리
- 평균은 소수 이하 둘째자리까지 처리한다.

클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
	   getName()
	   getKor()
	   getEng()
	   getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동		90		96		100

*/