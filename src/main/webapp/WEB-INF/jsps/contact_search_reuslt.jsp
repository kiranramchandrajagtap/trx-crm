<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
      <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h2>contact| search Result</h2>
  <table>
  
  <tr>
  <th>First Name </th>
  <th>Last Name </th>
  <th>Email</th>
  <th>Mobile </th>
  <th>leadsource</th>
  <th>gender</th>
  <th>Billing</th>
  </tr>
  
  
  <c:forEach items="${contacts}" var="contact" >
   <tr>
  <td><a href="getContactById?id=${contact.id }">${contact.firstname }</a> </td>
  <td>${contact.lastname } </td>
  <td>${contact.email } </td>
  <td>${contact.mobile} </td>
   <td>${contact.leadsource} </td>
    <td>${contact.gender} </td>
     <td><a href="generateBill?id=${contact.id }">billing</a> </td>
    
    
  </tr>
  </c:forEach>
  
  
  
  </table>
</body>
</html>