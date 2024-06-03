package class_;

//1인분
public class SalaryDTO {
	private String name, job;
	private int basic, extra, total, rate, salary ;
	
	
	public void setData (String n, String j, int b, int e) {
		name = n;
		job = j;
		basic = b;
		extra = e;
	}
	
	public void calc() {
		total = basic + extra;
		
		double t_rate = (total >= 5000000) ? 0.03: (total >= 3000000)? 0.02: 0.01;
		rate = (int) (total * t_rate);
		
		salary = total - (int) rate;
	}
	
	public String getName() {
		return name;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getBasic() {
		return basic;
	}
	
	public int getExtra() {
		return extra;
	}
	
	public int getTotal() {
		return total;
	}
	
	public int getRate() {
		return rate;
	}
	
	public int getSalary() {
		return salary;
	}
	
}
