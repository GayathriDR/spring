<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
</head>
<body>
<div class="container-fluid">
        <nav class="navbar navbar-dark default-color">
<form action="changepassword.odc" method="post" id="form" class="form-inline" style="width:500px;margin:auto">

   <div class="input-group">
   <div class="input-group">
 <span class="input-group-addon" id="basic-addon1">Email</span></div>
 <br/>
 <div>
 <input type="text" class="form-control" placeholder="Email" name="email" aria-describedby="basic-addon1">
 </div>
 <br/>
 <div class="input-group">
   <span class="input-group-addon" id="basic-addon1">random Password</span></div><br/>
   
   <div><input type="password" class="form-control" placeholder="randPassword" name="randompassword" aria-describedby="basic-addon1">
  	</div>
 <br />
 <div class="input-group">
   <span class="input-group-addon" id="basic-addon1">Password</span></div><br/>
   
   <div><input type="password" class="form-control" placeholder="Password" name="password" aria-describedby="basic-addon1">
  	</div>
 <br />
 <div class="input-group">
  <span class="input-group-addon" id="basic-addon1">Confirm Password</span></div><br/>
  
  <div>
   <input type="password" class="form-control" placeholder="confirm Password" name="cpassword" aria-describedby="basic-addon1">
  </div>
 <br />
 <br />
 <div>
<button class="btn btn-outline-success" type="submit" btn-clr="green">resetpassword</button>
</div>
</body>
</html>