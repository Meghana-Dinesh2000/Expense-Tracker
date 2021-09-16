<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
xmlns:th="http://www.thymeleaf.org"/>
<head>
<link rel="stylesheet" href="../style.css" type="text/css"></link>
<meta charset="ISO-8859-1">
<style type="text/css">
	body
	{
		background-color:#F5F5DC;
		font-family: cursive;
	}
	.heading
	{
		text-align:center;
		font-family:algerian;
		font-size:50px;
	}
	.add
	{
		margin-left:700px;
		margin-top:100px;
	}
	button
	{
		font-family:cursive;
	}
	
</style>

<title>Expense-Tracker</title>
</head>
<body>
	<h1 class="heading">Expense Tracker</h1>
	<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Expenses</h2></caption>
            <tr>
                <th>EXPENSE NAME</th>
                <th>EXPENSE AMOUNT</th>
                <th>DESCRIPTION</th>
                <th>EDIT</th>
                <th>DELETE</th>
            </tr>
            <c:forEach var="expense" items="${expenses}">
                <tr>
                    <td><c:out value="${expense.expensename}" /></td>
                    <td><c:out value="${expense.amount}" /></td>
                    <td><c:out value="${expense.note}" /></td>
                    <td><a href="${contextRoot}/expense/${expense.id}"><button type="button">Edit this Expense</button></a></td>
					<td><a href="${contextRoot}/expense/${expense.id}/delete"><button type="button">Delete this expense</button></a></td>
                </tr>
            </c:forEach>
        </table>
    </div>	
	
	<a href="${contextRoot}/expense" ><button type="button" class="add"><h3 align="center">Add Expense</h3></button></a>
	
</body>
</html>