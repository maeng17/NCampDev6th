package employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDelete implements Employee {

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 사원 번호 입력 : ");
		int no = scan.nextInt();
		int count = 0;
		
		Iterator<EmployeeDTO> it = list.iterator();
		while(it.hasNext()) {
			EmployeeDTO employeeDTO = it.next();
			
			if (employeeDTO.getNo() == no) {
				it.remove();
				count++;
				System.out.println(no + "사원 번호의 정보가 삭제되었습니다.");
			}
		}
		if (count == 0)
			System.out.println("존재하지 않는 사원 번호 입니다.");
	
		
	}

}
