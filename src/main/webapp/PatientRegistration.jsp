<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Registration</title>
</head>
<body>

<h1 align="center"><i>Patient Registration</i></h1>

<form action="submit">

<table>
	<tr>
		<td>Name</td>
		<td></td>
		<td> <input type="text" id="firstName" value= '${patient.firstName}'> </td>
		<td> <input type="text" id="middleName" value= '${patient.middleName}'></td>
		<td> <input type="text" id="lastName" value= '${patient.middleName}'></td>
	</tr>
	
	<tr>
		<td> </td>
		<td> </td>
		<td> </td>
		<td> </td>
	</tr>
	
</table>
</form>

</body>
</html>