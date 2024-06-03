<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>
<%@ page import = "member.dao.MemberDAO" %>
<%@ page import = "member.bean.MemberDTO" %>

<%
	//데이처
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//DB - select
	MemberDAO memberDAO = MemberDAO.getInstance();
	MemberDTO memberDTO = memberDAO.login(id, pwd);
	

	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(memberDTO == null) { 
	//페이지 이동
	response.sendRedirect("loginFail.jsp");
	
} else { 
	//페이지 이동
	//response.sendRedirect("loginOk.jsp?name=" + URLEncoder.encode(memberDTO.getName(), "UTF-8") + "&id=" + id);

	//쿠키
	/*
	Cookie cookie = new Cookie("memName", memberDTO.getName());
	cookie.setMaxAge(30*60); //3초 /쿠키가 살아있는 시간 /초단위-30분
	response.addCookie(cookie); //클라이언트에 저장
	
	Cookie cookie2 = new Cookie("memId", id);
	cookie2.setMaxAge(30*60); //3초 /쿠키가 살아있는 시간 /초단위-30분
	response.addCookie(cookie2); //클라이언트에 저장
	*/
	
	//세션
	// HttpSession session = request.getSession(); - 내장객체
	session.setAttribute("memName", memberDTO.getName());
	session.setAttribute("memId", id);
	session.setAttribute("memEmail", memberDTO.getEmail1()+ "@" + memberDTO.getEmail2());
	
	session.setAttribute("memMemberDTO", memberDTO);
	
	//페이지 이동
	response.sendRedirect("loginOk.jsp");
} %>
</body>
</html>