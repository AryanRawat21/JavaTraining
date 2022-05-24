<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
<style>
	#main-header{
	text-align: center;
	background-color: black;
	color: white;
	border: 5px red solid;
	}
</style>
</head>
<body>
<div align = "left" style = "font-size : 15px;">
<br/>
<hr/>
		<header id = "main-header">
		<h1>Employee details </h1>
		</header>
		<form action = "empl" method = "post">
			<label><b>FIRST NAME:</b></label>
			</br>
			<input type = "text" name = "fname" required />
			</br>
			</br>
			<label><b>SURNAME:</b></label>
			</br>
			<input type = "text" name = "sname" required />
			</br>
			</br>
			<label><b>EMAIL ID:</b></label>
			</br>
			<input type = "text" name = "id" required />
			</br>
			</br>
			</br>
			</br>
			<input type = "submit" value = "Submit All" style = "font-size: 20px; font-weight: bold;"/> 
		</form>
		<br/>
		<hr/>
		<br/>
		
		<br/>
		<br/>
</body>
</html>