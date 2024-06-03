package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSearch implements Employee {

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scan.next();
		
		boolean found = false ;
		for (EmployeeDTO employeeDTO : list) {
			if(employeeDTO.getName().equals(name)) {
				found = true;
				System.out.println("사원번호\t이름\t직급\t기본급\t수당\t합계\t세율\t세금\t월급");
				System.out.println(employeeDTO);
				break;
			}		
		}
		if(!found) System.out.println("존재하지 않는 이름입니다.");
			
		
		
		
			
		
	}
	

}
