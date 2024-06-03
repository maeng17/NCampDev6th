package employee;

public class EmployeeDTO implements Comparable<EmployeeDTO> {
	private int no;
	private String name;
	private String position;
	private int basic;
	private int extra;
	private int tot;
	private double rate;
	private int tax;
	private int salary;
	
	public EmployeeDTO() {}
	
	public EmployeeDTO(int no, String name, String position, int basic, int extra) {
		this.no = no;
		this.name = name;
		this.position = position;
		this.basic = basic;
		this.extra = extra;
	}
	
	public void calc() {
		tot = basic + extra;
		rate = (tot > 4000000) ? 0.03: (tot <= 2000000)? 0.01: 0.02;
		tax = (int)(tot * rate);
		salary = tot - tax;
				
	}
	

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return no + "\t"
				+ name + "\t"
				+ position + "\t"
				+ basic + "\t"
				+ extra + "\t"
				+ tot + "\t"
				+ rate + "\t"
				+ tax + "\t"
				+ salary + "\t";
	}

	@Override
	public int compareTo(EmployeeDTO e) {
		if (this.salary < e.salary) return 1;
		else if (this.salary > e.salary) return -1;
		else return 0;
	}
	
	
	
	

}
