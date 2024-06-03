<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<form name="form1" id="project" action="http://www.naver.com">
        <div id="input">
	        <h3>이름</h3>
            <input type="text" name="name" placeholder="이름 입력"/>

            <h3>아이디</h3>
            <input type="text" name="id" placeholder="아이디 입력"/>

            <h3>비밀번호</h3>
            <input type="password" name="pwd"/>

	        <h3>재확인</h3>
            <input type="password" name="repwd"/>

            <h3>성별</h3>
            <label><input type="radio" name="gender" value="0" checked/>남자</label>
            <label><input type="radio" name="gender" value="1"/>여자</label>

            <h3>이메일</h3>
            <input type="email" name="email"/>
            @
            <input type="emai2" name="emai2"/>
            <select name="email3">
                <option value="직접입력">직접입력</option>
                <option value="naver.com">naver.com</option>
                <option value="hanmail.com">hanmail.com</option>
                <option value="icloud.com">gmail.com</option>
            </select>


            <h3>휴대폰</h3>
            <select name="tel1">
                <option value="010">010</option>
                <option value="011">011</option>
                <option value="02">02</option>
                <option value="032">032</option>
            </select>
            <input type="tel" name="tel2" maxlength="4"/>
            <input type="tel" name="tel3" maxlength="4"/>


            <h3>주소</h3>
            <input type="text" name="zipcode" readonly/>
            <input type="button" value="우편번호 검색"/><br>
            <input type="text" name="addr1" placeholder="주소" readonly/><br>
            <input type="text" name="addr2" placeholder="상세주소"/><br>
            
            
            <input type="submit" value="회원가입" class="myButton"/>
            <input type="reset" value="다시작성" class="myButton"/>
        </div>
	    </form>
	
	    <script src="http://code.jQuery.com/jquery-3.7.1.min.js"></script>
	    <script>
	        $(function(){
	            $('#project').submit(function(){
	                var name = $('input[name="name"]').val()
	                if(!name){
	                    alert("이름 입력")
	                    
	                    $('input[name="name"]').focus();
	                    return false;
	                }
	
	                var id = $('input[name="id"]').val()
	                if(!id){
	                    alert("아이디 입력")
	                    $('input[name="id"]').focus();
	                    return false;
	                }
	
	                var pwd = $('input[name="pwd"]').val()
	                if(!pwd){
	                    alert("비밀번호 입력")
	                    $('input[name="pwd"]').focus();
	                    return false;
	                }
	
	                var repwd = $('input[name="repwd"]').val()
	                if(pwd != repwd){
	                    alert("비밀번호가 재확인과 일치하지 않습니다.")
	                    $('input[name="repwd"]').focus();
	                    return false;
	                }
	
	                var email2 = $('input[name="email2"]').val()
	                var email3 = $('input[name="email3"]').val()
	                if($('input[name="email3"]').val()!="직접입력"){
	                    email2 = email3;
	                }
	            });
	        });
	    </script>  
	</table>
</body>
</html> 