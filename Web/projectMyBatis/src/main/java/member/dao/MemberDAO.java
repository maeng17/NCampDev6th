package member.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import member.bean.MemberDTO;

public class MemberDAO {
	private SqlSessionFactory sqlSessionFactory;
	
	private DataSource ds;
	
	private static MemberDAO memberDAO = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return memberDAO;
	}
	
	public MemberDAO() {
		try {
			//Reader reader = Resources.getResourceAsReader("mybatis-confug.xml");
			//sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//아이디 중복체크
	public boolean isExistId(String id){
		boolean exist = false;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MemberDTO memberDTO = sqlSession.selectOne("userSQL.isExistId", id);
		sqlSession.close();
		if(memberDTO != null) exist = true;
		return exist;
	}
		
	public int write(MemberDTO memberDTO) { //구현
		int su=0;
		SqlSession sqlSession = sqlSessionFactory.openSession(); //생성
		sqlSession.insert("userSQL.write", memberDTO);
		sqlSession.commit();
		sqlSession.close();
		su = 1;

		return su;
		
	}
	
	
	//로그인
	public List<MemberDTO> login(String id, String pwd) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<MemberDTO> memberDTO = sqlSession.selectList("userSQL.login");
		sqlSession.close();		
		return memberDTO;
 	}
	
	//회원정보수정
	public MemberDTO getMember(String id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MemberDTO memberDTO = sqlSession.selectOne("userSQL.getMember", id);
		sqlSession.close();
		return memberDTO;
	}
	
	//회원정보수정
	public void update(MemberDTO memberDTO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("userSQL.update", memberDTO);
		sqlSession.commit();
		sqlSession.close();
		
	}


	
}
