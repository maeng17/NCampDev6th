package board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

import board.bean.BoardDTO;
import board.dao.BoardDAO2;

public class BoardListService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//데이터 
		int pg = Integer.parseInt(request.getParameter("pg"));

		//1페이지 당 5개씩
		int endNum = pg * 5;
		int startNum = endNum - 4;
		
		//DB -select
		BoardDAO2 boardDAO = BoardDAO2.getInstance();
		List<BoardDTO> list = boardDAO.boardList(startNum, endNum);
		
		//페이징 처리
		int totalA = boardDAO.getTotalA(); //총글수
		int totalP = (totalA + 4) / 5; //총 페이지수 
				
				
		//응답
		request.setAttribute("list", list);
		request.setAttribute("totalP", totalP);
		request.setAttribute("pg", pg);
		return "/board/boardlist.jsp";
	}

}
