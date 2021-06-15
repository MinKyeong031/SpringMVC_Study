<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" type="text/css" href="css/register.css">
  </head>

<body width =100% height=100%>
    <form action="/register" method="post" class="loginForm">
      
    <br><br><br><br><h2>RegisterForm</h2>
     <div class="form">
     	<input type="text" name="user_name" class="input" placeholder="이름">
     </div>
    <div class="form">
        <input type="text" name="user_id" class="input" placeholder="아이디">
      </div>
      <div class="form">
        <input type="password" name="user_pw" class="input" placeholder="비밀번호">
      </div>
    <div class="form">
        <input type="text" name="user_email" class="input" placeholder="이메일">
      </div>
      <div class="form">
        <input type="text" name="user_addr1" class="input" placeholder="주소">
      </div>
      <div class="form">
      	<input type="text" name="user_addr2" class="input" placeholder="상세주소">
      </div>
      <button type="submit" class="btn" >
        Success
      </button>
      
    </form>
  </body>
</html>