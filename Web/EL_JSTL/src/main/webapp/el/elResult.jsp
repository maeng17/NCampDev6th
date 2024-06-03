<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>
		${param['x'] } + ${param['y'] } = ${param['x'] + param['y']}<br>
		${param['x'] } - ${param['y'] } = ${param['x'] - param['y']}<br>
		${param.x } * ${param.y } = ${param.x * param.y }<br>
		${param.x } / ${param.y } = ${param.x / param.y }<br>
	</h3>
</body>
</html>