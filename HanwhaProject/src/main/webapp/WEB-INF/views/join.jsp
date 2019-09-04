<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>응급동물병원조회</title></head>
<style>
body{
    display: table-cell;
    vertical-align: middle;
    background-color: #ffcccc !important;
}

html { 
    display: table;
    margin: auto;
}

html, body {
    height: 100%;
}

.medium-small {
    font-size: 0.9rem;
    margin: 0;
    padding: 0;
}

.login-form {
    width: 280px;
}

.login-form-text {
    text-transform: uppercase;
    letter-spacing: 2px;
    font-size: 0.8rem;
}

.login-text {
    margin-top: -6px;
    margin-left: -6px !important;
}

.margin {
    margin: 0 !important;
}

.pointer-events {
	pointer-events: auto !important;
}

.input-field >.material-icons  {
	padding-top:10px;
}

.input-field div.error{
    position: relative;
    top: -1rem;
    left: 3rem;
    font-size: 0.8rem;
    color:#FF4081;
    -webkit-transform: translateY(0%);
    -ms-transform: translateY(0%);
    -o-transform: translateY(0%);
    transform: translateY(0%);
}
.button {
  display: inline-block;
  font-size: 15px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color:  #e7e7e7;
  background-color:#ff8080;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;

}
</style>

<script>

$(function(){		//아래 페이지가 다 로딩된 후 이 함수를 실행한다(익명함수)
	
	$("#dupbutton").click(function(){ 	//그 때 #dubbutton아이디객체를 클릭하면 이 함수가 실행된다
		//Ajax
		$.get("memberdupcheck", {"member_id": $("#member_id").val()},  function(data){ //$.get("요청하려는 url", callback) -> /memberdupcheck url을 요청하고 작업 수행 후 function(data){}; 함수를 콜백
			
			$("#message").text(data==1?"이미 사용중인 아이디입니다.":"사용가능한 아이디입니다.");
		});
	});
} );

</script>


<body>
<div class="container">
    <h3>회원가입 폼 입니다.</h3>
    <form action="insertmember" method="post" id="myForm" name="createMemberForm" >
    
      <div class="form-group has-feedback">
            <label class="control-label" for="name">이름</label>
            <input class="form-control" type="text" name="name" id="name"/>
        </div>
        <div class="form-group has-feedback">
            <label class="control-label" for="member_id">아이디</label>
            <input class="form-control" type="text" name="member_id" id="member_id"/>
            <input type="button" class="button" value="중복체크" id="dupbutton"/>
            <div style="font-style: italic; font:bolder; color: red"  id="message"></div>	
        </div>
        <div class="form-group has-feedback">
            <label class="control-label" for="password">비밀번호</label>
            <input class="form-control" type="password" name="password" id="password"/>
        </div>
        
         <div class="form-group has-feedback">
            <label class="control-label" for="birthday">생년월일</label>
            <input class="form-control" type="date" name="birthday" id="birthday"/>
        </div>
        <div class="form-group has-feedback">
            <label class="control-label" for="email">이메일</label>
            <input class="form-control" type="text" name="email" id="email"/>
            
        </div>
           <div class="form-group has-feedback">
            <label class="control-label" for="address">주소</label>
            <input class="form-control" type="text" name="address" id="address"/>
            
        </div>
      
           <div class="form-group has-feedback">
            <label class="control-label" for="pet">동물보유여부</label>
        	  <input type="radio" name="pet" value="1"> Y
           	 <input type="radio" name="pet" value="0"> N<br>
        </div>
  
        <button class="button" style="font-size: 20px" type="submit" id="joinbutton">가입</button>
        
    </form>
</div>

</body>
</html>
