<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="angel" uri="tld"%> <!-- angel�̶�� Ŀ���� �±� ���� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>�ڹ�Ŭ������ �޼ҵ带 �̿�</h3>
	<h3>
		${param.x } + ${param.y } = ${ angel:sum(param.x, param.y) }<br>
		${param.x } * ${param.y } = ${ angel:mul(param.x, param.y) }<br>
	</h3>
</body>
</html>