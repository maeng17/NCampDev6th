<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
	table {
		border-collapse: collapse;
	}
	#boardUpdateForm {
		display:flex;
	    flex-direction:column;
	    align-items: center;
	    margin:0 auto;
	    text-align: left;
	}
	#boardUpdateForm div {
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
		<form name="boardUpdateForm" id="boardUpdateForm">
		
		<input type="text" name="seq" id="seq" value="${seq }" >
		<input type="hidden" name="pg" id="pg" value="${pg }" >
		
		<h3>글 수정</h3>
			<table border="1" cellpadding="7">
				<tr>
					<th width="100">제목</th>
					<td>
						<input type="text" name="subject" id="subject" size="45" value="${boardDTO.subject }"/>
						<div id="subjectDiv"></div>
					</td>
				</tr>
				
				<tr>
					<th>내용</th>
					<td>
						<textarea name="content" id="content" cols="50" rows="15">${boardDTO.content }</textarea>
						<div id="contentDiv"></div>
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="글수정" id="boardUpdateBtn" />
						<!-- 
						Java파일에서 DB에 가서 BoardDTO를 가지고 왔을때
						<input type="reset" value="다시작성" >
						 -->
						<input type="reset" value="다시작성" onclick="location.reload()"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>

<script src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
<script type="text/javascript">
//두번쩨 - 동적처리
$(function(){
	$.ajax({
		type: 'post',
		url: '/projectMVC/board/getBoard.do',
		data: 'seq='+$('#seq').val(),
		dataType: 'json',
		success: function(data){
			console.log(JSON.stringify(data));
			
			$('#subject').val(data.subject);
			$('#content').val(data.content);
			
			
		},
		error: function(e){
			console.log(e);
		}
	});
});

//글수정
$(function(){
	$('#boardUpdateBtn').click(function(){
		$('#subjectDiv').empty();
		$('#contentDiv').empty();
		
		if($('#subject').val() == '')
			$('#subjectDiv').html("제목 입력");
		else if($('#content').val() == '')
			$('#contentDiv').html("내용 입력");
		else
			$.ajax({
				type: 'post'
				, url: '/projectMVC/board/boardUpdate.do'
				, data: {'seq':$('#seq').val(),
						 'subject':$('#subject').val(),
						 'content':$('#content').val()
						}
				, dataType: 'text'
				, success: function(data){
					//alert(data.trim());
					
					if(data.trim() == 'ok'){
						alert("작성하신 글을 수정하였습니다.");
						location.href="/projectMVC/board/boardlist.do?pg="+$('#pg').val();
					}
				}
				, error: function(e){
					console.log(e)
				}
			});
	});
});

</script>
