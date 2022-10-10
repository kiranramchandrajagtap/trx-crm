<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
     <%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bill</title>
</head>
<body>
<h2>bill| search Result</h2>
  <table>
  
  <tr>
  <th>First Name </th>
  <th>Last Name </th>
  <th>Email</th>
  <th>Mobile </th>
  <th>ProductName</th>
  <th>amount</th>
  </tr>
  
  
  <c:forEach items="${bill }" var="bill" >
   <tr>
  <td><a href="getLeadbyId?=id=${bill.id }">${bill.firstname } </a></td>
  <td>${bill.lastname } </td>
  <td>${bill.email } </td>
  <td>${bill.mobile} </td>
   <td>${bill.productName} </td>
    <td>${bill.amount} </td>
  </tr>
  </c:forEach>
  
  
  
  </table>
</body>
</html>