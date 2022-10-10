<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead info</title>
</head>
<body>
  <h2>lead|| info</h2>
  firstname ${lead.firstname}<br/>
  lastname ${lead.lastname }<br/>
  email ${lead.email }<br/>
  mobile ${lead.mobile }<br/>
  leadsource ${lead.leadsource }<br/>
  gender ${lead.gender }<br/>
  <form action="convertlead" method="post">
  <input type="hidden" name="id" value="${lead.id }"/>
  <input type ="submit" value="convert"/> 
  </form>
</body>
</html>