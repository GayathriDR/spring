 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
   <title>Spring 4 MVC Hello World Example with Maven Eclipse</title>
   <link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' 
   type='text/css' media='all' /> 
</head>
<body>
</head>
<body>
<h3>Register details</h3>
<table>
<tr>
<th>EMAIL</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>CONFIRM_PASSWORD</th>
</tr>
<c:forEach items="${list}" var="items">
  <tr>
  <td>${items.email}</td>
  <td>${items.username}</td>
  <td>${items.password}</td>
  <td>${items.cpassword}</td>
  </tr>
  </c:forEach>
  </table>
  
  
   
   <script src="webjars/jquery/2.2.4/jquery.min.js"></script>
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   </body>
   </html>
   
   
