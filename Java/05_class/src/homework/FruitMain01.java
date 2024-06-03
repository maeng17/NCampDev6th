package homework;

public class FruitMain01 {

	public static void main(String[] args) {
		/*
		Fruit01 aa = new Fruit01("사과", 100, 80, 75);
		Fruit01 bb = new Fruit01("포도", 30, 25, 10);
		Fruit01 cc = new Fruit01("딸기", 25, 30, 90);
		
		
		Fruit01[] ar = new Fruit01[3];
		ar[0] = new Fruit01("사과", 100, 80, 75);
		ar[1] = new Fruit01("포도", 30, 25, 10);
		ar[2] = new Fruit01("딸기", 25, 30, 90);
		*/
		// 위 아래 둘다 같음
		Fruit01[] ar = {new Fruit01("사과", 100, 80, 75),
				new Fruit01("포도", 30, 25, 10),
				new Fruit01("딸기", 25, 30, 90)};
		
		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");
		for (int i=0; i<ar.length; i++) {
			ar[i].calcTot();
			ar[i].disp();
		}
		System.out.println("-----------------------------------");
		Fruit01.output();
		
	}

}
