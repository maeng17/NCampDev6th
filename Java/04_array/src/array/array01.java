package array;

public class array01 {

	public static void main(String[] args) {
		//고정 길이
		int []ar; //배열 선언
		ar = new int[5]; //생성
	
		ar[0] = 25;
		ar[1] = 43;
		ar[2] = 30;
		ar[3] = 27;
		ar[4] = 52;
	
		System.out.println("배열명 ar = " + ar); //클래스명 @ 16진수
		System.out.println("배열 크기 = " + ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		} //for i
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for (int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		System.out.println("홀수 데이터만 출력");
		for (int i=0; i<ar.length; i++) {
			if (ar[i]%2 == 1)
				System.out.println("ar[" + i + "] = " + ar[i]);
		}
		System.out.println();
		
		System.out.println("확장 for문");
		for(int data:ar) {
			System.out.println(data);
		}
		
		
	}

}
