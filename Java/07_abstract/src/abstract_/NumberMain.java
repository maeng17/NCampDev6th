package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); - 추상이기 때문에 error
		NumberFormat nf = new DecimalFormat(); // 부모 = 자식, sub class를 이용하여 클래스 생성
		//3자리 마다 ',' 찍고, 소수이하 3째 자리
		System.out.println(nf.format(1234567.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효숫자가 아닌 것을 표현하지 않는다.
		System.out.println(nf2.format(1234567.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0을 강제로 표시
		System.out.println(nf3.format(1234567.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 =  NumberFormat.getInstance(); //메소드를 이용하여 클래스 생성
		NumberFormat nf4 =  NumberFormat.getCurrencyInstance(); // ₩표시(나라별 통화기호 표시)
		nf4.setMaximumFractionDigits(2); //소수이하 2째 자리
		nf4.setMinimumFractionDigits(2); //0을 강제로 표시
		System.out.println(nf4.format(1234567.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		//NumberFormat nf5 =  NumberFormat.getInstance(Locale.US); //메소드를 이용하여 클래스 생성
		NumberFormat nf5 =  NumberFormat.getCurrencyInstance(Locale.US); // $ 표시
		nf5.setMaximumFractionDigits(2); //소수이하 2째 자리
		nf5.setMinimumFractionDigits(2); //0을 강제로 표시
		System.out.println(nf5.format(1234567.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}

}
