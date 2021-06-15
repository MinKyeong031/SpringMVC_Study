<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css"/>
</head>
<body>
<br>
	<a href="/test1?a=100&b=200&c=300">param으로 받기 |  </a>
	<a href="/test2">model으로 받기 |  </a>
	<a href="/test3">Login |  </a>
	<a href="/test4">ModelAndView |  </a>
	<a href="/test5?a=100&b=200&c=300">@ModelAttribute1 |  </a>
	<a href="/test6?a=400&b=500&c=600">@ModelAttribute 자동주입1 |  </a>
	<a href="/test7?a=700&b=800&c=900">@ModelAttribute 자동주입2 |  </a>
</body>
</html>