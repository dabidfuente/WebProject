<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Mi Web Project</title>
	</head>
	<body>
	<h1>Mi Web</h1>
		<s:form action="JsonTest" method="post">
		  	<s:textfield name="JsonTest" label="Requisito a recuperar" />
		  	<s:submit value="Submit" />
		</s:form>
	</body>
</html>