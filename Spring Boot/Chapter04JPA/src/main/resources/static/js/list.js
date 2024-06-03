$(function(){
	$.ajax({
		type: 'post',
		url: '/user/getUserList',
		data: {'page': $('#page').val()},
		dataType: 'json',
		success: function(data){
			console.log(JSON.stringify(data));
			
			$.each(data.content, function(index, items){
				var result = `<tr>`
						   + `<td align="center">` + items.name + `</td>`
						   + `<td align="center"><a href="#" class="idA">` + items.id + `</a></td>`
						   + `<td align="center">` + items.pwd + `</td>`
						   + `</tr>`;
							   
				$('#userListTable').append(result);
			}); //$.each
			
			//페이징 처리
			var pagingHTML = '';
			
			for(var i=0; i<data.totalPages; i++){
				if(i == $('#page').val()){
					//pagingHTML += `<span id='currentPaging' onClick='userPaging(` + i + `)'>` + (i+1) + `</span>`
					pagingHTML += `<span id='currentPaging' onClick='userPaging(` + i + `)'>${(i+1)}</span>`
				} else {
					pagingHTML += `<span id='paging' onClick='userPaging(` + i + `)'>${(i+1)}</span>`
				}
			} //for
			
			
			
			
			$('#userPagingDiv').html(pagingHTML);
			
			//아이디를 클릭했을 때
			$('.idA').click(function(){
				//alert($(this).text());
				//alert($(this).parent().prev().prop('tagName'));
				//alert('name = ' + $(this).parent().prev().text());
				
				location.href = '/user/updateForm?id=' + $(this).text() + '&page=' + $('#page').val();
				
			});
			
		},
		error: function(e){
			console.log(e);
		}
	}); //$.ajax
});








