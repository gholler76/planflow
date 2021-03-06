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
	      <a class="nav-link active" href="/">Home <span class="sr-only">(current)</span></a>
	      <a class="nav-link" href="/assumptions">Assumptions</a>
	      <a class="nav-link" href="/opsvariables">Ops Variables</a>
	      <a class="nav-link" href="/planningtools">Planning Tools</a>
	      <a class="nav-link" href="/layout">Layout</a>
	      <a class="nav-link" href="reportdata">Report Data</a>
	      <a class="nav-link" href="/erd">ERD</a>
	    </div>
	  </div>
	</nav>
	<div class="container-fluid">
		<div class="row justify-content-between">
			<div class="col-2">
				<form action="/pallets" method="post" class="mt-2">
			      	<div class="form-group">
			      		<Label for="qty" class="form-label">Enter Pallet Quantity</Label>
			      		<input type="number" class="form-control" name="qty" value=10 />
			      		<input type="submit" value="CREATE PALLETS" class="btn btn-sm btn-primary mt-2"/>
			    	</div>
			    </form>
				<table class="table table-bordered table-sm">
					<thead>
						<tr>
							<th>#</th>
							<th>Pallet</th>
							<th>Pallet Type</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="count" value="0" scope="page" />
						<c:forEach var="pallet" items="${pallets}">
						<c:if test="${pallet.location eq null }">
						<tr class="small">
							<th scope="row"><c:set var="count" value="${count + 1}" scope="page"/>${count}</th>
							<td>${pallet.palletid}</td>
							<td>${pallet.ptype}</td>
						</tr>
	 					</c:if>
						</c:forEach>
					</tbody>
				</table>
	 	 	</div>
	 	 	<div class="col-2">
				<form action="/move" method="post">
			  		<input class="btn btn-secondary mt-2 mb-2 btn-block" type="submit" value="Store Pallets">
			  		<input class="btn btn-info mb-2 btn-block" type="submit" value="Ship Pallets" formaction="/ship">
			  		<input class="btn btn-warning mb-2 btn-block" type="submit" value="Delete Pallets" formaction="/deleteP">
			  		<input class="btn btn-danger mb-2 btn-block" type="submit" value="Delete Locations" formaction="/deleteL">
			  	</form>
	 	 	</div>
	   	 		<div class="col-8">
	   	 			<div class="row justify-content-center">
	   	 				<form action="/locations" method="post">
	   	 				<input type="hidden" name="startRack" value=100>  
							<div class="form-row align-items-center mt-2">
							    <div class="col-auto">
							      <label for="rackCount">Number of Racks</label>
							      <select class="form-control mb-2" name="rackCount">
							      	<option value=+1>1</option>
							      	<option value=+2>2</option>
							      	<option value=+3>3</option>
							      	<option value=+4>4</option>
							      </select>
							    </div>
							    <div class="col-auto">
							      <label for="xcoors">X-coords)</label>
							      <select class="form-control mb-2" name="xcoors">
							      	<option value=+1>1</option>
							      	<option value=+2>2</option>
							      	<option value=+3>3</option>
							      	<option value=+4>4</option>
							      	<option value=+5>5</option>
							      	<option value=+6>6</option>
							      	<option value=+7>7</option>
							      	<option value=+8>8</option>
							      	<option value=+9>9</option>
							      	<option value=+10>10</option>
							      	<option value=+11>11</option>
							      	<option value=+12>12</option>
							      	<option value=+13>13</option>
							      	<option value=+14>14</option>
							      	<option value=+15>15</option>
							      	<option value=+16>16</option>
							      	<option value=+17>17</option>
							      	<option value=+18>18</option>
							      	<option value=+19>19</option>
							      	<option value=+20>20</option>
							      </select>
							    </div>
							    <div class="col-auto">
							      <label for="ycoors">Y-coords)</label>
							      <select class="form-control mb-2" name="ycoors">
							      	<option value=+1>1</option>
							      	<option value=+2>2</option>
							      	<option value=+3>3</option>
							      	<option value=+4>4</option>
							      	<option value=+5>5</option>
							      </select>
							    </div>
							    <div class="col-auto">
							      <button type="submit" class="btn btn-success btn-sm">CREATE RACKS</button>
							    </div>
							  </div>
							</form>
		   	 			</div>
		   	 			<div class="row justify-content-center">
		   	 				<div class="col-auto">
		   	 					<table class="table-sm table-bordered">
		   	 						<thead>
		   	 							<tr>
		   	 								<th>Rack</th>
		   	 								<th>X</th>
		   	 								<th>Y</th>
		   	 								<th>PltID</th>
		   	 							</tr>
		   	 						</thead>
		   	 						<tbody>
		   	 						<c:forEach var="location" items="${locations}">
	   	 								<c:if test="${location.rack eq '101'}">
			   	 							<tr class="small">
			   	 								<td>${location.rack}</td>
			   	 								<td>${location.xcoor}</td>
			   	 								<td>${location.ycoor}</td>
			   	 								<td>${location.pallet.palletid}</td>
			   	 							</tr>
		   	 							</c:if>
	   	 							</c:forEach>
				   	 				</tbody>
				   	 			</table>
				   	 		</div>
		   	 				<div class="col-auto">
		   	 					<table class="table-sm table-bordered">
		   	 						<thead>
		   	 							<tr>
		   	 								<th>Rack</th>
		   	 								<th>X</th>
		   	 								<th>Y</th>
		   	 								<th>PltID</th>
		   	 							</tr>
		   	 						</thead>
		   	 						<tbody>
		   	 						<c:forEach var="location" items="${locations}">
	   	 								<c:if test="${location.rack eq '102'}">
			   	 							<tr class="small">
			   	 								<td>${location.rack}</td>
			   	 								<td>${location.xcoor}</td>
			   	 								<td>${location.ycoor}</td>
			   	 								<td>${location.pallet.palletid}</td>
			   	 							</tr>
		   	 							</c:if>
	   	 							</c:forEach>
				   	 				</tbody>
				   	 			</table>
				   	 		</div>
		   	 				<div class="col-auto">
		   	 					<table class="table-sm table-bordered">
		   	 						<thead>
		   	 							<tr>
		   	 								<th>Rack</th>
		   	 								<th>X</th>
		   	 								<th>Y</th>
		   	 								<th>PltID</th>
		   	 							</tr>
		   	 						</thead>
		   	 						<tbody>
		   	 						<c:forEach var="location" items="${locations}">
	   	 								<c:if test="${location.rack eq '103'}">
			   	 							<tr class="small">
			   	 								<td>${location.rack}</td>
			   	 								<td>${location.xcoor}</td>
			   	 								<td>${location.ycoor}</td>
			   	 								<td>${location.pallet.palletid}</td>
			   	 							</tr>
		   	 							</c:if>
	   	 							</c:forEach>
				   	 				</tbody>
				   	 			</table>
				   	 		</div>
		   	 				<div class="col-auto">
		   	 					<table class="table-sm table-bordered">
		   	 						<thead>
		   	 							<tr>
		   	 								<th>Rack</th>
		   	 								<th>X</th>
		   	 								<th>Y</th>
		   	 								<th>PltID</th>
		   	 							</tr>
		   	 						</thead>
		   	 						<tbody>
		   	 						<c:forEach var="location" items="${locations}">
	   	 								<c:if test="${location.rack eq '104'}">
			   	 							<tr class="small">
			   	 								<td>${location.rack}</td>
			   	 								<td>${location.xcoor}</td>
			   	 								<td>${location.ycoor}</td>
			   	 								<td>${location.pallet.palletid}</td>
			   	 							</tr>
		   	 							</c:if>
	   	 							</c:forEach>
				   	 				</tbody>
				   	 			</table>
				   	 		</div>
			 			</div>
			 		</div>
	    	</div>
		</div>
</body>
</html>