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
</head>
<body>


<div style="background-color:#ffcccc ; height:150px;text-align: center;font-size:30px;vertical-align:middle;">
</br>응급병원조회
	<button onclick="location.href='home'" class="button">home</button>
</div>
<table border="1">
			<tr>
				<th>병원이름</th><th>병원주소</th>
				<th>병원 전화번호</th>
				<th>병원 영업시간</th>
				<th>구분</th>
			</tr>
			<c:forEach var="hospital" items="${hospitallist }">
			<tr>
				<td>${hospital.hospital_name}</td>
				<td>${hospital.hospital_address}</td>
				<td>${hospital.phone}</td>
				<td>${hospital.business_hour}</td>
				<td>${hospital.etc}</td>
				 
			</tr>
			</c:forEach>
		</table>


	



</body>
</html>

