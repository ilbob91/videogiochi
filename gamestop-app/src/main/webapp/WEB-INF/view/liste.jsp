<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
		
			<th>ID Videogioco</th>
			<th>Titolo</th>
			<th>Classificazione</th>
			<th>Prezzo</th>
			<th>Categoria</th>
			
		</tr>
		<c:forEach items="${lista}" var="ale">
		<tr>
			<td>${ale.id}</td>
			<td>${ale.titolo}</td>
			<td>${ale.pegi}</td>
			<td>${ale.prezzo}</td>
			<td>${ale.categoria}</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	<a href="indietro">Torna Indietro</a>
</body>
</html>