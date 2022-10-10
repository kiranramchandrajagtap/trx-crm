<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bill info</title>
</head>
<body>
  <h2>bill|| info</h2>
  firstname ${bill.firstname}<br/>
  lastname ${bill.lastname }<br/>
  email ${bill.email }<br/>
  mobile ${bill.mobile }<br/>
  productName ${bill.productName }<br/>
  amount ${bill.amount }<br/>
  <form action="convertbill" method="post">
  <input type="hidden" name="id" value="${bill.id }"/>
  <input type ="submit" value="convert"/> 
  </form>
</body>
</html>