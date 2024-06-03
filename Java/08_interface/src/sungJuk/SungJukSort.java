package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
public class SungJukSort implements SungJuk {
ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		Collections.sort(list);
		
	
		while(true) {
			Scanner scan = new Scanner(System.in);
			int num;
			

			System.out.println("-------------");
			System.out.println("\t1. 총점으로 내림차순");
			System.out.println("\t2. 이름으로 내림차순");
			System.out.println("\t3. 이전 메뉴");
			System.out.println("-------------");
			System.out.print("번호 : ");
			num = scan.nextInt();
			
			if (num == 1 ) {
				for(SungJukDTO sungJukDTO : list) {
					System.out.println(sungJukDTO);
				} //for
			}
			else if (num == 3) break;
			} //while
			
		
		
	}
	
	
}
*/

//강사님 풀이
public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num;
		
	
		while(true) {
			System.out.println("\t1. 총점으로 내림차순");
			System.out.println("\t2. 이름으로 오름차순");
			System.out.println("\t3. 이전 메뉴");
			System.out.println("--------------------");
			System.out.print("번호 : ");

			num = scan.nextInt();
			if (num == 3) break; // excute가 끝나서 제자리로(service)로 이동
			if (num == 1 ) {
				Collections.sort(list);
				
			} else if(num == 2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						return s1.getName().compareTo(s2.getName());
					}
				};
			}
			
			//출력
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			for(SungJukDTO sungJukDTO : list) {
				System.out.println(sungJukDTO);
			} //for
			
			
		} //while
			
		
		
	}
	
	
}


