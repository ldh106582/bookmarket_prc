<%@page import="com.springmvc.domain.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand bg-secondary">
		<div class="container">
			<a href="#">HOME</a>
		</div>
	</nav>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서 정보</h1>
		</div>
	</div>
	
	<% Book book = (Book) request.getAttribute("bookId"); %>  
		<div class="container">	
			<div class="row">
			<% if(book != null){ %> 
	 
				<div class="col-md-4 border border-danger">
					<% if(book.getBookimage() != null){ %>
						<img src="../resources/images/<%= book.getBookimage() %>" style="width : 100%" />
					<% }else { %>
						<img src="../resources/images/<%= book.getBookId() %>.png" style="width : 100%" />
					<% } %>
				</div>
				
				<div class="col-md-8 align-self-center border border-danger align-self-end">
					<p> 책이름 :	<%= book.getName() %>
					<p> 글쓴이 : <%= book.getAuthor() %>
					<p> 재고수 : <%= book.getUnitInStck() %>
					<p> 책소개 : <%= book.getDescription() %>
					<p> 금 액 : <%= book.getUnitPrice() %>
					<br><a href="./Books" class="btn btn-dark">돌아가기 &raquo;</a>
				</div>
			<%
					}
			%>
				
			</div>
		</div> 	
 	

	
	
</body>
</html>