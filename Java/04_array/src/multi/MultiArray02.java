package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10]; // 방 100개
		int num = 0;
		
		//입력
		/*
		for (int i =0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				num++;
				ar[i][j] = num;  //  순서대로
			}
		}
		*/
		
		/*for (int i =0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				num++;
				ar[j][i] = num;  
			}
		}
		*/
		/*
		int num1 = 101;
		for (int i =0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				num1--;
				ar[j][i] = num1;  
			}
		}
		*/
		
		for (int i =ar.length-1; i>=0; i--) {
			for(int j=ar[i].length-1; j>=0; j--) {
				num++;
				ar[j][i] = num;  
			}
		}

		//출력
		for (int i =0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%5d", ar[i][j]));
				
			}
			System.out.println();
		}
		
		
	}

}