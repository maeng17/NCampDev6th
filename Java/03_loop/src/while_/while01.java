package while_;

public class while01 {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10 
		
		int i =1;
		while (i<=10) {
			System.out.print(i + "  "); //1 2 
			i++; // 2 3
		}
		System.out.println();
		
		
		// 1 2 3 4 5 6 7 8 9 10 
		int j =0;
		while (j<10) {
			j++;
			System.out.print(j + "  ");
		}
		System.out.println();
		
		// 1 2 3 4 5 6 7 8 9 10 
		int k =0;
		while (true) { //무한루프, for(;;)
			k++;
			System.out.print(k + "  ");
			if(k ==10) break; //while을 벗어나라
		}
		

	}

}
