<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
}
th, td {
	padding: 5px;
	width: 200px;
}
#currentPaging {
	border: 1px solid #ccc;
	margin: 5px;
	padding: 5px 8px;
	color: red;
	cursor: pointer;
}
#paging {
	margin: 5px;
	padding: 5px;
	color: black;
	cursor: pointer;
}
</style>
</head>
<body>
<input type="hidden" id="page" value="${page }" />

<a href="/"><img src="/image/image02.jpg" alt="먼저 놔라" width="50" height="50"></a>

<table border="1" frame="hsides" role="rows" id="userListTable">
	<tr>
		<th>이름</th>
		<th>아이디</th>
		<th>비밀번호</th>
	</tr>
	
	<!-- 동적 처리 -->
</table>

<div id="userPagingDiv" style="width: 640px; margin-top: 10px; text-align: center;"></div>
<br><br>

<div style="width: 600px; text-align:center;">
	<form id="searchListForm">
		<select id="columnName" style="width: 100ps;">
			<option value="name">이름</option>
			<option value="id">아이디</option>
		</select>
		<input type="text" id="value">
		<input type="button" id="searchListBtn" value="검색">
	</form>
</div>

<script type="text/javascript" src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
<script type="text/javascript" src="../js/list.js"></script>
<script type="text/javascript" src="../js/searchList.js"></script>
<script type="text/javascript">
function userPaging(page){
	location.href = '/user/list?page=' + page;
}
</script>
</body>
</html>












