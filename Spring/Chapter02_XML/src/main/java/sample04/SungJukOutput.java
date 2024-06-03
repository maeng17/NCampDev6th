package sample04;

import java.util.List;

import lombok.Setter;

public class SungJukOutput implements SungJuk {
	@Setter
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		System.out.println();
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		
		for(SungJukDTO2 sungJukDTO2 : list) {
			System.out.println(sungJukDTO2);
		}//for
	}

}
