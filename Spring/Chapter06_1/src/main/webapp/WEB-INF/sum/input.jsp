<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="http://localhost:8080/Chapter06_1/result.do" method="get">
	<table border="1">
		<tr>
			<th width="70">X</th>
			<td><input type="text" name="x" /></td>
		</tr>
		
		<tr>
			<th width="70">Y</th>
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