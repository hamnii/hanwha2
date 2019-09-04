<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>응급동물병원조회</title>
</head>
<style>
.button {
	display: inline-block;
	font-size: 20px;
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

<header>
	<h2>게시글입력</h2>
	<button onclick="location.href='home'" class="button">home</button>
</header>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.js"></script>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>


<body>
	<br />
	<div class="container">
		<form action="boardinsert" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label>제목</label> <input type="text" name="title"
					class="form-control" id="title" placeholder="제목">
			</div>
			<!--  제목 : <input type="text" name="title" style="width:300px"><br>-->
			<input type="hidden" name="member_id" value=${member.member_id }><br>

			<div class="form-group">
				<label>내용</label>
				<textarea class="form-control" name="content" id="content" rows="10"
					placeholder="내용을 입력하세요"></textarea>
			</div>

			<!--내용 : <textarea name="content" style="height: 300px" maxlength="2048"></textarea> -->

			<br/> <input class="button" type="file" name="uploadfile" style="font-size: 15px">
			<br/>
			<input class="button" type="submit" value="입력하기" style="font-size: 15px">
		</form>
	</div>
</body>




</body>
</html>