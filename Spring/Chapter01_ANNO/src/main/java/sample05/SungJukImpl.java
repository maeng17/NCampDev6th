package sample05;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
	}
	
	@Override
	public void calc() {
		tot = kor + eng + math;
		avg = tot/3.0;
	}

	@Override
	public void display() {
		System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f %n", name, kor, eng, math, tot, avg);

	}

}
