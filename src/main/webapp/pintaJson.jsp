<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="org.miweb.objectModels.norma" %>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>PintaJSON</title>
	</head>
	<body>
	<h1>Norma PCI</h1>	
		<p>Nombre de la norma es: <s:property value = "norma.nombreNorma"/></p>
		<s:property value = "normaPCI.listaCapitulos"/>	
		
	<%
		norma normaPCI2 = new norma(); 
		System.out.println(normaPCI2.getNombreNorma());
	%>
      
      
	</body>
</html>