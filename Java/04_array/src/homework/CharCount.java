package homework;

public class CharCount {

    public static void main(String[] args) {
        char[] a = new char[50];
        int[] count = new int[26];

        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (Math.random() * 26 + 65);

            if (i % 10 == 0 ) {
                System.out.println();
            }
            System.out.print(a[i] + " ");
            
            count[a[i] - 65]++;
        }
        System.out.println();
        System.out.println();

        for (char j = 'A'; j <= 'Z'; j++) {
            System.out.println(j + ": " + count[j - 65]);
        }
        
        /* 강사님 풀이
		
		// 난수 발생
		int[] ar = new int[50];
		int[] count = new int[26];
		
		for (int i = 0; i < a.length; i++) {
			ar[i] = (int) (Math.random() * 26 + 65); //65~90
		} //for i
		
		for(int i =0; i<ar.length; i++) {
			for(int j=0; j.ar.length; j++) {
			if (ar[j] == i+65) count[i]++;
			
			 
			}
		}
		
		//출력
		for (int i = 0; i < a.length; i++) {
			System.out.print(char)ar[i] + " ");
			if((i+1)%10==0) sysout;
		} //for i 
		sysout;
		for (int i=o; i<count.rength; i++) {
			Systen.out.println(((char)i +'A') + " " + count[i])
		}//for i 
        */
        
    }
}

/*
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0  
*/