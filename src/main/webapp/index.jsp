<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Validar</title>
	</head>
<body>
	<header>
		<h1>Inicio de sesión</h1>
	</header>
	<form action="ServletValidador" method="post">
		<label for="username">Usuario: </label>
		<input type="text" name="usuario" id="username"/><br/>
		<label for="password">Contraseña: </label>
		<input type="password" name="password" id="password"/><br/>
		<input type="submit" value="Enviar" id="loginbtn"/>
	</form>
</body>
</html>
