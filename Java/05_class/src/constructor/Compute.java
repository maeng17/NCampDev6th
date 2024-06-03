package constructor;

public class Compute {
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;
	
	public Compute(int x, int y) { //this 반드시 기입. 
		this.x = x;
		this.y = y;
	}
	
	public void calc() { //this 쓸 필요 없음. 
		sum = x+y;
		sub = x-y;
		mul = x*y;
		div = (double)x/y;
		
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getSum() {return sum;}
	public int getSub() {return sub;}
	public int getMul() {return mul;}
	public double getDiv() {return div;}

}
