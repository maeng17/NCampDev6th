package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		//Zoo클래스에서 tiger()메소드 호출
		Zoo z = new Zoo();
		z.tiger();
		// z.giraffe(); - error
		//z.elephant(); - error
		//z.lion(); -error

	}

}
