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
<div align="center">
<a href="new">Aggiungi Videogioco</a> &nbsp;
<br><br><br>
Scegli cosa visualizzare:
<form action="liste">
<input type="text" id="string" name="string"> <br><br>
		<input type="radio" name="scelta" value="0"> <label
			for="titolo">Titolo</label><br> <input type="radio"
			name="scelta" value="1"> <label for="prezzo">Prezzo</label><br>
		<input type="radio" name="scelta" value="2"> <label
			for="categoria">Categoria</label><br><input type="radio" name="scelta" value="3"> <label
			for="classificazione">Classificazione</label><br> <input type="submit"
			value="Scegli"><br>
		<br>
	</form>
	<br><br><br>
<table border="1">
		<tr>
		
			<th>ID Videogioco</th>
			<th>Titolo</th>
			<th>Classificazione</th>
			<th>Prezzo</th>
			<th>Categoria</th>
			<th>Modifica</th>
			<th>Elimina</th>
		</tr>
		<c:forEach items="${listaGiochi}" var="ale">
		<tr>
			<td>${ale.id}</td>
			<td>${ale.titolo}</td>
			<td>${ale.pegi}</td>
			<td>${ale.prezzo}</td>
			<td>${ale.categoria}</td>
			<td><a href="edit?id=${ale.id}">Modifica</a></td> 
			<td><a href="delete?id=${ale.id}">Elimina </a></td>
		</tr>
		</c:forEach>
	</table>
	
	</div>
</body>
</html>