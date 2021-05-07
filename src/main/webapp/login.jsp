<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title>x-workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar navbar-light" style="background-color: #e3f2fd;">
        <div class="container-fluid ">
            <a class="navbar-brand" href="#">X-workz</a>
        </div>
    </nav>
<form action="login.odc" onsubmit="return validate()" class="bg-light" name="form1" >
<div class="form-group">
    <label for="examplemail">Email</label>
    <input type="text" name="email" class="form-control" placeholder="Email" style="width:250px;" id="email" aria-describedby="basic-addon1" autocomplete="off"  />
     <span id="emailids" class="text-danger font-weight-bold"></span>
 <br />
 </div>
 

 <div class="form-group">
                        <label>Password</label>
                        <input type="password" name="password" class="form-control" placeholder="Password" style="width:250px;" id="password" aria-describedby="basic-addon1" autocomplete="off" />
                    <span id="passwords" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
 

 <div>
                       
     <button class="btn btn-outline-success" type="submit" btn-clr="green" >log-in</button>
                        
     <a href="getemail.jsp" class="text-success">forgot password</a>
 </div>
 
 </form>
 <script type="text/javascript">
            function validate() {
                var emailId = document.getElementById('email').value;
                var pass = document.getElementById('password').value;

                if (emailId == "") {
                    document.getElementById('emailids').innerHTML = "please fille the emailid";

                    return false;
                }
                else {
                    document.getElementById('emailids').innerHTML = "";
                }


                if (emailId.indexOf("@") <= 0) {
                    document.getElementById('emailids').innerHTML = "please fille proper emailid";

                    return false;

                }
                else {
                    document.getElementById('emailids').innerHTML = "";
                }
                if ((emailId.charAt(emailId.length - 4) != ".") && (emailId.charAt(emailId.length - 3) != ".")) {
                    document.getElementById('emailids').innerHTML = "please fille the proper emailid";

                    return false;
                }
                else {
                    document.getElementById('emailids').innerHTML = "";
                }
                if (pass == "") {
                    document.getElementById('passwords').innerHTML = "please fille the password";

                    return false;
                }
                else {
                    document.getElementById('passwords').innerHTML = "";
                }
                if ((pass.length <= 4) || (pass.length >= 21)) {
                    document.getElementById('passwords').innerHTML = "please fille the password";

                    return false;

                }
                else {
                    document.getElementById('passwords').innerHTML = "";
                }
              }
            
        </script>
	

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    <script src="validate-script.js"></script>
     <footer class="fixed-bottom" style="background-color: #e3f2fd; text-align: center;">Copyright@All rights resrved</footer>
</body>
</html>