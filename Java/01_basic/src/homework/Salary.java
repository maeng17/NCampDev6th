package homework;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("직급 입력: ");
		String position = scan.next();
		System.out.print("기본급 입력: ");
		int pre_salary = scan.nextInt();
		System.out.print("수당 입력: ");
		int extra = scan.nextInt();
		
		int tot = pre_salary + extra;
		
		double tax_rate = (tot >= 5000000) ? 0.03: (tot >= 3000000)? 0.02: 0.01;
		double tax = tot * tax_rate;
		
		double salary = tot - tax;
		salary = (int)salary;
		
		DecimalFormat decFormat = new DecimalFormat("###,###");
		String pre_salary1 = decFormat.format(pre_salary);
		String tot1 = decFormat.format(tot);
		String tax1 = decFormat.format(tax);
		String salary1 = decFormat.format(salary);
		
		
		System.out.println("*** " + name + " " + position + " 월급 ***");
		System.out.println("기본급 : " + pre_salary1 +"원" );
		System.out.println("합계 : " + tot1 +"원" );
		System.out.println("세금 : " + tax1 +"원" );
		System.out.println("월급 : " + salary1 +"원" );
		
		/*강사님 풀이
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("직급 입력 : ");
		String job = sc.next();
		System.out.println("기본급 입력 : ");
		int basic = sc.nextInt();
		System.out.println("수당 입력 : ");
		int extra = sc.nextInt();
		
		int tot = basic + extra;
		
		double rate = 5000000 <= tot ?  0.03 : tot >= 3000000 ? 0.02 : 0.01; //세율
		int tax = (int) (tot * rate);
		int salary = tot - tax;
		
		System.out.println(""+ name + " " + job + " 월급");
		System.out.println("기본급 : " + df.format(basic) + "원");
		System.out.println("수당 : " + df.format(extra) + "원");
		System.out.println("합계 : " + df.format(tot) + "원");
		System.out.println("세금 : " + df.format(tax) + "원");
		System.out.println("월급 : " + df.format(salary) + "원");
		
		*/
		
		
		
	}

}


/*
 [문제] 월급 계산 프로그램 
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오

       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[조건]
단 -  조건 연산자 이용 
1. 합계가 5,000,000원 이상이면 3% (0.03)
       3,000,000원 이상이면 2% (0.02)
       아니면 1% (0.01)
2. 숫자는 세자리 마다 ',' 표시
3. 소수 이하는 표시하지 않는다.

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
 */
 