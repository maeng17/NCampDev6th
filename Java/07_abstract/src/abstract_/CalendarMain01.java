package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarEx01 {
	private int year, month, week, lastDay;
	
	
	public CalendarEx01() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.println();
	}
	
	public void calc() {
		Calendar cal = Calendar.getInstance(); // 시스템 기준으로 클래스 생성 
		
		//기준 변경
		//cal.set(cal.YEAR, year);
		//cal.set(cal.MONTH, month-1); //내가 입력한 년, 월로 바꿈 / 일은 현재 날로 세팅됨
		//cal.set(cal.DAY_OF_MONTH, 1); 
		
		cal.set(year, month-1, 1); //위는 하나씩 바꾸는 것. 이거는 세개 전부 바꾸는 것
		week = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일 구하기
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //월의 마지막 일 구하기
		
	}
	
	public void display() {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i+ "\t");
			
			if(week%7 == 0) System.out.println();
			week++;
		} //for
		System.out.println();
	}
	
	
}


//---------------------------------
public class CalendarMain01 {

	public static void main(String[] args) {
		CalendarEx01 ce = new CalendarEx01();
		ce.calc();
		ce.display();
	}

}
