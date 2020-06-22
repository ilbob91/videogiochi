<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<a href="new">Aggiungi Videogioco</a> &nbsp;
<br><br><br>
<div align="left">
<h3>Ordina per Categoria</h3>
<form action="listeCategoria">

	    Seleziona la categoria: <br> <br>
            <input type="radio" name="categoria" value="0"> 
            <label    for="horror">HORROR</label><br> 
            <input type="radio" name="categoria" value="1"> 
            <label for="sport">SPORT</label><br>
            <input type="radio" name="categoria" value="2"> 
            <label for="fps">FPS</label><br>
            <input type="radio" name="categoria" value="3" checked="checked"> 
            <label for="tutte">Tutte le categorie</label><br>
            

        Seleziona il filtro: <br> <br>

            <input type="radio" name="field" value="0" checked="checked"> 
            <label    for="titolo">Titolo</label><br> 
            <input type="radio" name="field" value="1"> 
            <label for="pegi">Pegi</label><br>
            <input type="radio" name="field" value="2"> 
            <label for="prezzo">Prezzo</label><br><br>
             <input type="submit"value="ordina"><br> <br>
	</form>
	<h3>Ordina per Classificazione</h3>
  <form action="listePegi">

	    Seleziona la classificazione: <br> <br>
            <input type="radio" name="pegi" value="0"> 
            <label    for="diciotto">18</label><br> 
            <input type="radio" name="pegi" value="1"> 
            <label for="sedici">16</label><br>
            <input type="radio" name="pegi" value="2"> 
            <label for="tre">3</label><br>
            <input type="radio" name="pegi" value="3" checked="checked"> 
            <label for="tutte">Tutte le categorie</label><br>
            

        Seleziona il filtro: <br> <br>

            <input type="radio" name="field" value="0" checked="checked"> 
            <label    for="titolo">Titolo</label><br> 
            <input type="radio" name="field" value="1"> 
            <label for="categoria">Categoria</label><br>
            <input type="radio" name="field" value="2"> 
            <label for="prezzo">Prezzo</label><br><br>
             <input type="submit"value="ordina"><br> <br>
	</form>
   	</div>
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