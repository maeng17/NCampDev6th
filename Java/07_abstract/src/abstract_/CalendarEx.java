package abstract_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
	Scanner scan = new Scanner(System.in);
	private int year, month, firstDay, lastDay;
	private int day = 1;
	private int week;
	
	public CalendarEx() {
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		System.out.println();
	}
	
	public void calc() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day);
		
		firstDay = cal.getMinimum(Calendar.DAY_OF_MONTH);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		week = cal.get(cal.DAY_OF_WEEK);
		
		
		
	}
	
	public void display() {
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");
		
		
		for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }

        for (int i = 1, dayOfWeek = week; i <= lastDay; i++, dayOfWeek++) {
            System.out.print("\t" + i);
            if (dayOfWeek % 7 == 0) { 
                System.out.println();
            }
        }
	}
	

}
