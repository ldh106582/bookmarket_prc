<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="com.springmvc.exception.CategoryException"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<% ModelAndView modelAndView = new ModelAndView();
		CategoryException exception = (CategoryException) modelAndView.getModel().get("exception"); %>
	<nav class="navbar navbar-expand navbar-dart bg-dart">
		<div class="container">
			<div class="naver-header">
				<a href="#">HOME</a>
			</div>
		</div>
	</nav>
	
	<div class="jumbotron">
		<div class="container">
			<h2 class="alter alter-dnager">요청한 도서가 존재하지 않습니다.</h2>
		</div>
	</div>
	
	<div class="container">
		<p><%= exception %>
	</div>
	
</body>
</html>