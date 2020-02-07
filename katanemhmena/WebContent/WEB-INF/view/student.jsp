<!DOCTYPE html>
<html>
<head>
<title>Student</title>
</head>
<body>
	<h1>Displaying Student</h1>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<td><%=request.getAttribute("am")%></td>
			<td><%=request.getAttribute("first_name")%></td>
			<td><%=request.getAttribute("last_name")%></td>
			<td><%=request.getAttribute("email")%></td>
			<td><%=request.getAttribute("date_of_birth")%></td>
			<td><%=request.getAttribute("year_of_enrollment")%></td>
			<td><%=request.getAttribute("dep_name")%></td>
		</tr>
	</table>
	<hr />
</body>
</html>