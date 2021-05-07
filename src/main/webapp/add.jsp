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
            <p class = "text-center">product Information</p>
        </div>
    </nav>
    <form action="add.odc" name="form1"  method="post"    id="form" class="form-inline" style="width:500px;margin:auto">
   		<div class="form-group">
                        <label for="examplproduct">Product Name</label>
                        <input type="text" name="productName" class="form-control" placeholder="productname" style="width:250px;" id="productname" aria-describedby="basic-addon1" autocomplete="off"  />
                    <span id="names" class="text-danger font-weight-bold"></span>
                    </div>
                    <br /> 
       <div class="form-group">
 			 <label for="sel1">Product Quantity:</label>
  				<select class="form-control" name="productquantity" id="sel1" style="width:250px;">
  				  <option>1</option>
   				  <option>2</option>
    			  <option>3</option>
   				  <option>4</option>
 			 </select>
		</div>
		<br />
		<div class="form-group">
                        <label for="examplproduct">Product Price</label>
                        <input type="text" name="productPrice" class="form-control" placeholder="productname" style="width:250px;" id="productprice" aria-describedby="basic-addon1" autocomplete="off"  />
                    <span id="names" class="text-danger font-weight-bold"></span>
                    </div>
                    <br /> 
         <div class="form-group">
 			 <label for="sel1">Product Vendor:</label>
  				<select class="form-control" name="productVendor" id="sel1" style="width:250px;">
  				  <option>Amul</option>
   				  <option>Horizon</option>
    			  <option>Horlicks</option>
   				  <option>Ritz</option>
   				  <option>Baskin Robbins</option>
 			 </select>
		</div>
		<br />
        <!--   <select class="form-select" size="5" aria-label="size 5 select example" style="width:250px;">
  <option selected>Product Vendor:</option>
  <option value="1">Amul</option>
  <option value="2">Horizon Organic</option>
  <option value="3">Horlicks</option>
  <option value="4">Ritz</option>
  <option value="5">Baskin Robbins</option>
</select>
<br /> -->
<button class="btn btn-outline-success" type="submit"   btn-clr="green">Add</button>


</form>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js" integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj" crossorigin="anonymous"></script>
    <script src="validate-script.js"></script>

<footer class="fixed-bottom" style="background-color: #e3f2fd; text-align: center;">Copyright@All rights resrved</footer>
</body>
</html>