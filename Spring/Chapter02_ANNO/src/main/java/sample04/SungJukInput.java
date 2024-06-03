package sample04;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	//생성된 빈들 중에서 SungJukDTO2 타입을 찾아서 자동으로 매핑을 해라
	//생성자 또는 Setter 이건 상관없이 SungJukDTO2 타입을 찾아서 자동으로 매핑을 해라
	
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;
	
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" 이름 입력 :");
		String name = scan.next();
		System.out.print("국어 점수 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = scan.nextInt();
		
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		
		//SungJukDTO2 sungJukDTO2 = new SungJukDTO2();
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		//List<SungJukDTO2> list = new ArrayList<SungJukDTO2>();
		list.add(sungJukDTO2);
		
		System.out.println(name + "님의 데이터를 입력하였습니다.");

	}



}
