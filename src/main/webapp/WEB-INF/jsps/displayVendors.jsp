<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Vendors</title>
</head>
<body>
	<h3>Vendors:</h3>
	<table>
		<th>Id</th>
		<th>Code</th>
		<th>Name</th>
		<th>Type</th>
		<th>Email</th>
		<th>Phone</th>
		<th>Address</th>
		<c:forEach items="${vendors}" var="vendors">
			<tr>
				<td>${vendors.id}</td>
				<td>${vendors.code}</td>
				<td>${vendors.name}</td>
				<td>${vendors.type}</td>
				<td>${vendors.email}</td>
				<td>${vendors.phone}</td>
				<td>${vendors.address}</td>
				<td><a href="deleteVendor?id=${vendors.id}">Delete Vendor</a></td>
				<td><a href="showUpdate?id=${vendors.id}">Update Vendor</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="showCreate">Add Vendor</a>
</body>
</html>