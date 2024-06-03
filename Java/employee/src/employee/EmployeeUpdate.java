package employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUpdate implements Employee {

	@Override
	public void execute(ArrayList<EmployeeDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("사원 번호 입력 : ");
		int no = scan.nextInt();
		
		boolean found = false;
		for(EmployeeDTO employeeDTO : list) {
			if (employeeDTO.getNo() == no) {
				found = true;
				System.out.println("사원번호\t이름\t직급\t기본급\t수당\t합계\t세율\t세금\t월급");
				System.out.println(employeeDTO);
				System.out.println();
				
				System.out.print("수정할 직급 입력 : ");
				String position = scan.next();
				System.out.print("수정할 기본급 입력 : ");
				int basic = scan.nextInt();
				System.out.print("수정할 수당 입력 : ");
				int extra = scan.nextInt();
				
				
				employeeDTO.setPosition(position);
				employeeDTO.setBasic(basic);
				employeeDTO.setExtra(extra);
				
				employeeDTO.calc();
				
				System.out.println("수정하였습니다.");
				break;	
			} //if
		}// for
		if (!found) System.out.println("존재하지 않는 사원 번호 입니다.");
		
	}

}
