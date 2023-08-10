<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.form{
      margin-top:50px;
      padding-top: 40Px;
     margin:auto;
      height:500Px;
      width:500px;
      background-color:pink;
}
</style>

</head>
<body>
<div align="center" class="form">
<h1>Registration Form</h1>
<form action=Servlet2 method=post>
   <table >  
   <tr><td>Name : </td><td><input type =text name=txtName></td> </tr>
   <tr><td>UserId : </td><td><input type =text name=txtUid></td> </tr>
   <tr><td>Email : </td><td><input type =email name=txtEmail></td> </tr>
   <tr><td>Address : </td><td><input type =text name=txtAds></td> </tr>
   <tr><td>Date Of birth : </td><td><input type ="date" name=txtDate></td> </tr>
   <tr><td><input type ="submit" value="submit"></td><td><a href="search.jsp">hello</a></td></tr>


   
   </table>
</form>
</div>

</body>
</html>