<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Register details</h3>
<table>
<tr>
<th>EMAIL</th>

<th>USERNAME</th>

<th>PASSWORD</th>
<!--  <th>CONFIRM_PASSWORD</th>-->
</tr>
<c:forEach items="${data}" var="items">
  <tr>
  <td>${data.email}</td>
 
  <td>${data.username}</td>
  
  <td>${data.password}</td>
 <!--   <td>${data.cpassword}</td>-->
  </tr>
  </c:forEach>
  </table>
  <form action="newData.odc" name="form1" method="post"  onsubmit="return formValidation()"  id="form" class="form-inline" style="width:500px;margin:auto">
    <div class="form-group">
                        <label for="examplemail">User Name</label>
                        <input type="text" name="username" class="form-control" placeholder="Username" style="width:250px;" id="name" aria-describedby="basic-addon1" autocomplete="off"  value="${data.username}"  />
                    <span id="names" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
 <div class="form-group">
                        <label for="examplemail">Email</label>
                        <input type="text" name="email"  class="form-control" placeholder="Email" style="width:250px;" id="email" aria-describedby="basic-addon1" autocomplete="off" value="${data.email}" readonly   />
                    <span id="emailids" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
               
 <div class="form-group">
                        <label>Password</label>
                        <input type="password" name="password" class="form-control" placeholder="Password" style="width:250px;" id="password" aria-describedby="basic-addon1" autocomplete="off" value="${data.password}" />
                    <span id="passwords" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
 <div>
<button class="btn btn-outline-success" type="submit"   btn-clr="green">update</button>
</div>


</form>
  
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    <script src="validate-script.js"></script>

<footer class="fixed-bottom" style="background-color: #e3f2fd; text-align: center;">Copyright@All rights resrved</footer>
</body>
</html>