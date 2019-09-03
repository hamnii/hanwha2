<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Insert title here</title>
</head>
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
        
        <button class="button" style="font-size: 20px" type="submit">가입</button>
    </form>
</div>

</body>
</html>
