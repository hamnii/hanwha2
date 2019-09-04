<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    <c:set var="path" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<style>
.button {
  display: inline-block;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color:  #e7e7e7;
  background-color:#0059b3;
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
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #ffcccc;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 15%;
  height: 600px; /* only for demonstration, should be removed */
  background: #ccc;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

nav ul li{
	height: 50px;
}

article {
  float: left;
  padding: 20px;
  width: 85%;
  background-color: #f1f1f1;
  height: 600px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
  content: "";
  display: table;
  clear: both;
}


/* Style the footer */
footer {
  background-color: #ffcccc;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>
<head>
<meta charset="UTF-8">

<title>응급동물병원조회</title>
</head>
<body>

<header>
  <h2>응급병원조회</h2>
</header>

<section>
  <nav>
    <ul>
     
      <li><button onclick="location.href='board'" class="button">귀여운동물들</button></li>
      <li><button onclick="location.href='list'" class="button">동물병원보기</button></li>
           
      <li>
   
      <c:if test="${member==null}">
          <li> <button onclick="location.href='login'" class="button">로그인</button></li>
		 <li>  <button onclick="location.href='join'" class="button">회원가입</button></li>

      </c:if>
      
      <c:if test="${member!=null}">
           <button onclick="location.href='logout'" class="button">로그아웃</button>
      </c:if>
      
      
      </li>
      
    </ul>
  </nav>
  
  <article>
	<img alt="이미지" src="${path }/resources/율무6.jpg" width="700px" height="500px">
    <img alt="이미지" src="${path }/resources/율무귀여운율무.jpg" width="700px" height="500px">
  </article>
</section>

<footer>
  <p></p>
</footer>