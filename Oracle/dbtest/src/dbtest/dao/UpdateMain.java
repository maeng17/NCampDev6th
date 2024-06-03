package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	public UpdateMain() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void UpdateArticle() {
		getConnection(); //접속 this.유무 상관없음
		
		//데이터
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 이름 입력: ");
		String name = scan.next();
		
		try {
			String sql = "update dbtest set age = age+1, height = height+1 where name like ? ";
			pstmt = conn.prepareStatement(sql); //생성
			
			pstmt.setString(1, '%' + name + '%');

			
			int su = pstmt.executeUpdate(); //실행
			System.out.println(su + "개의 행이(가) 업데이트 되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
	}
	
	

	public static void main(String[] args) {
		UpdateMain updateMain = new UpdateMain();
		updateMain.UpdateArticle();

	}

}

/*
이름에 홍이 들어가면 나이, 키 1씩 증가
 */
