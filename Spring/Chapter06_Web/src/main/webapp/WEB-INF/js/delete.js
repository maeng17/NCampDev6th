$(function(){
	//삭제버튼
	$('#deleteBtn').click(function(){
		if(confirm('삭제하시겠습니까?')){
			$.ajax({
				type: 'post',
				url: '/Chapter06_Web/user/delete',
				data: 'id=' + $('#id').val(),
				success: function(data){
					alert('회원 정보 삭제 완료');
					location.href='/Chapter06_Web/user/list';
				},
				error: function(e){
							console.log(e);
				}
			});//ajax
		} //if
	});
});