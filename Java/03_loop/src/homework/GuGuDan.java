package homework;

public class GuGuDan {

	public static void main(String[] args) {
		int j, i, dan ;
		
		for(j = 0; j < 3; j++) {
			for (i=1; i<=9; i++) {
				
				//for (dan=2; dan < 2 + 3; dan++) {	
				for (dan = 2+j*3; dan < 2+j*3+3 && dan <10; dan++) {
					System.out.print(dan + " * " + i + " = " + (dan*i) + "\t");
					
				} //for dan
				System.out.println();
			} //for i
			
			
			System.out.println();
		}
		
		
		/*강사님 풀이
		int dan, i;
		
		for (int w=2; w<=8; w+=3) { //w=1, w=2, w=3 or w=2,5,8
			for (i=1; i<=9; i++) {
				for (dan=w; dan<=w+2; dan++) {
					if(dan<10)
						System.out.print(dan + " * " + i + " = " + dan*i + "\t");
				} //for dan
			System.out.println();
			
			} //for i
		} for w
		*/

	}

}

/* 구구단 3단씩 나눠서 출력하기
   3중 for, if
21=2   31=3   4*1=4
22=4   32=6   4*2=8
23=6   33=9   4*3=12
24=8   34=12  4*4=16
25=10  35=15  4*5=20
26=12  36=18  4*6=24
27=14  37=21  4*7=28
28=16  38=24  4*8=32
29=18  39=27  4*9=36

51=5   61=6   7*1=7
52=10  62=12  7*2=14
53=15  63=18  7*3=21
54=20  64=24  7*4=28
55=25  65=30  7*5=35
56=30  66=36  7*6=42
57=35  67=42  7*7=49
58=40  68=48  7*8=56
59=45  69=54  7*9=63

81=8   91=9
82=16  92=18
83=24  93=27
84=32  94=36
85=40  95=45
86=48  96=54
87=56  97=63
88=64  98=72
89=72  99=81 
*/
