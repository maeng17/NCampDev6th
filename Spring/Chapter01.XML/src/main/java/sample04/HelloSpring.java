package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample03.MessageBean;

public class HelloSpring {

	public static void main(String[] args) {
		
		//Calc calcAdd = new CalcAdd();
		//Calc calcMul = new CalcMul();
		//calcAdd.calculate(25, 36);
		//calcMul.calculate(25, 36);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc;
		
		calc = (Calc)applicationContext.getBean("calcAdd");
		calc.calculate(25, 36);
		
		calc = applicationContext.getBean("calcMul", Calc.class);
		calc.calculate(25, 36);
	}

}
