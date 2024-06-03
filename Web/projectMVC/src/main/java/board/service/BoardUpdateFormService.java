package board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

import board.bean.BoardDTO;
import board.dao.BoardDAO2;

public class BoardUpdateFormService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//데이터
		int seq = Integer.parseInt(request.getParameter("seq"));
		int pg = Integer.parseInt(request.getParameter("pg"));
		
		//DB - 첫번째
		//BoardDAO2 boardDAO = BoardDAO2.getInstance();
		//BoardDTO boardDTO = boardDAO.getBoard(seq);
		
		request.setAttribute("seq", seq);
		request.setAttribute("pg", pg);
		//request.setAttribute("boardDTO", boardDTO);
		return "/board/boardUpdateForm.jsp";
	}

}
