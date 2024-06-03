package homework;

public class SungJuk {

	public static void main(String[] args) {
	String name = "L";
	int kor = 85;
	int eng = 90;
	int math = 100;
	
	int tot = kor + eng + math;
	double avg = (double)tot/3;
	
	System.out.println("\t\t\t*** " + name + " 성적표 ***");
	System.out.println("국어\t\t영어\t\t수학\t\t총점\t\t평균");
	System.out.println(kor + "\t\t" + eng + "\t\t" + math + "\t\t" + tot + "\t\t" + String.format("%.3f",avg));
	
	
	//강사님 풀이
		char name1 = 'L';
		int kor1 = 85, eng1 = 90, math1 = 100;
		
		int tot1 = kor1 + eng1 + math1;
		// double avg1 = (double)tot1 / 3.;
		String avg1 = String.format("%.3f", (double)tot1 / 3.);
		
		System.out.println("\t*** " + name1 + " 성적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		//System.out.println(kor1 + "\t" + eng1 + "\t" + math1 + "\t" + tot1 + "\t" + String.format("%.3f",avg1));
		System.out.println(kor1 + "\t" + eng1 + "\t" + math1 + "\t" + tot1 + "\t" + avg1);
	}

}

/*
[문제] 성적 계산
이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg)을 구하시오

[조건]
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
평균의 소수이하 3째자리까지 출력

[실행결과]
		*** L 성적표 ***
국어		영어		수학		총점		평균
85		90		100		xxx		xx.xxx
*/