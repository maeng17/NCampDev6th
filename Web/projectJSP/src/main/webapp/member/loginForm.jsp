<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
	}
	#loginForm div {
		font-size: 8pt;
		font-weight: bold;
		color: red;
	}
</style>
</head>
<body>
	<form name="loginForm" id="loginForm" method="post" action="login.jsp">
		<table border="1" cellpadding="5">
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" name="id" id="id" size="25" />
					<div id="idDiv"></div>
				</td>	
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="pwd" id="pwd" size="30" />
					<div id="pwdDiv"></div>
				</td>	
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="로그인" onclick="checkLogin()">
					<input type="reset" value="회원가입" onclick="location.href='writeForm2.jsp'" >
				</td>
			</tr>
		</table>
	</form>	
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script type="text/javascript">
		//로그인 페이지 유효성 검사
		function checkLogin(){
			document.getElementById("idDiv").innerText="";
			document.getElementById("pwdDiv").innerText="";
			
			if(document.getElementById("id").value == "")
				document.getElementById("idDiv").innerHTML="아이디 입력";
			else if(document.getElementById("pwd").value == "")
				document.getElementById("pwdDiv").innerHTML="비밀번호 입력";
			else
				document.loginForm.submit(); //name 속성
		}
	</script>
</body>
</html>