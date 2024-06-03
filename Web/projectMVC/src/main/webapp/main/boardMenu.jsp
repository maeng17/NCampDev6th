<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
	#container {
		margin: auto;
		width: 1100px;
		height: 300px; 
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

<div id="nav" >
	seq = <input type="text" name="seq" id="seq" value="${seq }" />
	pg = <input type="text" name="pg" id="pg" value="${pg }" />
	<h4>
		<c:if test="${memId != null} ">
			<p><a href="/projectMVC/board/boardWriteForm2.do">글쓰기</a></p>
		</c:if>
		
		<c:if test="${seq != null} ">
			<p><a href="/projectMVC/board/boardUpdateForm.do?pg=${pg }&seq=${seq}">글수정</a></p>
		</c:if>
		
		<p><a href="/projectMVC/board/boardlist.do?pg=1">목록</a></p>
	</h4>
</div>
