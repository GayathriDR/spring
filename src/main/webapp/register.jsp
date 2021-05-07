<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar navbar-light" style="background-color: #e3f2fd;">
        <div class="container-fluid ">
            <a class="navbar-brand" href="#">X-workz</a>
        </div>
    </nav>
    <div class="form-group row">
        <nav class="navbar navbar-dark default-color">
        <form action="register.odc" name="form1"  onsubmit="return formValidation()"  id="form" class="form-inline" style="width:500px;margin:auto">
    <div class="form-group">
                        <label for="examplemail">User Name</label>
                        <input type="text" name="username" class="form-control" placeholder="Username" style="width:250px;" id="name" aria-describedby="basic-addon1" autocomplete="off"  />
                    <span id="names" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
    <div class="form-group">
                        <label for="examplemail">Email</label>
                        <input type="text" name="email" class="form-control" placeholder="Email" style="width:250px;" id="email" aria-describedby="basic-addon1" autocomplete="off"  />
                    <span id="emailids" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
                    <div class="form-group">
                        <label>Password</label>
                        <input type="password" name="password" class="form-control" placeholder="Password" style="width:250px;" id="password" aria-describedby="basic-addon1" autocomplete="off" />
                    <span id="passwords" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
                   <div class="form-group">
                        <label>Confirm Password</label>
                        <input type="password" name="cpassword" class="form-control" placeholder=" confirm Password" style="width:250px;" id="confirmpassword" aria-describedby="basic-addon1" autocomplete="off" />
                    <span id="confirmpasswords" class="text-danger font-weight-bold"></span>
                    </div>
                    <br />
                    

<div>
<button class="btn btn-outline-success" type="submit"   btn-clr="green">register</button>
</div>


</form>
</nav>
</div>
<script type="text/javascript">
function formValidation(){
	
	var name = document.getElementById('name').value;
    var emailId = document.getElementById('email').value;
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmpassword').value;
    
    if (name.value == "" || ((name).length < 3) || ((name).length > 20)) {
        document.getElementById('names').innerHTML = "please fille the username";
        return false;
       
    }
    else {
        document.getElementById('names').innerHTML = "";
    }
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
    if (password == "") {
        document.getElementById('passwords').innerHTML = "please fille the password";

        return false;
    }
    else {
        document.getElementById('passwords').innerHTML = "";
    }
    if ((password.length <= 4) || (pass.length >= 21)) {
        document.getElementById('passwords').innerHTML = "please fille the password";

        return false;

    }
    else {
        document.getElementById('passwords').innerHTML = "";
    }
    if(confirmPassword=="")
    {
        document.getElementById('confirmpasswords').innerHTML = "please fille the confirm password";

        return false;
    }
    else {
        document.getElementById('confirmpasswords').innerHTML = "";
    }   
    if(!(confirmPassword.equals(password)))
    {
        document.getElementById('confirmpasswords').innerHTML = "please fille same as password";

        return false;
    }
    else {
        document.getElementById('confirmpasswords').innerHTML = "";
    }   

    
}
</script>
	<a href="viewRegister.odc">view register</a>
	<a href="login.jsp" class="text-success">login</a>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    <script src="validate-script.js"></script>

<footer class="fixed-bottom" style="background-color: #e3f2fd; text-align: center;">Copyright@All rights resrved</footer>
</body>
</html>