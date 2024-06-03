<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
	}
</style>
</head>
<body>
<form action="elResult.jsp">
	<table border="1" cellpadding="5" >
		<tr>
			<th width="50">X</th>
			<td><input type="text" name="x" /></td>
		</tr>
		
		<tr>
			<th>Y</th>
			<td><input type="text" name="y" /></td>
		</tr>
		
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="계산" />
				<input type="reset" value="취소" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>