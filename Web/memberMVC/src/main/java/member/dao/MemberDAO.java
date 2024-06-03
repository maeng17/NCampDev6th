package member.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import member.bean.MemberDTO;

public class MemberDAO {
	private SqlSessionFactory sqlSessionFactory;
	
	private static MemberDAO memberDAO = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return memberDAO;
	}			//위 두개는 DB와 상관없는 싱글톤 생성이므로 냅둔다.
	
	public MemberDAO() {		
		try {
			Reader reader;
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//로그인
		public MemberDTO login(String id, String pwd) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("id", id);
			map.put("pwd", pwd);
			
			SqlSession sqlSession = sqlSessionFactory.openSession(); // 생성
			MemberDTO memberDTO = sqlSession.selectOne("memberSQL.login", map);
			sqlSession.close();
			
			return memberDTO;
	 	}
	
	//아이디 중복체크
	public boolean isExistId(String id){
		SqlSession sqlSession = sqlSessionFactory.openSession(); 
		MemberDTO memberDTO = sqlSession.selectOne("memberSQL.isExistId", id);
		
		boolean exist = false;
		if(memberDTO != null) exist = true;
		
		sqlSession.close();
		return exist;
	}
	
	
	//회원가입
	
	public int write(MemberDTO memberDTO) { //구현
		SqlSession sqlSession = sqlSessionFactory.openSession(); 
		int su = sqlSession.insert("memberSQL.write", memberDTO);
		sqlSession.commit();
		sqlSession.close();
		return su;
	}
	

	public MemberDTO getMember(String id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MemberDTO memberDTO = sqlSession.selectOne("memberSQL.getMember", id);
		sqlSession.close();
		return memberDTO;
	}
	
	//회원정보수정
	public void update(MemberDTO memberDTO) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("memberSQL.update", memberDTO);
		sqlSession.commit();
		sqlSession.close();
	}


	
}
