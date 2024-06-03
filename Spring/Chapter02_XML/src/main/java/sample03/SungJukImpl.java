package sample03;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class SungJukImpl implements SungJuk {
	@NonNull
	private SungJukDTO sungJukDTO;
	
	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath());
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);

	}

	@Override
	public void display() {
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println(sungJukDTO);

	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("국어 입력: ");
		int kor = scan.nextInt();
		System.out.print("영어 입력: ");
		int eng = scan.nextInt();
		System.out.print("수학 입력: ");
		int math = scan.nextInt();
		
		sungJukDTO.setName(name);
		sungJukDTO.setKor(kor);
		sungJukDTO.setEng(eng);
		sungJukDTO.setMath(math);

	}

}
