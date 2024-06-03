package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void write() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setId("hong");
		boardDTO.setName("허균");
		boardDTO.setSubject("홍길동전");
		boardDTO.setContent("불쌍한 사람들을 도우는 의적!!");
		
//		boardDTO.setId("neo");
//		boardDTO.setName("네오");
//		boardDTO.setSubject("카카오프렌즈");
//		boardDTO.setContent("네오는 고먐미다");
		
		
		//DB
		boardDAO.save(boardDTO); //insert or update
		
	}

	@Override
	public List<BoardDTO> list() {
		//return boardDAO.findAll(); //select * from board
		return boardDAO.findAllByOrderBySeqDesc(); //쿼리 메소드
		
	}

}

/*
쿼리 메소드
=> 쿼리 메소드는 메소드의 이름으로 필요한 쿼리를 만들어주는 기능
*/
