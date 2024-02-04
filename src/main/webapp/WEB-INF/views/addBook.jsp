<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expense bg-dark">
		<div class="container">
			<a href="/bookmarket_prc/home">HOME</a>
		</div>
	</nav>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-5">추가할 도서를 입력하시오.</h1>
		</div>
	</div>
	
	<div class="container">
		<form:form modelAttribute="PlusBook" action="./add?${_csrf.parameterName}=${_csrf.token}" class="form-horizontal" enctype="multipart/form-data">
		<fieldset>
		
		<div class="form-group row">
			<label class="col-sm-2 control-label">도서ID</label>
			<div class="col-sm-3">
				<form:input path="bookId" class="form-control"/>
			</div>
		</div>
		
		<div class="form-group row">
			<label class="col-sm-2 control-label">도서명</label>
			<div class="col-sm-3">
				<form:input path="name" class="form-control"/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 control-label">가격</label>
			<div class="col-sm-3">
				<form:input type="number" path="unitPrice" class="form-control"/>
			</div>
		</div>
		
		<div class="form-group row">
			<label class="col-sm-2 control-label">글쓴이</label>
			<div class="col-sm-3">
				<form:input path="author" class="form-control"/>
			</div>
		</div>
		
		<div class="form-group row">
			<label class="col-sm-2 control-label">상세정보</label>
			<div class="col-sm-3">
				<form:input path="description" cols="50" rows="2" class="form-control" />
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 control-label">분야</label>
			<div class="col-sm-3">
				<form:input path="category" class="form-control"/>
			</div>
		</div>
		
		<div class="form-group row">
			<label class="col-sm-2 control-label">재고수</label>
			<div class="col-sm-3">
				<form:input type="number" path="unitInStck" class="form-control"/>
			</div>
		</div>
		
		<div class="form-group row">
			<label class="col-sm-2 control-label">출판일</label>
			<div class="col-sm-3">
				<form:input path="releasedate" class="form-control"/>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 control=label" >상태</label>
			<div class="col-md-3">
				<form:radiobutton  path="condition" value="NEw" />새상품
				<form:radiobutton  path="condition" value="old"/>중고상품
				<form:radiobutton path="condition" value="E-book"/>전자책
				
			</div>
		</div>
		
		<div class="form-group row">
			<label class="col-sm-2 control-label">이미지</label>
			<div class="col-md-7">
				<form:input path="bookimage" type="file" class="form-control"/>
			</div>
		</div>
		
		<div class="form-group row">
			<div class="col-md-offset-2 col-sm-10">
			<input type="submit" class="btn btn-success" value="등록">
			</div>
		</div>
		
		</fieldset>
		</form:form>
	</div>
</body>
</html>