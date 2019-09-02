<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>



<select>
	<option>월요일</option>
	<option>화요일</option>
	<option>수요일</option>
	<option>목요일</option>
	<option selected>금요일</option>

</select>
</body>
</html>
