<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifica Videogioco</title>
</head>
<body>
	<form:form action="save" method="post" modelAttribute="videogioco">
		<table border="0" cellpadding="5">
		<tr>
					<td>ID:</td>
					<td>${videogioco.id}<form:hidden path="id" />
					</td>
					
				</tr>
			<tr>
				<td>Titolo:</td>
				<td><form:input path="titolo" /></td>
			</tr>
			<tr>
				<td>Classificazione:</td>
				<td><form:radiobuttons path="pegi" /></td>
			</tr>
			<tr>
				<td>Prezzo:</td>
				<td><form:radiobuttons path="prezzo" /></td>
			</tr>
			<tr>
				<td>Categoria:</td>
				<td><form:radiobuttons path="categoria" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Salva"></td>
			</tr>
		</table>
	</form:form>
	<br>
	<br>

	<form action="indietro" method="post">
		<input type="submit" value="Torna Indietro">
	</form>
</body>
</html>