package board.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

import board.dao.BoardDAO2;

public class BoardDeleteService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//Data
		int seq = Integer.parseInt(request.getParameter("seq"));

		//DB
		BoardDAO2 boardDAO = BoardDAO2.getInstance();
		boardDAO.boardDelete(seq);
		
		return "/board/boardDelete.jsp";
	}

}
