<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3> *** ���� ���� *** </h3>
	<c:set var="name" value="ȫ�浿" />
	<c:set var="age">25</c:set>
	
	���� �̸��� ${name } �Դϴ�. <br>
	���� ���̴� <c:out value="${age }" />�� �Դϴ�.<br>
	���� Ű�� ${height }cm �Դϴ� <br> <!--���� ���� ������ error���� �ʰ� ���ڸ���  -->
	
	<h3> *** forEach *** </h3>
	<c:forEach var="i" begin="1" end="10" step="1"> <%-- for(int i=0; i<=10; i++  --%>
		${i } &emsp;
		<c:set var="sum" value="${sum + i }" /> <%-- sum = sum + i --%>
	</c:forEach>
	<br>
	1 ~ 10������ �� = ${sum }
	
	<br><br>
	<c:forEach var="i" begin="1" end="10" step="1">
		${11-i } &emsp;
	</c:forEach>
	
	
	<h3> *** forToken *** </h3> <%--split(�Ф�;) --%>
	<c:forTokens var="car" items="�ҳ�Ÿ,�ƿ��,����,����" delims=",">
		${car } <br>
	</c:forTokens>
</body>
</html> 