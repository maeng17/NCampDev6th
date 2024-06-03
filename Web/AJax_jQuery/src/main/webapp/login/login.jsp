<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page trimDirectiveWhitespaces="true" %> <%--XML�±� �������� ������ ���� --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- DB���� => ���࿡ ���̵� 'hong', ��й�ȣ�� '111' �̸� �α��� �������� ���� --%>
<c:set var="result" value="true" />
<c:set var="message" value="ȫ�浿�� �α���" />

<c:if test="${param.user_id != 'hong' }">
	<c:set var="result" value="false" />
	<c:set var="message" value="���Ե��� ���� ���̵� �Դϴ�." />
</c:if>

<c:if test="${param.user_password != '111' }">
	<c:set var="result" value="false" />
	<c:set var="message" value="�߸��� ��й�ȣ �Դϴ�." />
</c:if>

<%-- XML�� ������ --%>
<?xml version="1.0" encoding="UTF-8"?>
<login>
	<result>${result }</result>
	<message>${message }</message>
</login>