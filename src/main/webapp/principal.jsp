<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <%
    	String json = request.getParameter("JSON");
    	System.out.println(json);
    %>
    
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>requisito</th>
                <th>texto</th>
            </tr>  
        </thead>
        <tbody>
        	<tr>
            	<th>
                	<div class="idRequisito"></div>
            	</th>
            	<th>
                	<div class="idTexto"></div>
            	</th>
            </tr>
        </tbody>
    </table>
</body>
</html>