<%@ page language="java" contentType="text/xml; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page trimDirectiveWhitespaces="true" %> <%--XML�±� �������� ������ ���� --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- DB���� => ���࿡ ���̵� 'hong'�̸� �̹� ����� ���̵�� ��� --%>
<c:set var="result" value="false" />
<c:if test="${param.user_id == 'hong' }">
	<c:set var="result" value="true" />
</c:if>

<%-- XML�� ������ --%>
<?xml version="1.0" encoding="UTF-8"?>
<checkId>
	<result>${result }</result>
</checkId>