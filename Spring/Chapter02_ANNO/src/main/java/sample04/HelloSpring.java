package sample04;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HelloSpring {

	public void menu(ApplicationContext applicationContext) {
		Scanner scan = new Scanner(System.in);
		int num;
		SungJuk sungJuk = null;
		
		while(true) {
			System.out.println();
			System.out.println("****************");
			System.out.println(" 1. 입력");
			System.out.println(" 2. 출력");
			System.out.println(" 3. 수정");
			System.out.println(" 4. 삭제");
			System.out.println(" 5. 끝");
			System.out.println("****************");
			System.out.print(" 번호 : ");
			num = scan.nextInt();
			
			if(num == 5) break;
			if(num == 1) 
				sungJuk = (SungJuk) applicationContext.getBean("sungJukInput");
			else if(num == 2) 
				sungJuk = (SungJuk) applicationContext.getBean("sungJukOutput");
			else if(num == 3) 
				sungJuk = (SungJuk) applicationContext.getBean("sungJukUpdate");
			else if(num == 4) 
				sungJuk = (SungJuk) applicationContext.getBean("sungJukDelete");
			
			sungJuk.execute();
			
		} //while
		
	}

	public static void main(String[] args) {
		//HelloSpring helloSpring = new HelloSpring();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		
		helloSpring.menu(applicationContext);
		System.out.println("프로그램을 종료합니다.");

	}

}
