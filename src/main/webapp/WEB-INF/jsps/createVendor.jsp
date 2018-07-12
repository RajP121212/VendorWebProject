<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vendor Web Project</title>
</head>
<body>

	<pre id="pre">
	
		<form action="saveVendor" method="post">
		
			Id: <input type="text" name="id" class="id" required/>
			Code: <input type="text" name="code" class="code" required/>
			Name: <input type="text" name="name" class="name" required/> 
			Type: 	<select class="type" name="type" required>
						<option>----</option>
						<option>Regular</option>
						<option>Contract</option>
					</select>
			Email: <input type="text" name="email" class="email" placeholder="john.doe@example.com" required/>
			Phone: <input type="text" name="phone" class="phone" placeholder="123-456-7890" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required/>
			Address: <textarea name="address" rows="4" cols="50" class="address"></textarea>
			
			<button id="save">Save</button>
		</form>
		${message}
		<br>
		<a href="displayVendors">View All</a>
	</pre>

</body>
</html>