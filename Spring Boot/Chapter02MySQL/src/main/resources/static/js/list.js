$(function(){
	$.ajax({
		type: 'post',
		url: '/user/getUserList',
		data: {'pg': $('#pg').val()},
		dataType: 'json',
		success: function(data){
			console.log(JSON.stringify(data));
					
			$.each(data.list, function(index, items){
				
				var result = `<tr>`
							+ `<td align="center">` + items.name + `</td>`
							+ `<td align="center"><a href="#" class="idA">` + items.id + `</a></td>`
							+ `<td align="center">` + items.pwd + `</td>`
							+ `</tr>`;
				$('#userListTable').append(result);
				
			}); //$.each
			
			//페이징처리
			$('#userPagingDiv').html(data.userPaging.pagingHTML);
			
			//아이디를 클릭했을 때
			$('.idA').click(function(){
				//alert($(this).text())
				alert($(this).parent().prev().prop('tagName'));
				alert('name = ' + $(this).parent().prev().prop('text'));
				
				location.href = '/user/updateForm?id=' + $(this).text() + '&pg=' + $('#pg').val();
			});
			
			
			
		}, //success
		error: function(e){
					console.log(e);
		}
	}); //$.ajax
}); //function