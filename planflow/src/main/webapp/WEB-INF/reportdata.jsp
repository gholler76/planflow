<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>PlanFlow</title>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
	    <span class="navbar-brand text-light mb-0 h1">PlanFlow (sandbox)</span>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
	    <div class="navbar-nav">
	      <a class="nav-link" href="/">Home </a>
	      <a class="nav-link" href="/assumptions">Assumptions</a>
	      <a class="nav-link" href="/opsvariables">Ops Variables</a>
	      <a class="nav-link" href="/planningtools">Planning Tools</a>
	      <a class="nav-link" href="/layout">Layout</a>
	      <a class="nav-link active" href="reportdata">Report Data<span class="sr-only">(current)</span></a>
	      <a class="nav-link" href="/erd">ERD</a>
	    </div>
	  </div>
	</nav>
	<div class="container">
		<div class="row justify-content-center">
    		<div class="col-6">
    			<div class="card" style="width: 18rem;">
  					<div class="card-body">
					    <h5 class="card-title">Reports</h5>
					    <p class="card-text">% Perfect</p>
					    <p class="card-text">% Near</p>
					    <p class="card-text">% Far</p>
					    <p class="card-text">Displaced pallets</p>
					    <p class="card-text">Capacity analysis</p>
				  	</div>
				</div>
   	 		</div>
    	</div>
	</div>
    
</body>
</html>