<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "board.bean.BoardDTO" %>
<%@ page import = "board.dao.BoardDAO2" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>

<%
	//데이터 
	int pg = Integer.parseInt(request.getParameter("pg"));

	//1페이지 당 5개씩
	int endNum = pg * 5;
	int startNum = endNum - 4;
	
	//DB -select
	BoardDAO2 boardDAO = BoardDAO2.getInstance();
	List<BoardDTO> list = boardDAO.boardList(startNum, endNum);
	
	//페이징 처리
	int totalA = boardDAO.getTotalA(); //총글수
	int totalP = (totalA + 4) / 5; //총 페이지수 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
</style>
</head>
<body>
<table border="1" cellpadding="7" frame="hsides" rules="rows">
	<tr>
		<th width="100">글번호</th>
		<th width="300">제목</th>
		<th width="150">작성자</th>
		<th width="150">작성일</th>
		<th width="100">조회수</th>
	</tr>
<%if(list != null) {%>
	
	<%for(BoardDTO boardDTO : list) {
		//SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.DD");
		//sdf.format(boardDTO.getLogtime());
	%>
		
		<tr>
			<td align="center"><%=boardDTO.getSeq() %></td>
			
			<td>
			<%for(int i=0; i<boardDTO.getLev(); i++) {%>
				&emsp;
			<%}//for %>
			<%if(boardDTO.getPseq() != 0) { %>
				<img src="../image/reply.gif" alt="reply">
			<% }//if %>
			<%=boardDTO.getSubject() %>
			</td>
			
			<td align="center"><%=boardDTO.getId() %></td>
			<td align="center"><%=new SimpleDateFormat("YYYY.MM.dd").format(boardDTO.getLogtime()) %></td>
			<td align="center"><%=boardDTO.getHit() %></td>
		</tr>
	<%}//for %>
<%} %>
</table>
<div style = "text-align: center; width:870px; margin-top: 15px">
	<% for(int i=1; i<=totalP; i++) {%>	
		<%if(i == pg) { %>
			<span id="currentPaging" onclick="boardPaging(<%=i %>)"><%=i %></span>
		<%} else { %>
			<span id="paging" onclick="boardPaging(<%=i %>)"><%=i %></span>
		<% } %>
	<%} //for %>
</div>

<script type="text/javascript">
function boardPaging(pg) {
	location.href = "boardlist.jsp?pg=" + pg;
}
</script>
</body>
</html>