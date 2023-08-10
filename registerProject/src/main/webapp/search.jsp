<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" class="form">
<h1>Search Records</h1>
<form action="SearchServlet" method="post">
<table>
<tr><td>Name :</td><td><input type="text" placeholder="Enter Name" name="srchName"></td></tr>
<tr><td>UserId :</td><td><input type="text" placeholder="Enter UserId" name="srchUId"></td></tr>
<tr><td><input type="submit"  value="get result"></td></tr>
</table>
</form>
</div>


</body>
</html>