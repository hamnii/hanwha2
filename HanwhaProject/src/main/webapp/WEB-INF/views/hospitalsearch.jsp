<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
<meta charset="utf-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(function(){
  $("#myaddress").change(function(){
	 addr = $("#myaddress").val();
	 
     $.get("hospitalByAddress?addr="+addr, function(data, status){
    	   
           $("#here").html(data);
     }); 
  });
});
</script>

</head>
<body>


<header>
<h2>응급병원조회</h2>
	<button onclick="location.href='home'" class="button">home</button>
</header>
				<select id="myaddress" name="myaddress" style="width:100px;height:50px;" >
				<c:forEach items="${etclist}" var="etc">
					<option>${etc}</option>
				</c:forEach></select>

<div id="here">
    <jsp:include page="hospitallist.jsp" />
</div>




	



</body>
</html>

