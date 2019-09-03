<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.button {
  display: inline-block;
  font-size: 20px;
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
header {
  background-color: #ffcccc;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

</style>

<header><h2>게시글입력</h2>
	<button onclick="location.href='home'" class="button">home</button>
</header>

 <body>
 <br/>
 
<form action="boardinsert" method="post" enctype="multipart/form-data">
제목 : <input type="text" name="title" style="width:300px"><br>
<input type="hidden" name="member_id" value=${member.member_id }><br>
내용 : <textarea name="content" style="height: 300px" maxlength="2048"></textarea>

<br>
<input class="button" type="file" name="uploadfile">
<input class="button" type="submit" value="입력하기">
</form>

</body> 




</body>
</html>