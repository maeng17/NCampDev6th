package sungJuk;

public class SungJukDTO implements Comparable<SungJukDTO> {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	public SungJukDTO() {}
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot/3;
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return no + "\t" 
				+ name + "\t" 
				+ kor + "\t" 
				+ eng + "\t" 
				+ math + "\t" 
				+ tot + "\t" 
				+ String.format("%.2f", avg);
	}

	@Override
	public int compareTo(SungJukDTO s) {
		if (this.tot < s.tot) return 1;
		else if (this.tot > s.tot) return -1;
		else return 0;
	}
	
	
}
