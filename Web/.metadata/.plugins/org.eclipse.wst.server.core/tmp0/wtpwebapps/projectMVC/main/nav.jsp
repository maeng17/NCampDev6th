<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>


<c:if test="${sessionScope.memId == null }">
	<input type="button" value="로그인"
		onclick="location.href='/projectMVC/member/loginForm.do'"><br><br>
	<input type="button" value="회원가입"
		onclick="location.href='/projectMVC/member/writeForm2.do'"><br><br>

</c:if>

<c:if test="${sessionScope.memId != null }">
	<h3><a href="#" class="updateBtn">${memName }</a>님 로그인</h3>
	<input type="button" value="로그아웃" id="logoutBtn"/>
	<input type="button" value="회원정보수정" class="updateBtn"/>
</c:if>


	
<script src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		//로그아웃
		$('#logoutBtn').click(function(){
			$.ajax({
				type:'post',
				url:  '/projectMVC/member/logout.do',
				dataType: 'text',
				success: function(data){
					alert(data.trim());
					location.href='/projectMVC/index.jsp'
				},
				error: function(e){
					console.log(e);
				}
				
			});
		});
		
		//회원정보수정으로 이동
		$('.updateBtn').click(function(){
			location.href='/projectMVC/member/updateForm.do';
		});
	});
</script>
	