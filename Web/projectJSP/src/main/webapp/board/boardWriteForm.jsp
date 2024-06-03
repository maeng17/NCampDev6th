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
	#boardWriteForm div {
		font-size: 8pt;
		font-weight: bold;
		color: red;
	}
</style>
</head>
<body>
	<form id="boardWriteForm" name="boardWriteForm" method="post" action="boardWrite.jsp">
		<table border="1" cellpadding="7">
			<tr>
				<th width="100">제목</th>
				<td>
					<input type="text" name="subject" id="subject" />
					<div id="subjectDiv"></div>
				</td>
			</tr>
			
			<tr>
				<th width="100">내용</th>
				<td>
					<input type="text" name="content" id="content" style="width: 250px; height: 150px;"/>
					<div id="contentDiv"></div>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="button" onclick="checkBoardWrite()" value="글쓰기" />
					<input type="reset" value="다시작성" />
				</td>
			</tr>	
		</table>
	</form>
	
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script>
		function checkBoardWrite() {
			document.getElementById("subjectDiv").innerText="";
			document.getElementById("contentDiv").innerText="";
			
			if(document.getElementById("subject").value == "")
				document.getElementById("subjectDiv").innerHTML="제목 입력";
			else if(document.getElementById("content").value == "")
				document.getElementById("contentDiv").innerHTML="내용 입력";
			else
				document.boardWriteForm.submit();
		}
	</script>
</body>
</html>