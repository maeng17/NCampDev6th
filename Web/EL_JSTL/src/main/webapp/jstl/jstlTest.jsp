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
	<h3> *** 변수 설정 *** </h3>
	<c:set var="name" value="홍길동" />
	<c:set var="age">25</c:set>
	
	나의 이름은 ${name } 입니다. <br>
	나의 나이는 <c:out value="${age }" />살 입니다.<br>
	나의 키는 ${height }cm 입니다 <br> <!--없는 변수 이지만 error뜨지 않고 빈자리로  -->
	
	<h3> *** forEach *** </h3>
	<c:forEach var="i" begin="1" end="10" step="1"> <%-- for(int i=0; i<=10; i++  --%>
		${i } &emsp;
		<c:set var="sum" value="${sum + i }" /> <%-- sum = sum + i --%>
	</c:forEach>
	<br>
	1 ~ 10까지의 합 = ${sum }
	
	<br><br>
	<c:forEach var="i" begin="1" end="10" step="1">
		${11-i } &emsp;
	</c:forEach>
	
	
	<h3> *** forToken *** </h3> <%--split(분ㄹ;) --%>
	<c:forTokens var="car" items="소나타,아우디,벤츠,링컨" delims=",">
		${car } <br>
	</c:forTokens>
</body>
</html> 