<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<% 
	request.setAttribute("apple", "���");
	
	//������ �̵�
	//forward�� ���� �ǹ�
	RequestDispatcher dispatcher = request.getRequestDispatcher("forwordResult.jsp"); //������
	dispatcher.forward(request, response); //����� �ѱ��
%>

<%-- <jsp:forward page="forwordResult.jsp" /> --%>