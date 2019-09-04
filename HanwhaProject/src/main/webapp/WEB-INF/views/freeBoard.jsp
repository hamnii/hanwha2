<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    <c:set var="path" value="${pageContext.request.contextPath}"></c:set>
   
<!DOCTYPE html>
<html>
<head>
<style>

header {
  background-color: #ffcccc;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}
footer {
  background-color: #ffcccc;
  padding: 10px;
  text-align: center;
  color: white;
}

.button {
  display: inline-block;
  font-size: 25px;
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

nav {
  float: left;
  width: 15%;
  height: 600px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}


article {
  float: left;
  padding: 20px;
  width: 85%;
  background-color: #f1f1f1;
  height: 600px; /* only for demonstration, should be removed */
}
</style>
<meta charset="utf-8">
<title>응급동물병원조회</title>
<script>

</script>
</head>
<body>


<header><h2>자유게시판</h2>

	<button onclick="location.href='home'" class="button">home</button>
</header>
<nav>
</nav>
<br/>
<c:if test="${member!=null}">
<button class="button" onclick="location.href='boardinsert'">글쓰기</button><br/><br/>
</c:if>
<c:if test="${member==null}">
<button class="button" style="display: none;" onclick="location.href='boardinsert'">글쓰기</button><br/><br/>
</c:if>
<table border="1">
			<tr>
				<th style="width: 40px">순서</th>
				<th style="width: 200px">제목</th><th>아이디</th>
				<th style="width: 100px">작성일자</th>
				<th style="width: 100px">이미지 미리보기</th>
			
			</tr>
			<c:set var="cnt" value="0"/>
			<c:forEach var="board" items="${boardlist }">
			<tr>
			    <c:set var="cnt" value="${cnt+1}"/>
				<td>${cnt}</td>
				<td><a href="boarddetail?bno=${board.bno}">${board.title}</a></td>
				<td>${board.member_id}</td> 
				<td>${board.writedate}</td>
				<td><img alt="이미지" src="${path }/resources/${board.fileName}" width="300px" height="300px">
			</tr>
			</c:forEach>
		</table>


	


</body>
</html>




