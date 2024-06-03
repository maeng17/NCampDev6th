package for_;

public class For01 {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println();
		
		
		int i; // for 구문 위로 변수를 설정할 필요 있음 -> 생존 기간을 길게 잡기 위해
		for(i =1; i<=10; i++) {
			System.out.println("hello: " + i );
		} //for
		
		System.out.println("탈출 i = " +i); //i는 for 구문 안에서만 변수로 남아있음
		System.out.println();
		
		for (i=10; i>=1; i--) { //조건 설정을 잘못하면 바로 빠져나와 아무 표시도 나지 않음
			System.out.print(i+ " ");
		}
		
		System.out.println(); // for구문 안에서 할시에 i 별로 띄움

		for (i='A'; i<='Z'; i++) {
			System.out.print((char)(i) + " ");
		}
		
	}

}
