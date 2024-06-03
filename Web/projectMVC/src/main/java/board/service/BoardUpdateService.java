package board.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

import board.dao.BoardDAO2;

public class BoardUpdateService implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		int seq = Integer.parseInt(request.getParameter("seq"));
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		Map<String, String> map = new HashMap<>();
		map.put("seq", seq +"");
		map.put("subject", subject);
		map.put("content", content);
		
		//DB
		BoardDAO2 boardDAO = BoardDAO2.getInstance();
		boardDAO.boardUpdate(map);
		
		return "/board/boardUpdate.jsp";
	}

}
