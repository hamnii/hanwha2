<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>test</title>
</head>
<body>

<h1>회사명 : ${company }</h1>
<h1>부서 : ${dept }</h1>
<h1>이름 : ${myname }</h1>
<hr>

<form action="paramtest2">
id:<input name="userid" type="number"><br>
name:<input name="username" type="text"><br>
<input type="submit" value="서버전송">
<!--서버전송이라는 버튼을 누르면 paramtes2t로 넘어감. get방식으로!  -->
</form>

<form action="paramtest">
id:<input name="userid" type="number"><br>
name:<input name="username" type="text"><br>
<input type="submit" value="서버전송">
<!--서버전송이라는 버튼을 누르면 paramtest로 넘어감. get방식으로!  -->


</form>


</body>
</html>