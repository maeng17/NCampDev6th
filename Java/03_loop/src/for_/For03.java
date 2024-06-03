package for_;

public class For03 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum = sum + i;
			
			System.out.println(i + "\t" + sum);
		}
		System.out.println();
		
		int mul = 1; // 곱하기의 경우 1을 줘야함
		for (int i =1; i<=10; i++) {
			mul = mul * i;
			System.out.println(i + "\t" + mul);
					
			
		}

	}

}
