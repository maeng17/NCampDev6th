package board.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.bean.BoardDTO;

public class BoardDAO2 {
	private SqlSessionFactory sqlSessionFactory;
	
	public static BoardDAO2 boardDAO = new BoardDAO2();
	
	public static BoardDAO2 getInstance() {
		return boardDAO;
	}
	
	public BoardDAO2() {
		try {
			Reader reader;
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void boardWrite(Map<String, String> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("boardSQL.boardWrite", map);
		sqlSession.commit();
		sqlSession.close();
	}
	
	public List<BoardDTO> boardList(int startNum, int endNum){
		Map<String, Integer> map = new HashMap<String, Integer>();
		//map.put("startNum", startNum);
		//map.put("endNum", endNum);
		
		map.put("startNum", startNum-1); //시작위치
		map.put("endNum", 5); //개수
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<BoardDTO> list = sqlSession.selectList("boardSQL.boardList", map);
		sqlSession.close();
		
		return list;
	}
	
	public int getTotalA() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int totalA = sqlSession.selectOne("boardSQL.getTotalA"); //집합함수는 int형
		sqlSession.close();
		
		return totalA;
	}

	public BoardDTO getBoard(int seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BoardDTO boardDTO = sqlSession.selectOne("boardSQL.getBoard", seq);
		sqlSession.close();
		return boardDTO;
	}

	public void boardReply(Map<String, String> map) {
		
		//원글
		BoardDTO boardDTO = this.getBoard(Integer.parseInt(map.get("pseq")));

		SqlSession sqlSession = sqlSessionFactory.openSession();
		//step(글순서) update
		//pdate board set step = step + 1 where ref=#{원글 ref} and step > #{원글 step}
		sqlSession.update("boardSQL.boardReplyStep", boardDTO);
		
		//insert
		//Map안에는 id, name, email, subject, content 가지고 왔다. ref, lev, step를 추가함
		map.put("ref", boardDTO.getRef() +""); //답글ref = 원글 ref
		map.put("lev", boardDTO.getLev()+1 +""); //답글lev = 원글 lev+1
		map.put("step", boardDTO.getStep()+1 +""); //답글step = 원글 step+1
		
		sqlSession.insert("boardSQL.boardReply", map);
		
		//reply(답글수) update
		//update board set reply=reply+1 where seq = #{pseq}
		sqlSession.update("boardSQL.boardReplyReply", Integer.parseInt(map.get("pseq")));
		sqlSession.commit();
		sqlSession.close();
	}

	public void boardUpdate(Map<String, String> map) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("boardSQL.boardUpdate", map);
		sqlSession.commit();
		sqlSession.close();
		
	}

	public void boardDelete(int seq) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		

		sqlSession.delete("boardSQL.boardDelete", seq);
		sqlSession.commit();
		sqlSession.close();
		
	}
	
}
