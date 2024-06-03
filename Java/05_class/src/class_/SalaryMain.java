package class_;

import java.text.DecimalFormat;

public class SalaryMain {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		System.out.println("이름\t직급\t기본급\t\t수당\t\t합계\t\t세율\t\t월급");
		
		SalaryDTO[] ar = new SalaryDTO[3];
		ar[0] = new SalaryDTO();
		ar[1] = new SalaryDTO();
		ar[2] = new SalaryDTO();
		
		ar[0].setData("홍길동", "이사", 4800000, 300000);
		ar[1].setData("송중기", "사원", 2000000, 100000);
		ar[2].setData("아이유", "주임", 2900000, 150000);
		
		for(SalaryDTO data : ar) {
			data.calc();
			
			System.out.println(data.getName() + "\t" 
					+ data.getJob() + "\t" 
					+ df.format(data.getBasic()) + "\t" 
					+ df.format(data.getExtra()) + "\t\t" 
					+ df.format(data.getTotal()) + "\t" 
					+ df.format(data.getRate()) + "\t\t" //String.format("%.2f", aa,getAvg()
					+ df.format(data.getSalary()));
		}

	}

}

/*
[문제] 월급 계산
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[조건]
1. 조건 연산자 이용
합계가 5,000,000원 이상이면 3% (0.03)
     3,000,000원 이상이면 2% (0.02)
     아니면 1% (0.01)
2. 숫자는 3자리마다 , 표시
3. 소수이하는 표시하지 않는다. (정수형)

클래스명 : SalaryDTO
필드 : name, job, basic, extra, total, rate, salary
메소드 : setData(이름, 직급, 기본급, 수당)
       calc() - 합계, 세율, 월급 계산
	   getName()
	   getJob()
	   getBasic()
	   getExtra()
       getTotal()
       getRate()
       getSalary()

클래스명 : SalaryMain

[실행결과]
이름		직급		기본급			수당			합계		세율		월급
홍길동		이사		4,800,000	300,000	
송중기		사원		2,000,000	100,000
아이유		주임		2,900,000	150,000

*/