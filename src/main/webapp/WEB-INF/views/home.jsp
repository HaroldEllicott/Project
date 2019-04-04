<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
</style>
</head>
<body>
</head>

<body>
	
	<div class="container text-center">
		<h1>Biome of Delights</h1>
		<p>The Delicious Way to Health</p>
	</div>
	<div>
		<p>Welcome ${username}</p>
	</div>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid"></div>
	</nav>
	
	<c:forEach items="${allRecipes}" var="recipe">
	<div class="container panel panel-warning" style="width: 20%; height: 500px; float: left; margin: 1.3%; border-style: solid; border-colour: green; border-radius: 5px; border-width: 1px; background-colour">
			<div class="row">
<!-- 			<div class="col-sm-4"> -->
				    <div class="panel-heading text-center p-3 mb-2 bg-warning text-dark"><h4>${recipe.recipe_name}</h4></div>
        			<div class="panel-body text-center"><a href=""></a><img alt="Oh dear. Could not load image." src="${recipe.image}" style="width: 300px; height: 300px" class="cropping rounded"></div>
       				<div class="panel-footer">${recipe.description}</div>
<!-- 				</div> -->
 			</div>
		</div>
	</c:forEach>

	
	
	
	
	

</body>
</html>