package homework;

import java.util.Scanner;

public class Exam01 {
	private String name;
	private String dap;
	private char[] ox;
	private int score =0;
	private final String JUNG = "11111";
	
	public Exam01() {
		Scanner scan =new Scanner(System.in);
		
			System.out.print("이름 입력: ");
			this.name = scan.next();
			System.out.print("답 입력: ");
			this.dap = scan.next();
			
			ox = new char[5]; //5 대신 JUNG.length()
	}
	
	public void compare() {
		for(int i=0; i<dap.length(); i++) {
			if(JUNG.charAt(i)== dap.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}	
			else ox[i] = 'X';
		}
	}
	
	public String getName() {return name;}
	public char[] getOx() {return ox;}
	public int getScore() {return score;} 
	
	

}
