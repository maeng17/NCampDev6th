package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
	private Connection conn; // 모든 메소드가 같이 사용 가능
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	public InsertMain() {
		//Driver Loading
		try {
			Class.forName(driver); //Class 타입으로 생성
			System.out.println("Driver Loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	
	public void InsertArticle() {
		this.getConnection(); //접속	
		
		//데이터
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("나이 입력: ");
		int age = scan.nextInt();
		System.out.print("키 입력: ");
		double height = scan.nextDouble();
		
		
		try {
			String sql = "insert into dbtest(name,age,height, logtime) values(?, ?, ?, sysdate)";
			
			pstmt = conn.prepareStatement(sql);//생성
			
			//?에 데이터 대입
			pstmt.setString(1, name); //SQL은 1부터 시작
			pstmt.setInt(2,age);
			pstmt.setDouble(3, height);
			
			int su = pstmt.executeUpdate(); //실행 - 개수 리턴
			
			
			System.out.println( su + "개의 행이 만들어졌습니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close(); // 없앨때는 거꾸로 없애야한다.
				if(conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InsertMain insertMain = new InsertMain();
		insertMain.InsertArticle();
		
	}

}
