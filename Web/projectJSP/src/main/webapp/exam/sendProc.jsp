<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setAttribute("apple", "���");

	//������ �̵�
	response.sendRedirect("sendResult.jsp");
%>