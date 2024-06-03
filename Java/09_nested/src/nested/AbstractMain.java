package nested;

public class AbstractMain {

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); -- error
		AbstractTest at = new AbstractTest() { //익명 Inner Class
			
			@Override
			public void setName(String name) { //구현
				this.name = name;
			} 
		};
		
		// interface 생성
		InterA in = new InterA() { //interface를 new 하는 것이 아니라 뒤에있는 {}를 new 하는 것
			
			@Override
			public void aa() {}
			
			@Override
			public void bb() {}
		};
		
		// 추상메소드가 없는 추상클래스 생성
		AbstractExam ae = new AbstractExam() {
			//원하는 메소드를 Override
		};
	}

}
