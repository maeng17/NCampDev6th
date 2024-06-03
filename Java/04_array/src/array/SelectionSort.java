package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {35,48,25,72,50};
		
		System.out.println("정렬 전: ");
		for (int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		//Selection Sort
		
		for (int i=0; i<ar.length-1; i++) {
			for (int j =i+1; j<ar.length; j++) {
				if (ar[i] > ar[j]) { //부등호 바꾸면 오름 -> 내림으로 바뀜
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				} //if
			} //for j
		} //for i
		
		System.out.println("정렬 후: ");
		for (int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();

	}

}

/*
정렬
- 오름차순(ASCENDING): 1,2,3,..
- 내림차순(DESCENDING): 10,9,8,...
*/