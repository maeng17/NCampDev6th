//유효성 검사
$('#writeBtn').click(function(){
	$('#nameDiv').empty();
	$('#idDiv').empty();
	$('#pwdDiv').empty();
	
	if($('#name').val() == '')
		$('#nameDiv').text('이름 입력');
	else if($('#id').val() == '')
		$('#idDiv').text('아이디 입력');
	else if($('#pwd').val() == '')
		$('#pwdDiv').text('비밀변호 입력');
	else if($('#pwd').val() != $('#repwd').val())
		$('#pwdDiv').text('비밀변호가 일치하지 않습니다.');
	else if($('#id').val() != $('#check').val())
		$('#idDiv').text('중복체크 하세요');
	else
		$.ajax({
			type: 'post'
			, url: '/projectMVC/member/write.do'
			, data: $('#writeForm').serialize() //name=홍길동&id=hong$pwd=111~~
			, dataType: 'text'
			, success: function(data){
				alert(data.trim());
				
				if(data.trim()==1){
					alert('회원가입을 축하합니다.');
					location.href="/projectMVC/index.jsp";
				} else {
					alert('다시 입력하세요.');
				}
			}
			, error: function(e){
				console.log(e);
			}
		}); //$.ajax

});

//이메일
function change(){
	document.getElementById("email2").value = document.getElementById("email3").value;

}

//우편번호
function checkPost(){
	new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
               
                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }


                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('zipcode').value = data.zonecode;
                document.getElementById("addr1").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("addr2").focus();
            }
        }).open();
}

//중복체크
function checkId(){
	var id = document.getElementById("id").value
	if( id == "")
		alert("먼저 아이디를 입력하세요.")
	else
		window.open("checkId.jsp?id="+id, 
					"checkId", 
					"width=450 height=150 left=300 top=150");
}


//회원정보 수정
$('#updateBtn').click(function(){
	$('#nameDiv').empty();
	$('#pwdDiv').empty();
	
	if($('#name').val() == '')
		$('#nameDiv').text('이름 입력');
	else if($('#pwd').val() == '')
		$('#pwdDiv').text('비밀변호 입력');
	else if($('#pwd').val() != $('#repwd').val())
		$('#pwdDiv').text('비밀변호가 일치하지 않습니다.');
	else {
		$.ajax({
			type: 'post'
			, url: '/projectMVC/member/update.do'
			, data: $('#updateForm').serialize() //name=홍길동&id=hong$pwd=111~~
			, dataType: 'text'
			, success: function(data){
				if(data.trim() == 'ok'){
					alert('회원정보 수정완료');
					location.href="/projectMVC/index.jsp";
				} else {
					alert('다시 입력하세요.');
				}
			}
			, error: function(e){
				console.log(e);
			}
		}); //$.ajax
	}
});


