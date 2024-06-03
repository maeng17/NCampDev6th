<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		${memName } <%-- ${sessionScope.memName } --%>님이 로그인 하였습니다.	
		<br><br>
		<input type="button" value="로그아웃" onclick="location.href='/memberMVC/member/logout.do'" />
		<input type="button" value="회원정보수정" onclick="location.href='/memberMVC/member/updateForm.do'">
	</h3>
</body>
</html>