<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.dao.MemberDAO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	String id = request.getParameter("id");

	//DB - 싱글톤
	MemberDAO memberDAO = MemberDAO.getInstance(); //생성
	boolean exist = memberDAO.isExistId(id); //호츌
	
%>


<%if(exist) {%>
	exist
<%} else { %>
	non_exist
<%} %>
