<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Now UI Dashboard by Creative Tim
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
  <!-- CSS Files -->
  <!--  --><spring:url value="../../static/css/bootstrap.min.css" var="bootstrapCss" />-->
  <link href="css/bootstrap.min.css" rel="stylesheet" />
  <link href="css/now-ui-dashboard.css?v=1.3.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="css/demo.css" rel="stylesheet" />
</head>

<body class="">
  
    <%@include file="nav-lateral.jsp"%>
    <%@include file="nav-superior.jsp"%>
	<h1>Hoola</h1>
  <button id="btn" class="btn" type="button">akjsdhkaj</button>
	<div id="prueba"></div>
  <form id="registro" action="#">
    Login: <input type="text" name="login" id="login"> <span id="mensaje"></span><br>
    Login: <input type="text" name="login" id="campo_login"> 
           <span id="mensaje"></span><br>
    <input type="submit" value="registrar">
    <br><br><br>
    <input type="button" class="btn btn-danger" value="Deletes"/>
  </form>
  <h1>Prueba con request</h1>
  <h2>${datosTbl.get(1).getOs() }</h2>
  
  	<table class="table table-hover">
	    <tr class="">
	        <th>OS</th>
	        <th>Proyecto</th>
	        <th>Fecha desde</th>
	        <th>Fecha hasta</th>
	        <th>Folio</th>
	        <th></th>
	        <th></th>
	    </tr>                            
	    <c:forEach var="dato" items="${datosFiltros.getOs()}">
	    	<% int cont =0; %>
	        <tr class="">
	            <td>${dato.getOs()}</td>
	            <td>${dato.proyecto }</td>
	            <td>${dato.desde }</td>
	            <td>${datosFiltros.getOs().get(cont)}</td>
	            <td>${dato.get(1).toString()}</td>
	            <td></td>
	            <td></td>                                    
	        </tr>
	        <% cont++; %>
	        ${datosFiltros.getOs().get(cont)}
	    </c:forEach>
	</table>
  
  <!--   Core JS Files   -->
  <script src="../assets/js/core/jquery.min.js"></script>
  <script src="../assets/js/core/popper.min.js"></script>
  <script src="../assets/js/core/bootstrap.min.js"></script>
  <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chart JS -->
  <script src="../assets/js/plugins/chartjs.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="../assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="../assets/js/now-ui-dashboard.min.js?v=1.3.0" type="text/javascript"></script>
  <!-- Now Ui Dashboard DEMO methods, don't include it in your project! -->
  <script src="../assets/demo/demo.js"></script>
  
</body>

</html>