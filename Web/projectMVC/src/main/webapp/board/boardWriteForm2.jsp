<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
	table {
		border-collapse: collapse;
	}
	#boardWriteForm {
		display:flex;
	    flex-direction:column;
	    align-items: center;
	    margin:0 auto;
	    text-align: left;
	}
	#boardWriteForm div {
		color: red;
		font-size: 8pt;
		font-weight: bold;
	}
	#header {
	height: 10%;
	text-align: center;
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
			
	<div id="section">
		<form name="boardWriteForm" id="boardWriteForm">
		<h3>글쓰기</h3>
			<table border="1" cellpadding="7">
				<tr>
					<th width="100">제목</th>
					<td>
						<input type="text" name="subject" id="subject" size="45" />
						<div id="subjectDiv"></div>
					</td>
				</tr>
				
				<tr>
					<th>내용</th>
					<td>
						<textarea name="content" id="content" cols="50" rows="15"></textarea>
						<div id="contentDiv"></div>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="글쓰기" id="boardWriteBtn" />
						<input type="reset" value="다시작성" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>

<script src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
<script type="text/javascript">
/* $(function(){
	$('#boardWriteBtn').click(function(){});
});  둘 중 하나 사용 가능*/

$(function(){
	$('#boardWriteBtn').click(function(){
		$('#subjectDiv').empty();
		$('#contentDiv').empty();
		
		if($('#subject').val() == '')
			$('#subjectDiv').html("제목 입력");
		else if($('#content').val() == '')
			$('#contentDiv').html("내용 입력");
		else
			$.ajax({
				type: 'post'
				, url: '/projectMVC/board/boardWrite2.do'
				, data: {'subject':$('#subject').val(), 'content':$('#content').val() }
				, dataType: 'text'
				, success: function(data){
					//alert(data.trim());
					
					if(data.trim() == 'ok'){
						alert("작성하신 글을 등록하였습니다.");
						location.href="/projectMVC/board/boardlist.do?pg=1";
					}
				}
				, error: function(e){
					console.log(e)
				}
			});
	});
});

</script>
