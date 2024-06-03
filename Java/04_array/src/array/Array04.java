package array;

public class Array04 {

	public static void main(String[] args) {
		int[] ar = new int[10];
		int max, min;
		
		for (int i=0; i<ar.length; i++) {
			int ran = (int) (Math.random()*100+1);
			ar[i] = ran;
			
		}
		
		max = min = ar[0];
		for (int i=1; i<ar.length; i++) {
			if (max < ar[i]) max = ar[i];
		
			if (min > ar[i]) min = ar[i];
		}
		
		for (int data : ar) {
			System.out.print(data + " ");
			
		}
		System.out.println();
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

	}

}

/*
[문제] 1~100 난수를 발생하여 배열에 저장 후 데이터를 출력하고 최대값, 최소값을 구하시오.

[실행결과]
35	57	22	13	67	~~~	30
최대값 = xx
최소값 = xx
*/