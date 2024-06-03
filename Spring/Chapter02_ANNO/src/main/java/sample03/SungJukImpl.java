package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {
	//생성된 빈들 중에서 SungJukDTO를 찾아서 자동으로 매핑해라
	//생성자이건 Setter 이건 상관없이 sungJukDTO를 찾아서 자동으로 매핑해라
	@Autowired
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
