<html>
<body>
<h1>JAX-RS @FormQuery Testing</h1>

	<form action="webapi/customer/add" method="post">
		<p>
			Name : <input type="text" name="name" />
		</p>
		<p>
			Age : <input type="text" name="age" />
		</p>
		<input type="submit" value="Add Customer" />
		
	</form>
   <form action="webapi/customer" method="get">
  <input type="submit" value="Get Customers">
</form>
</body>
</html>
