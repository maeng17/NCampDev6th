package sample04;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SungJukUpdate implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수정할 이름 입력 : ");
		String name = scan.next();
		
		System.out.println();
		int sw = 0;
		for(SungJukDTO2 sungJukDTO2 : list) {
			if(sungJukDTO2.getName().equals(name)) {
				sw=1;
				
				System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
				System.out.println(sungJukDTO2);
				
				System.out.print("국어 점수 입력 : ");
				int kor = scan.nextInt();
				System.out.print("영어 점수 입력 : ");
				int eng = scan.nextInt();
				System.out.print("수학 점수 입력 : ");
				int math = scan.nextInt();
				
				int tot = kor + eng + math;
				double avg = tot / 3.0;
				
				sungJukDTO2.setKor(kor);
				sungJukDTO2.setEng(eng);
				sungJukDTO2.setMath(math);
				sungJukDTO2.setTot(tot);
				sungJukDTO2.setAvg(avg);
				
				System.out.println("\n" + name + "님의 데이터를 입력하였습니다.");
				
				break; //같은 이름이 없기 때문에 for문을 나간다.
			}//if
		}//for
		
		if(sw == 0)
			System.out.println("찾고자하는 이름이 없습니다.");

	}

}
