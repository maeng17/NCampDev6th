$(function(){
	$.ajax({
		type: 'post',
		url: '/projectMVC/board/getBoard.do',
		data: 'seq='+$('#seq').val(),
		dataType: 'json',
		success: function(data){
			console.log(JSON.stringify(data));
			
			$('#subjectSpan').text(data.subject);
			$('#seqSpan').text(data.seq);
			$('#idSpan').text(data.id);
			$('#hitSpan').text(data.hit);
			$('#contentSpan').text(data.content);
			
			
			//자기가 작성한 글인지 확인하기
			if($('#memId').val() == data.id)
				$('#boardViewSpan').show();
			else
				$('#boardViewSpan').hide();
			
		},
		error: function(e){
			console.log(e);
		}
	});
});

//글수정 - 수정한 페이지 번호를 보여준다.
$('#boardUpdateFormBtn').click(function(){
	$('#boardViewForm').attr('action', '/projectMVC/board/boardUpdateForm.do');
	$('#boardViewForm').submit(); //seq, pg
});

//글삭제 - 삭제한 후에는 1페이지를 보여준다,
$('#boardDeleteBtn').click(function(){
	if(confirm('정말로 삭제하시겠습니까')){
		$.ajax({
			type: 'post',
			url: '/projectMVC/board/boardDelete.do',
			data: 'seq=' + $('#seq').val(),
			dataType: 'text',
			success: function(data){
				if(data.trim() == 'ok'){
					alert("작성하신 글을 삭제하였습니다.");
					location.href="/projectMVC/board/boardlist.do?pg=1";
				}
			},
			error: function(e){
				console.log(e);
			}
		}); //ajax
	}//if
});

//답글 - 원글이 있는 페이지 번호를 보여준다.
$('#boardReplyFormBtn').click(function(){
	$('#boardViewForm').attr('action', '/projectMVC/board/boardReplyForm.do');
	$('#boardViewForm').submit(); //seq, pg
});