package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
	private ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		Employee employee = null;
		int num = 0;
		
		while(true) {
			System.out.println();
			System.out.println("-------------");
			System.out.println("\t1. 등록");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 수정");
			System.out.println("\t4. 삭제");
			System.out.println("\t5. 검색");
			System.out.println("\t6. 정렬");
			System.out.println("\t7. 종료");
			System.out.println("-------------");
			System.out.print("번호를 입력하세요 : ");
			num = scan.nextInt();
			
			if (num == 7) break;
			else if( num ==1 ) employee = new EmployeeInsert();
			else if( num ==2 ) employee = new EmployeePrint();
			else if( num ==3 ) employee = new EmployeeUpdate();
			else if( num ==4 ) employee = new EmployeeDelete();
			else if( num ==5 ) employee = new EmployeeSearch();
			else if( num ==6 ) employee = new EmployeeSort();
			
			employee.execute(list);
			
		}// while
			
			
	} //menu

}
