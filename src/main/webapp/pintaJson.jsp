<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="com.google.gson.Gson" %>
<%@page import="org.miweb.beans.formularioBean"%>
<%@page import="org.miweb.objectModels.capitulo"%>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>PintaJSON</title>
			</head>
	
	<script type="text/javascript"></script>
	
	<body>
	
		<h1>Mi Web PintaJSON </h1>
					<!-- 
					
					<s:textfield name="IdRequisitoRecuperado" size="2" label="Requisito recuperado"/>
				    <s:textfield name="IdCapituloRecuperado" size="50" label="Capitulo recuperado" />
				    
				    
				    <p><s:property value="JSON" /></p>
				     <p><a href="<s:url action='indexMiweb'/>">Home Page</a></p>
			 		-->
		<table>
			<s:set var="json " value="JSON" />
		    <jsp:useBean id="json " type="java.lang.String" />
		    <%
    			//String jsonString = json.toString();
		        //System.out.println("Aqui");
		        //System.out.println(jsonString);
		        //System.out.println("FIN Aqui");
		                		
		        Gson gson = new Gson();
		        capitulo cap1 = gson.fromJson(json, capitulo.class);
		        //formularioBean forBean = gson.fromJson(json, formularioBean.class);
		        //System.out.println("Aqui");
			%>
							            	
		        <thead>
		            <tr>
		                <th>ID Requisito</th>
		                <th>Titulo del requisito</th>
		            </tr>  
		        </thead>
		        <tbody>
		        	<tr>
		            	<th>
		                	<div class="idRequisito"></div>
		                	 <% out.println(cap1.getNumCapitulo()); %>
		            	</th>
		            	<th>
		                	<div class="idTexto"></div>
		                	<% out.println(cap1.getTituloCapitulo()); %>
		            	</th>
		            </tr>
		        </tbody>
		</table>
		
		
		<p><a href="<s:url action='indexMiweb' />" >Return to home page</a>.</p>
	</body>
	

</html>