<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/register" method="post" class="loginForm">
      
    <br><br><br><br><h2>RegisterForm</h2>
     <div class="form">
     	<input type="text" name="user_name" value="${requestScope.uesrDTO.user_name } class="input" placeholder="이름">
     </div>
    <div class="form">
        <input type="text" name="user_id"  value="${requestScope.uesrDTO.user_id } class="input" placeholder="아이디">
      </div>
      <div class="form">
        <input type="password" name="user_pw"  value="${requestScope.uesrDTO.user_pw } class="input" placeholder="비밀번호">
      </div>
    <div class="form">
        <input type="text" name="user_email"  value="${requestScope.uesrDTO.user_email } class="input" placeholder="이메일">
      </div>
      <div class="form">
        <input type="text" name="user_addr1" value="${requestScope.uesrDTO.user_addr1 }  class="input" placeholder="주소">
      </div>
      <div class="form">
      	<input type="text" name="user_addr2"  value="${requestScope.uesrDTO.user_addr2 } class="input" placeholder="상세주소">
      </div>
      <button type="submit" class="btn" >
        Success
      </button>
      
    </form>
</body>
</html>