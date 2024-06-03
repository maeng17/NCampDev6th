<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "board.bean.BoardDTO" %>
<%@ page import = "board.dao.BoardDAO" %>

<%
//데이터
	String id = (String)session.getAttribute("memId");
	String name = (String)session.getAttribute("memName");
	String email = (String)session.getAttribute("memEmail");
	String subject = request.getParameter("subject");
	String content = request.getParameter("content");
	
	
	BoardDTO boardDTO = new BoardDTO();
	boardDTO.setId(id);
	boardDTO.setName(name);
	boardDTO.setEmail(email);
	boardDTO.setSubject(subject);
	boardDTO.setContent(content);
	
	//insert
	BoardDAO boardDAO = BoardDAO.getInstance();
	boolean i = boardDAO.boardWrite(boardDTO);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(i) {%>
	글 등록이 완료되었습니다.
<%} %>
</body>
</html>