package multi;

public class MultiArray03 {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,0}, {4,5,6,0}, {7,8,9,0}, {0,0,0,0}};
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar[i].length-1; j++) { // 마지막 방은 안들어가기 때문에 -1
				ar[i][3] += ar[i][j]; //[0][3]에 더한 값 넣기
				
				ar[3][i] += ar[j][i]; // [3][0]에 더한 값 넣기 1)
				ar[3][j] += ar[j][j]; // 2)
				ar[3][3] += ar[i][j]; // [3][3]에 모두 더한 값 넣기
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
