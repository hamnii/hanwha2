<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
.button {
	display: inline-block;
	font-size: 25px;
	cursor: pointer;
	text-align: center;
	text-decoration: none;
	outline: none;
	color: #e7e7e7;
	background-color: #ff8080;
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

<meta charset="utf-8">
<title>응급동물병원조회</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
	$(function() {
		$("#myaddress").change(function() {
			addr = $("#myaddress").val();

			$.get("hospitalByAddress?addr=" + addr, function(data, status) {

				$("#here").html(data);
			});
		});
	});
</script>

</head>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.js"></script>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<body>


	<header>
		<h2>응급병원조회</h2>
		<button onclick="location.href='home'" class="button">home</button>
	</header>

	<select class="browser-default custom-select" id="myaddress" name="myaddress">		<option selected>근처 지역을 선택하세요</option>
		<c:forEach items="${etclist}" var="etc">
			<option>${etc}</option>
		</c:forEach>
	</select>

	<!-- <select id="myaddress" name="myaddress"
		style="width: 100px; height: 50px;">
		<c:forEach items="${etclist}" var="etc">
			<option>${etc}</option>
		</c:forEach>
	</select> -->

	<div id="here">
		<jsp:include page="hospitallist.jsp" />
	</div>



</body>
</html>

