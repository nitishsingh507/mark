<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lead Create</title>
</head>
<body>
	<h2>create new lead</h2>
	<form action="saveLead" method="post">
		<pre>
			first name<input type="text" name="firstName"/>
			Last name<input type="text" name="lastName"/>
			Email<input type="text" name="email"/>
			Mobile<input type="text" name="mobile"/>
			<input type="submit" value="save">
		</pre>
	</form>

</body>
</html>