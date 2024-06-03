package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping(value="/board/write")
	public String write() {
		boardService.write();
		return "등록 성공";
	}
	
	@GetMapping(value="/board/list")
	public List<BoardDTO> list() {
		return boardService.list();
	}
}
