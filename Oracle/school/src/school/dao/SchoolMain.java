package school.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolMain {
	Scanner scan = new Scanner(System.in);
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	private int code;
	
	public SchoolMain() {
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
		
		while(true) {
			System.out.println("**************");
			System.out.println(" 관리");
			System.out.println("**************");
			System.out.println(" 1. 입력");
			System.out.println(" 2. 검색");
			System.out.println(" 3. 삭제");
			System.out.println(" 4. 종료");
			System.out.println("**************");
			System.out.print(" 번호선택  : ");
			int num = scan.nextInt();
			
			if (num ==4) break;
			else if (num == 1)insertArticle();
			else if (num == 2)selectArticle();
			else if (num == 3)deleteArticle();
					
					
		} //while
	}

	public void insertArticle() {
		getConnection();
		String name = null, value = null;
		
		while(true) {
			System.out.println("**************");
			System.out.println(" 1. 학생");
			System.out.println(" 2. 교수");
			System.out.println(" 3. 관리자");
			System.out.println(" 4. 이전 메뉴");
			System.out.println("**************");
			System.out.print(" 번호선택  : ");
			int num = scan.nextInt();
			
			if (num ==4) break;
			else if (num == 1) {
				System.out.print("이름 입력 : ");
				name = scan.next();
				System.out.print("학번 입력 : ");
				value = scan.next();
				code = 1;
				
			}
			else if (num == 2) {
				System.out.print("이름 입력 : ");
				name = scan.next();
				System.out.print("과목 입력 : ");
				value = scan.next();
				code = 2;
			}
			else if (num == 3) {
				System.out.print("이름 입력 : ");
				name = scan.next();
				System.out.print("부서 입력 : ");
				value = scan.next();
				code = 3;
			}
			
			
			try {
				String sql = "insert into school(name, value, code) values(?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, code);
				
				int su = pstmt.executeUpdate();
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
					
		} //while
	} //insertArticle
	
	public void selectArticle() {
		getConnection();
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println(" 1. 이름검색");
			System.out.println(" 2. 전체검색");
			System.out.println(" 3. 이전 메뉴");
			System.out.println("**************");
			System.out.print(" 번호선택  : ");
			int num = scan.nextInt();
			
			if(num ==3) break;
			if(num == 1) {
				System.out.println("검색할 이름 입력");
				String name = scan.next();
				
				String sql = "select * from school where name like ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					rs = pstmt.executeQuery();
					
					while(rs.next()) {
						System.out.println("이름 = " + rs.getString("name") + "\t");
						
						if (code == 1) System.out.println("학번 = " + rs.getString("value")); 
						else if (code == 2) System.out.println("과목 = " + rs.getString("value")); 
						else System.out.println("부서 = " + rs.getString("value")); 
						
											
					}// while
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(rs != null) rs.close();
						if(pstmt != null) pstmt.close();
						if(conn != null) pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			
				
				}
			} //if
			
			else if (num == 2) {
				String sql = "select * from school";
				try {
					pstmt = conn.prepareStatement(sql); //생성
					
					rs = pstmt.executeQuery(); //실행
					
					
					while(rs.next()) {
						
						System.out.println("이름 = " + rs.getString("name") + "\t");
						
						if (code == 1) System.out.println("학번 = " + rs.getString("value")); 
						else if (code == 2) System.out.println("과목 = " + rs.getString("value")); 
						else System.out.println("부서 = " + rs.getString("value")); 
					}// while
					
				} catch (SQLException e) {
					e.printStackTrace();	
				} finally {
					try {
						if(rs != null) rs.close();
						if(pstmt != null) pstmt.close();
						if(conn != null) pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
				}
			}//else if
		}
			
		
	} //selectArticle()
	
	public void deleteArticle() {
		System.out.println();
		System.out.println("삭제를 원하는 이름 입력: ");
		String name = scan.next();
		
		getConnection();
		try {
			String sql = "delete school where name = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,  name);
			
			int su = pstmt.executeUpdate();
			System.out.println(su + "행이 삭제되었습니다.");
			
			
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
		
	} //deleteArticle
	
	
	
	

	public static void main(String[] args) {
		SchoolMain schoolMain = new SchoolMain();
		schoolMain.menu();
		System.out.println("프로그램 종료합니다.");

	}

}
