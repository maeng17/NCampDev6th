package sample04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope("prototype")
@Getter
@Setter
public class SungJukDTO2 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;

	@Override
	public String toString() {
		return name + " \t " 
			 + kor + " \t " 
			 + eng + " \t " 
			 + math + " \t " 
		 	 + tot + " \t "
			 + String.format("%.3f", avg);
	}
}
