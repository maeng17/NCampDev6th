<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
#boardViewForm {
	display:flex;
    flex-direction:column;
    align-items: center;
    margin:0 auto;
    text-align: left;
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
	
	<form id="boardViewForm">
		<div id="section">
			seq = <input type="text" name="seq" id="seq" value="${seq }" />
			pg = <input type="text" name="pg" id="pg" value="${pg }" />
			memId = <input type="text" id="memId" value="${memId }" />
					
			<table border="1" cellpadding="7" frame="hsides" rules="rows">
			<tr>
				<td height="100" colspan="3">
					<font size="7"><span id="subjectSpan"></span></font>
				</td>
			</tr>
			
			<tr>
				<td align="center" width="200">글번호 : <span id="seqSpan"></span></td>
				<td align="center" width="200">작성자 : <span id="idSpan"></span></td>
				<td align="center" width="200">조회수 : <span id="hitSpan"></span></td>
			</tr>
			
			<tr>
				<td height="300" valign="top" colspan="3" >
					<div style="width=:100%; height:100%; overflow: auto;"> <!-- 밑으로 긴 글일 때 스크롤 바가 생성 -->
						<pre style="white-space: pre-line; word-break: break-all;">
							<span id="contentSpan"></span>
						</pre>
					</div>
				</td>
			</tr>
			</table>
		
			<div style="margin-top: 5px;">
				<input type="button" value="목록" onclick="location.href='/projectMVC/board/boardlist.do?pg=${pg}'">
				<span id="boardViewSpan">
					<input type="button" value="글수정" id="boardUpdateFormBtn">
					<input type="button" value="글삭제" id="boardDeleteBtn">
				</span>
				<input type="button" value="답글" id="boardReplyFormBtn">
			</div>
		</div>
	</form>
</div>
	
<script src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
<script src="../js/boardView.js"></script>