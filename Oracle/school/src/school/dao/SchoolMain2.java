package school.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolMain2 {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	public SchoolMain2() {
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
	
	public void menu() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("""
					**********************
						관리
					**********************
						1. 입력
						2. 검색
						3. 삭제
						4. 종료
					**********************
						번호선택 :	""");
			num = scan.nextInt();
			
			if (num ==4) break;
			if(num == 1) insertArticle();
			else if(num == 2) selectArticle();
			else if(num == 3) deleteArticle();
			
		}//while
	} //menu
	
	public void deleteArticle() { //클래스가 하나밖에 없기 때문에 private해도 상관없음
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제를 원하는 이름 입력 : ");
		String name = scan.next();
		
		// DB - delete
		getConnection(); //접속

		String sql = "delete from school where name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			
			int su = pstmt.executeUpdate(); // 실행
			System.out.println(su + "개의 행이 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null)pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public void selectArticle() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println(" 1. 이름검색");
			System.out.println(" 2. 전체검색");
			System.out.println(" 3. 이전 메뉴");
			System.out.println("**************");
			System.out.print(" 번호선택  : ");
			num = scan.nextInt();
			
			if(num == 3) break;
			
			//데이터 
			String name = null;
			if(num == 1) {
				System.out.println("검색할 이름 입력");
				name = scan.next();
			} //if
			
			//DB - select
			getConnection(); //접속
			
			String sql = null;
			if (num==1)
				sql = "select * from school where name like ?";
			else if(num ==2)
				sql = "select * from school";
			
			try {
				pstmt = conn.prepareStatement(sql);
				
				//?에 데이터 대입
				if(num == 1) pstmt.setString(1, "%" + name + "%");
				
				rs = pstmt.executeQuery(); //실행
				
				while(rs.next()) {
					System.out.print("이름 = " + rs.getString("name") + "\t");
					if(rs.getInt("code") == 1)
						System.out.println("학번 = " + rs.getString("value"));
					else if(rs.getInt("code") == 2)
						System.out.println("과목 = " + rs.getString("value"));
					else if(rs.getInt("code") == 3)
						System.out.println("부서 = " + rs.getString("value"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
			
		} //while
		
	}

	public void insertArticle() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("""
					**********************
						1. 학생
						2. 교수
						3. 관리자
						4. 이전메뉴
					**********************
						번호선택 :	""");
			num = scan.nextInt();
			
			if (num ==4) break;
			
			//데이터
			System.out.print("이름 입력 : ");
			String name = scan.next();
			String value = null;
			if (num == 1) {
				System.out.print("학번 입력 : ");
				value = scan.next();
			}
			else if (num == 2) {
				System.out.print("과목 입력 : ");
				value = scan.next();
			}
			else if (num == 3) {
				System.out.print("부서 입력 : ");
				value = scan.next();
			}
			
			//DB - insert
			getConnection();
			
			String sql = "insert into school values(?, ?, ?)";
			
			try {
				pstmt = conn.prepareStatement(sql);
				
				//?에 데이터 대입
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, num);
				
				int su = pstmt.executeUpdate(); //실행
				System.out.println(su + "행이 삽입되었습니다.");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
		}//while
		
	} //insertArticle
	
	


	public static void main(String[] args) {
		SchoolMain2 schoolMain2 = new SchoolMain2();
		schoolMain2.menu();
		System.out.println("프로그램을 종료합니다.");
				
	} //(String[] args)

}
