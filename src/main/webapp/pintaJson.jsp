<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>PintaJSON</title>
	</head>
	<body>
	<h1>Mi Web PintaJSON</h1>
	     <p><s:property value="#capitulo.tituloCapitulo" /></p>
	     <p><a href="<s:url action='indexMiweb'/>">Home Page</a></p>
	</body>
</html>