package abstract_;

public class AbstractMain extends AbstractTest {
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		AbstractTest at = new AbstractMain(); //상속 후 메인으로 생성
		at.setName("홍길동"); //호출
		System.out.println(at.getName());

	}

}
