<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<style>

</style>
<meta charset="utf-8">
<title>응급동물병원조회</title>
</head>
<style>
</style>
<body>

<table border="1">
			<tr>
				<th>병원이름</th>
				<th>병원주소</th><th>병원 전화번호</th>
				<th>영업시간</th>
				
			</tr>
			
			
			<c:forEach var="hospital" items="${hospitallist }">
			<tr>
				<td>${hospital.hospital_name}</td>
				<td>${hospital.hospital_address}</td>
				<td>${hospital.phone}</td>
				<td>${hospital.business_hour}</td>
				 
			</tr>
			</c:forEach>
		</table>


	



</body>
</html>

