<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
html, body {
	width: 100%;
	height: 100%;
}
html {
	overflow-y: scroll;
}

#wrap{
	width: 1100px; 
	margin: 0 auto;
}

#header {
	height: 10%;
	text-align: center;
}

#container {
	margin: auto;
	width: 1100px;
	/* height: 500px; */
}

#container:after {
	content: '';
	display: block;
	clear: both;
	float: none;
}

#nav {
	margin-left: 10px;
	width: 25%;
	height: 100%;
	float: left;
}

#section {
	width: 70%;
	height: 100%;
	float: left;
}

#footer {
	width: 1100px;
	height: 10%;
}
</style>
</head>
<body>
<div id="wrap">
	<div id="header">
		<h1>
			<img alt="cat" src="./image/cat.jpg"  width="50" height="50"/ >
			MVC를 활용한 미니 프로젝트
		</h1>
		<jsp:include page="./main/menu.jsp" />
	</div>
	<div id="container">
		<div id="nav">
			<jsp:include page="./main/nav.jsp" />
		</div>
		<div id="section">
			<h3>
				저희 홈페이지를 방문해주져서 감사합니다.<br><br>
				Have a nice day!!<br><br>
				<img alt="cat" src="./image/cat.jpg">
			</h3>
		</div>
	</div>
	<div id="footer">
		<hr>
		<h4>비트캠프</h4>
	</div>
</div>

<script src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
        	$('div > h1 > img').click(function(){
        		location.href="/projectMVC/index.jsp";
        	});
        	
        });
    </script>
</body>
</html>