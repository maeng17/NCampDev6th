$('#searchListBtn').click(function(){
	
	if($('#value').val()=='')
		alert('검색어를 입력하세요')
	else 
		$.ajax({
			type: 'post',
			url: '/user/getUserSearchList',
			data: {'columnName' : $('#columnName').val(),
					'value' : $('#value').val()},
			dataType: 'json',
			success: function(data){
				console.log(JSON.stringify(data));
				
				$('#userListTable tr:gt(0)').remove(); //기존값 제거 tr의 0행보다 큰 애들만 제거
				
				$.each(data, function(index, items){
					var result = `<tr>`
							   + `<td align="center">` + items.name + `</td>`
							   + `<td align="center"><a href="#" class="idA">` + items.id + `</a></td>`
							   + `<td align="center">` + items.pwd + `</td>`
							   + `</tr>`;
								   
					$('#userListTable').append(result);
				}); //$.each
			},
			error: function(e) {
				console.log(e);
			}
		}); //$.ajax
});