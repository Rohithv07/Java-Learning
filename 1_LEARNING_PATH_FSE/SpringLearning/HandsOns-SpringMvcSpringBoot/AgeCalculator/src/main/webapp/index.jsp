<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<form action="AgeCalculator" method="get">
		<table>
			<caption>Age Calculator</caption>
			<tr>
				<td>Enter Name :</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td>Select Birth Date :</td>
				<td><input type="date" id="dob" name="name" required="required"
					placeholder="dd-mm-yyyy" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Calculate Age"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</table>

	</form>
	<br>
	<br>
	<h2 id="result">${name} ${result}</h2>
</body>
</html>