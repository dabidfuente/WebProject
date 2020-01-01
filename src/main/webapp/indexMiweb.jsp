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
			<label>Requisito a recuperar </label>
		  	<input id="id_requisito" name="id_requisito" type="text" size="2" />
		  	<!--<s:textfield name="JsonTest" size="2" label="Requisito a recuperar" />
		  	-->
		  	<button type="submit"> Ok </button>
		</s:form>
	</body>
</html>