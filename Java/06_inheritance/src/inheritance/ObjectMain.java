package inheritance;

class Test extends Object { //extends Object 생략가능
	
	@Override
	public String toString() {
		return getClass() +  "@개바부";
	}

	

}

//----------------------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t); //클@16진수
		System.out.println("객체 t = " + t.toString()); //문자열로
		System.out.println("객체 t = " + t.hashCode()); //10진수로 바꿔서
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str); //문자열
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode()); 
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb)); //참조값 비교, false
		System.out.println("aa.equals(bb) : " + aa.equals(bb)); //문자열 비교, true
		System.out.println();
		
		Object cc =new Object();
		Object dd =new Object();
		System.out.println("cc==dd : " + (cc==dd)); //참조값 비교, false
		System.out.println("cc.equals(dd) : " + cc.equals(dd)); //참조값 비교, false
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff)); //참조값 비교, false
		System.out.println("ee.equals(ff) : " + ee.equals(ff)); // 문자열 비교, true
																//오버라이딩으로 인해 자식 값을 받음
		
		
		
	}

}
