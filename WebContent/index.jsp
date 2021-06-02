<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
td
{
text-align:center;
}

</style>
<meta charset="ISO-8859-1">
<title>Veification de date</title>
</head>
<body>
<form action="ValidationServlet" method="post">
<table align="center">
<tr><td colspan="2"><h2>Validation de date</h2></td></tr>
<tr><td>jour</td><td><input name="jour" required type="number" min="1" max="31"></td></tr>
<tr><td>mois</td><td><input type="number" required name="mois" min="1" max="12"><td></tr>
<tr><td>An</td><td><input type="number" required name="an" min="1000" max="3000"></td></tr>
<tr><td colspan="2"><input type="submit" value="envoyer"> </td></tr>

</table>


</form>
<br>
<%
if(request.getParameter("message")!=null)
{

%>
<h3><%= request.getParameter("message") %></h3>
<% } %>

</body>
</html>