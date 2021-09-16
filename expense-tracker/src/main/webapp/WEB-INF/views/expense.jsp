<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
xmlns:th="http://www.thymeleaf.org"/>
<head>
<meta charset="ISO-8859-1">
<title>Expense-Tracker</title>
<style type="text/css">
	body
	{
		background-color:#FFF0F5;
		font-family: cursive;
	}
	.heading
	{
		text-align:center;
		font-family: algerian;
		font-size:40px;
	}
	button
	{
		font-family:cursive;
	}
	.input
	{
		margin-left:400px;
		margin-bottom:200px;
		
	}
	.input1
	{
		margin-right:100px;
	}
	.input2
	{
		margin-right:100px;
	}
	.input3
	{
		margin-right:100px;
	}
	.submit
	{
		margin-left:300px;
		margin-top:100px;
		font-size:20px;
	}
	
</style>
</head>
<body>
	<h1 align="center" class="heading">Add/Edit Expense</h1>
	<form:form action="${contextRoot}/expense" method="post" modelAttribute="expense" class="input">
		<form:hidden path="id" />
		<form:input  class="input1" path="expensename" placeholder="Enter expense name"/>
		<form:input class="input2" path="amount" placeholder="Enter expense amount"/>
		<form:textarea class="input3" path="note" placeholder="Enter note(optional)"/><br>
		<button type="submit" class="submit">Done</button>
	</form:form>
	
</body>
</html>