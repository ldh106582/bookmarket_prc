<%@page import="com.springmvc.domain.Book"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand bg-dark">
		<div class="container">
			<a href="#">HOME</a>
		</div>
	</nav>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-5">도현이가 만든 도서목록</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="row" align="left">	
				<% List<Book> list = (List<Book>) request.getAttribute("allbook"); 
	
					if(list != null) { 
						for(Book book : list){
				%>
				<div class="col-md-4 border border-danger">
					<% if(book.getBookimage() != null)
					{
						%>
					
						<img src="./resources/images/<%= book.getBookimage().getOriginalFilename() %>" style="width : 80%"/>
					<% 
					} else {
					%>
						<img src="./resources/images/<%= book.getBookId() %>.png " style="width : 80%"/>
					<%
					}
					%>
			
					<p> 지은이 : <%= book.getAuthor() %>	
					<p> 소개 : <%= book.getDescription() %>
					<p> 금액 : <%= book.getUnitPrice() %>
					<p> 재고량 : <%= book.getUnitInStck() %>
					<br><a class="btn btn-success" align="left" role="button" href= "./Books/Book?id=<%= book.getBookId()%>" >상세정보 &raquo;</a>		
				</div>
				<%
					}
				}
				%>
		</div>
	</div>
</body>
</html>