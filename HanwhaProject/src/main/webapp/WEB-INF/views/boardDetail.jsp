<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:set var="path" value="${pageContext.request.contextPath}"></c:set>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>응급동물병원조회</title>
</head>
<style>
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
header {
  background-color: #ffcccc;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

</style>
<header><h2>게시물보기</h2>
	<button onclick="location.href='home'" class="button">home</button>
</header>
<body>
<br/>

<label style="font-size: 20px">글제목</label> : <input style="background-color: #ffcccc; width:950px;font-size: 20px"type="text" disabled="disabled" name="title" value="${board.title}"><br>
<br/>
<table border="1">
<tr>
	<th>사진</th>
	<th>내용</th>
	
</tr>
<tr>
	<td> <img alt="이미지" src="${path }/resources/${board.fileName}" width="400px" height="400px"></td>
	<td><input type="text" disabled="disabled" name="content" value="${board.content}" style="width:400px;height:400px;background-color: white" ></td>
	
	

</tr>

<!--사진 : <img alt="이미지" src="${path }/resources/${board.fileName}" width="400px" height="400px">
내용 : 
<input type="text" disabled="disabled" name="content"
 value="${board.content}" style="width:250px;height:500px" >  -->

</table>
	<c:if test="${member_id eq'admin'}">
	<button class="button" onclick="location.href='boarddelete?bno=${board.bno}'">게시물 삭제하기</button><br/><br/>
	<button class="button" onclick="location.href='boarddownload?folder=resources/&file=${board.fileName}'">사진 저장하기</button>
	</c:if>
	<c:if test="${member_id != 'admin' }">
	</c:if>
	
	<c:if test="${member_id eq board.member_id}">
	<button class="button" onclick="location.href='boarddelete?bno=${board.bno}'">게시물 삭제하기</button><br/><br/>
	<button class="button" onclick="location.href='boarddownload?folder=resources/&file=${board.fileName}'">사진 저장하기</button>
	</c:if>
	
</body>
</html>