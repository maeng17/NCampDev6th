package homework;


import java.util.Scanner;


public class Exam {
	private int num;
	private String name;
	private String dap;
	private char[] ox;
	private int score =0;
	private final String JUNG = "11111";
	
	public Exam() {
		Scanner scan =new Scanner(System.in);
		System.out.print("인원 수 입력: ");
		num = scan.nextInt();
		
		for (int i=0; i<num; i++) {
			System.out.print("이름 입력: ");
			name = scan.next();
			System.out.print("답 입력: ");
			dap = scan.next();
		}
		
	}
	
	public void compare() {
		ox = new char[5];
		for(int i=0; i<dap.length(); i++) {
			if(JUNG.charAt(i)== dap.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}	
			else ox[i] = 'X';
			System.out.print(ox[i]);
			System.out.println(score);
			
		}
	}
	
	public int getNum() {return num;}
	public String getName() {return name;}
	public char[] getOx() {return ox;}
	public int getScore() {return score;} 
	




}