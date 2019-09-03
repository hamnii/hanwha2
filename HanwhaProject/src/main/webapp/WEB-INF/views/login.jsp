<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/css/bootstrap.css"/>
    <style>
        /* .help-block 을 일단 보이지 않게 설정 */
        #myForm .help-block{
            display: none;
        }
        /* glyphicon 을 일단 보이지 않게 설정 */
        #myForm .glyphicon{
            display: none;
        }
    </style>
</head>

<style>
header {
  background-color: #ffcccc;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}


body {
	background: #eee !important;	
}

.wrapper {	
	margin-top: 80px;
  margin-bottom: 80px;
}

.form-signin {
  max-width: 380px;
  padding: 15px 35px 45px;
  margin: 0 auto;
  background-color: #fff;
  border: 1px solid rgba(0,0,0,0.1);  

  .form-signin-heading,
	.checkbox {
	  margin-bottom: 30px;
	}

	.checkbox {
	  font-weight: normal;
	}

	.form-control {
	  position: relative;
	  font-size: 16px;
	  height: auto;
	  padding: 10px;
		@include box-sizing(border-box);

		&:focus {
		  z-index: 2;
		}
	}

	input[type="text"] {
	  margin-bottom: -1px;
	  border-bottom-left-radius: 0;
	  border-bottom-right-radius: 0;
	}

	input[type="password"] {
	  margin-bottom: 20px;
	  border-top-left-radius: 0;
	  border-top-right-radius: 0;
	}
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
<header>
<h2>로그인</h2>
<button onclick="location.href='home'" class="button">home</button><br/></header>
  <div class="wrapper">
    <form class="form-signin" action="login" method="post">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="text" class="form-control" name="member_id" placeholder="Id"  /><br>
      <input type="password" class="form-control" name="password" placeholder="Password" />      
   	  <br/>
   	  <br/>
      <button class="button" type="submit">로그인</button>   
      <input class="button" type="button" value="회원가입" onclick="location.href='join'" style="text-align: center"/>  
    </form>
	

  </div>






</body>
</html>