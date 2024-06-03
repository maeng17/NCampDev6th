package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();
		//z.giraffe(); 
		//z.elephant(); 
		//z.lion(); -error
		
		Safari sa = new Safari();
		sa.tiger();
		sa.giraffe();
		//sa.elephant(); 
		//sa.lion();

	}

}
