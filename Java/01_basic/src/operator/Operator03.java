package operator;

public class Operator03 {

	public static void main(String[] args) {
		int a = 5;
		a += 3;
		a *= 2;
		System.out.println("a = " + a); // a=16
		
		++a;
		System.out.println("a = " + a);
		
		int b =a++;
		System.out.println("a = " + a + " b = " + b); //a=18 , b=17
		
		int c = ++a - b--;
		System.out.println("a = " + a + " b = " + b + " c = " + c);

		System.out.println("a = " + a++); //19
		System.out.println("a = " + a);  //20 
		

	}

}
