<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
	#currentPaging {
		border: 1px solid black;
		color: red;
		cursor: pointer;
		font-size: 15pt;
		margin: 5px;
		padding: 5px 8px;
	}
	#paging {
		color: black;
		cursor: pointer;
		font-size: 15pt;
		margin: 5px;
		padding: 5px;
	}
	span:hover {
		text-decoration: underline;
	}
	.boardListDiv {
		display:flex;
	    flex-direction:column;
	    align-items: center;
	    margin:0 auto;
	    text-align: left;
	}
	.subjectA:link {color: black; text-decoration: none;}
	.subjectA:visited{color: black; text-decoration: none;}
	.subjectA:hover{color: green; text-decoration: underline;}
	.subjectA:active{color: black; text-decoration: none;}

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
		
</style>

<div id="header" style="text-align: center;">
	<h1>
		<a href="/projectMVC/index.jsp">
			<img alt="cat" src="../image/cat.jpg"  width="50" height="50"  >			
		</a>
	</h1>	
</div>

<div id="container">
	
	<jsp:include page="../main/boardMenu.jsp"></jsp:include>
	
	
	<input type="hidden" id="pg" value="${pg }">
	<input type="hidden" id="memId" value="${memId }">
	
	<div id="section" class="boardListDiv">
		<table border="1" cellpadding="7" frame="hsides" rules="rows" id="boardListTable">
		<tr>
			<th width="100">글번호</th>
			<th width="500">제목</th>
			<th width="150">작성자</th>
			<th width="150">작성일</th>
			<th width="100">조회수</th>
		</tr>

		<!-- 동적처리 -->
				
		</table>
		<div id="boardPagingDiv" style = "text-align: center; width:870px; margin-top: 15px">
			<!-- 동적처리_페이징 -->
		</div>
	</div>
	
</div>
<script src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
<script src="../js/boardList.js"></script>

<script type="text/javascript">
function boardPaging(pg) {
	location.href = "/projectMVC/board/boardlist.do?pg=" + pg;
}
</script>
