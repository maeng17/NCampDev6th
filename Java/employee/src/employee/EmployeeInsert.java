package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInsert implements Employee {

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사원 번호 입력 : ");
		int no = scan.nextInt();
		
		boolean found = false;
		for(EmployeeDTO employeeDTO : list) {
			if(employeeDTO.getNo() == no) {
				found = true;
				System.out.println("이미 등록된 사원번호 입니다.");
				break;
			} //if	
		}
		
		
		if(!found) {
			System.out.print("이름 입력 : ");
			String name = scan.next();
			System.out.print("직급 입력 : ");
			String position  = scan.next();
			System.out.print("기본급 입력 : ");
			int basic = scan.nextInt();
			System.out.print("수당 입력 : ");
			int extra = scan.nextInt();
					
			EmployeeDTO employeeDTO = new EmployeeDTO(no, name, position, basic, extra);
	
			employeeDTO.calc();
			
			list.add(employeeDTO);
			
			System.out.println("입력되었습니다");	
		}
		
	}

}
