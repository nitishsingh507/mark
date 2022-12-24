<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateLead">
		<pre>
		<input type="hidden" name="id" value="${lead.id }">
		First name<input type=text name= firstName value="${lead.firstName}">
		Last name<input type=text name=lastName value="${lead.lastName}">
		Email<input type=text name=email value="${lead.email}">
		Mobile<input type=text name=mobile value="${lead.mobile}">
		<input type=submit value=save>
		
		</pre>
	</form>
</body>
</html>