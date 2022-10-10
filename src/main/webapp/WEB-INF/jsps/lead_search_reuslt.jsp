<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
     <%@ taglib  prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h2>Lead| search Result</h2>
  <table>
  
  <tr>
  <th>First Name </th>
  <th>Last Name </th>
  <th>Email</th>
  <th>Mobile </th>
  <th>leadsource</th>
  <th>gender</th>
  </tr>
  
  
  <c:forEach items="${leads }" var="lead" >
   <tr>
  <td><a href="getLeadbyId?=id=${lead.id }">${lead.firstname } </a></td>
  <td>${lead.lastname } </td>
  <td>${lead.email } </td>
  <td>${lead.mobile} </td>
   <td>${lead.leadsource} </td>
    <td>${lead.gender} </td>
  </tr>
  </c:forEach>
  
  
  
  </table>
</body>
</html>