<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>      
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
   <h2>Lead||create</h2>
   <form action ="savelead" method="post" >
   <pre>
   firstname<input type="text" name="firstname"/>
   lastname<input type="text" name="lastname"/>
   email<input type ="text" name="email"/>
   mobile<input type ="text" name="mobile"/>
   lead source      <select name="leadsource">
                   <option value="radio">radio</option>
                   <option value="tv">tv</option>
                   <option value="trade show">trade show</option>
                      <option value="news paper">news paper</option>
                     </select>
       gender:              
         male<input type="radio" name="gender" value="male"/> 
         female <input type="radio" name="gender" value="female"/>
         <input type="submit"  value="save"/>
   
   
   
   </pre>
   
   </form>
                 
</body>
</html>