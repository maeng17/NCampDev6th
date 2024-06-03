package inheritance;

public class Super {
	protected double weight, height;
	
	//2개읜 인수를 받는 생성자를 만드시오
	
	public Super() {
		System.out.println("Super 기본 생성자");
	}
	
	public Super(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	

}
