<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show lead</title>
</head>
<body>
<h2>You searched for</h2>
<table>
<tr><td>Id</td><td><input type="text" name="id" value="${lead.id}"></td></tr>
<tr><td>FirstName</td><td><input type="text" name="firstName" value="${lead.firstName}"></td></tr>
<tr><td>LastName</td><td><input type="text" name="lastName" value="${lead.lastName}"></td></tr>
<tr><td>Email</td><td><input type="text" name="email" value="${lead.email}"></td></tr>
<tr><td>Mobile</td><td><input type="text" name="mobile" value="${lead.mobile}"></td></tr>

</table>
</body>
</html>