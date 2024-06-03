package collection;

public class GenericMain2<T> {
	private T a;
	
	public GenericMain2(T a) {
		this.a =a;
	}

	
	public T getA() {
		return a;
	}


	public void setA(T a) {
		this.a = a;
	}


	public static void main(String[] args) {
		GenericMain2<?> aa = new GenericMain2<String>("홍길동");
		//aa.setA("홍길동"); //반드시 데이터는 setter가 아니라 생성자를 통해서 넣어야 한다
		
		String name = (String)aa.getA();
		
		System.out.println("이름 = " + name);
		
		GenericMain2<?> bb = new GenericMain2<Integer>(25);
		
		int age = (Integer) bb.getA(); //AutoUnBoxing
		
		
		System.out.println("나이 = " + age);
		
		
	}

}
