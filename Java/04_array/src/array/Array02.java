package array;

public class Array02 {

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" +i +"] = " + args[i]);
			System.out.println("문자열의 크기: " + args[i].length());
			System.out.println("첫번째 문자 = " + args[i].charAt(0));
			System.out.println("마지막 문자 = " + args[i].charAt(args[i].length()-1));
			System.out.println();
		}//for i
		
		System.out.println("확장 for문");
		for( String data: args ) {
			System.out.println(data);
		}
		
		

	}

}
