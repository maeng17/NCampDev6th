<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<font color="red">
	<b>
		start.jsp - sendProc.jsp - sendResult.jsp ������ �̵��մϴ�. <br>
		sendRedirect�� �̵��ϹǷ� �����ʹ� �������� �ʽ��ϴ�.<br>
		�ּҴ� sendResult.jsp�� ���δ�<br>
	</b>
</font>
<br>
<font color="blue">
	<b>
		start.jsp - forwardProc.jsp - forwardResult.jsp ������ �̵��մϴ�. <br>
		sendRedirect�� �̵��ϹǷ� �����ʹ� �����մϴ�.<br>
		�ּҴ� forwardProc.jsp�� �������� ����� forwardResult�� ���´�<br>
	</b>
</font>
<br>

<input type="button" value="sendRedirect" onclick="location.href='sendProc.jsp'">
<input type="button" value="forward" onclick="location.href='forwardProc.jsp'">
</body>
</html>