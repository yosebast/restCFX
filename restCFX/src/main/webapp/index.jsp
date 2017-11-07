<html>
<head>


<%@include file="/Commons/Header.jsp" %>

</head>
<body>
<div>
	<h2>Search book</h2>
	<label>ISBN:</label>
	<input type="button" value="llamaServicio" id="searchButton">
	<input type="button" value="llamaController" id="llamaController">
</div>
<div>
	<h2>Book Details</h2>
	<div><label>ISBN:&nbsp;</label><span id="bookISBN"></span></div>
	<div><label>Title:&nbsp;</label><span id="bookTitle"></span></div>
	<div><label>Price:&nbsp;</label><span id="bookPrice"></span></div>
</div>

<h1>buscador de cuentas</h1>

<div>

numCuenta   <input type="text" id="numCuenta"  name ="numCuenta" />

titular     <input type="text" id="titular" name="titular" />

<input type="button" value="SearchCuentas" id="searchCuentas">
</div>
<div id="totalCuentas">
</div>

<hr/>

<h1>Buscador de oficinas</h1>
<div>
introduzca su codigo postal : <input type="text" id="codpostal" name = "codpostal" />

<input type="hidden" id="direccion" name = "direccion" />
<input type="hidden" id="numero" name = "numero" />

<input type="button" value="SearchOficinas" id="searchOficinas">
</div>

<h1>listado de oficinas</h1>

<div id="oficinas"></div>

<h1>subir ficheros</h1>
<a href="remoting/greet"> subir fichero</a>




<h1>Buscador de cuentas en otro proyecto</h1>
<div>
introduzca el numero Account : <input type="text" id="idAccount" name = "Account" />

<input type="button" value="SearchAccount" id="searchAccount">
</div>

</body>
</html>