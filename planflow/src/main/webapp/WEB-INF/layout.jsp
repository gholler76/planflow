<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Droppable - Default functionality</title>
      <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <style>
  #draggable { width: 200px; height: 40px; padding: 0.25em; float: left; margin: 10px 10px 10px 0; }
  #droppable { width: 220px; height: 80px; padding: 0.25em; float: left; margin: 10px; }
  </style>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#draggable" ).draggable();
    $( "#droppable" ).droppable({
      drop: function( event, ui ) {
        $( this )
          .addClass( "ui-state-highlight" )
          .find( "p" )
            .html( "Planned to dock xxx" );
      }
    });
  } );
  </script>
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
	      <a class="nav-link active" href="/layout">Layout<span class="sr-only">(current)</span></a>
	      <a class="nav-link" href="reportdata">Report Data</a>
	      <a class="nav-link" href="/erd">ERD</a>
	    </div>
	  </div>
	</nav>
<div class="row">
	<div id="draggable" class="ui-widget-content small">
	  <p>IB 123</p>
	</div>
	<div id="draggable" class="ui-widget-content small">
	  <p>IB 456</p>
	</div>
	<div id="draggable" class="ui-widget-content small">
	  <p>IB 789</p>
	</div>
	 
	<div id="droppable" class="ui-widget-header small">
	  <p>Dock 101</p>
	</div>
	<div id="droppable" class="ui-widget-header small">
	  <p>Dock 103</p>
	</div>
	<div id="droppable" class="ui-widget-header small">
	  <p>Dock 105</p>
	</div>
</div>

<div class="row">
	<img src="<%= request.getContextPath() %>/images/whse.png" class="img-fluid">
</div>
 
</body>
</html>
