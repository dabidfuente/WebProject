<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>PintaJSON</title>
	</head>
	<script type="text/javascript">
	</script>
	<body>
	<h1>Mi Web PintaJSON </h1>
		
		<s:textfield name="IdRequisitoRecuperado" size="2" label="Requisito recuperado"/>
	    <s:textfield name="IdCapituloRecuperado" size="50" label="Capitulo recuperado"/>
	    
	    
	    <p><s:property value="JSON" /></p>
	     <p><a href="<s:url action='indexMiweb'/>">Home Page</a></p>
	</body>
</html>