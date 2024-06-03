package homework;

import java.util.Scanner;

public class SungJuk01 {

	public static void main(String[] args) {
		// 강사님 풀이
		Scanner scan = new Scanner(System.in);
		int cnt;
		
		System.out.print("인원수 입력: ");
		cnt = scan.nextInt();
		
		String[] name = new String[cnt];
		int subjectCnt;
		String[][] subject = new String[cnt][]; // 인원수 만큼의  subject/ 이름마다 방 부여
		int[][] jumsu = new int[cnt][];
		double[] avg = new double[cnt];
		
		System.out.println();
		for (int i =0; i<cnt; i++) {
			System.out.print("이름 입력: ");
			name[i] = scan.next();
			
			System.out.print("과목수 입력: ");
			subjectCnt = scan.nextInt();
			
			subject[i] = new String[subjectCnt];
			for (int j=0; j<subjectCnt; j++) {
				System.out.print("과목명 입력: ");
				subject[i][j] = scan.next();
			} //for j
			
			jumsu[i] = new int[subjectCnt+1]; //총점으로 방 하나 추가
			for (int j=0; j<subjectCnt; j++) {
				System.out.print(subject[i][j] + "점수 입력: ");
				jumsu[i][j] = scan.nextInt();
				
				jumsu[i][subjectCnt] += jumsu[i][j];//총점	
			} //for j
			
			//평균
			avg[i] = (double) jumsu[i][subjectCnt]/subjectCnt;
			
			System.out.println("--------------------");
		}//for i
		
		//출력
		System.out.println();
		for(int i =0; i<cnt; i++) {
			// 타이틀
			System.out.print("이름\t");
			for (int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t");
			}//for j
			System.out.println("총점\t평균");
			
			//데이터
			System.out.print(name[i] + "\t");
			for (int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}//for j
			System.out.println(avg[i]);
		} //for i

	}

}
