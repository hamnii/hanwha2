<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<style>
.button {
  display: inline-block;
  padding: 10px 15px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color:  #e7e7e7;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
  float:right;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
<meta charset="utf-8">
<title>Insert title here</title>
<script>

</script>
</head>
<body>


<div style="background-color:#ffcccc ; height:150px;text-align: center;font-size:30px;vertical-align:middle;">
</br>자유게시판
	<button onclick="location.href='home'" class="button">home</button>
</div>
<button onclick="location.href='boardinsert'">글쓰기</button>
<table border="1">
			<tr>
				<th>글번호</th>
				<th>제목</th><th>아이디</th>
				<th>작성일자</th>
			
			</tr>
			<c:forEach var="board" items="${boardlist }">
			<tr>
				<td>${board.bno}</td>
				<td>${board.title }</td>
				<td>${board.id}</td>
				<td>${board.writedate}</td>
				 
			</tr>
			</c:forEach>
		</table>


	



</body>
</html>

