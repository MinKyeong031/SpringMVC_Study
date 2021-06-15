<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <link rel="stylesheet" type="text/css" href="css/login.css">
  </head>

<body width =100% height=100%>
    <form action="/test3" method="post" class="loginForm">
      
    <br><br><br><br><h2>Login</h2>
    <div class="idForm">
        <input type="text" name="uid" class="id" placeholder="ID">
      </div>
      <div class="passForm">
        <input type="password" name="upass" class="pw" placeholder="PW">
      </div>
      <div class="emailForm">
      	<input type="text" name="uemail" class="email" placeholder="EMAIL">
      </div>
      <button type="submit" class="btn" >
        LOGIN
      </button>
      
    </form>
  </body>
</html>