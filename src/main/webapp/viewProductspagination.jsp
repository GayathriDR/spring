<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagination with Spring Data JPA in Spring MVC</title>
</head>
<body>


	<div class="container" style="margin-top: 20px;">
		<jsp:useBean id="pagedListHolder" scope="request"
			type="org.springframework.beans.support.PagedListHolder" />
		<c:url value="/viewProducts.odc" var="pagedLink">
			<c:param name="p" value="~" />
		</c:url>

	<!-- 	<tg:paging pagedListHolder="${pagedListHolder}"
			pagedLink="${pagedLink}" /> -->
		<table class="table table-bordered">
			<tr>
			
				<th>PRODUCT_ID</th>
				<th>PRODUCT_NAME</th>
				<th>PRODUCT_QUANTITY</th>
				<th>PRODUCT_PRICE</th>
				<th>PRODUCT_VENDOR</th>

			</tr>
			<c:forEach items="${pagedListHolder.pageList}" var="item">
				<tr>
					<td>${item.productId}</td>
					<td>${item.productName}</td>
					<td>${item.productquantity}</td>
					<td>${item.productPrice}</td>
					<td>${item.productVendor }</td>
				</tr>
			</c:forEach>
		</table>
		<tg:paging pagedListHolder="${pagedListHolder}"
			pagedLink="${pagedLink}" />
	</div>

</body>
</html>