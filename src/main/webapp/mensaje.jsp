<%-- 
    Document   : mensaje
    Created on : 2/05/2018, 06:37:48 PM
    Author     : Cristian Garces - Catalina Montoya
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>-MENSAJE-</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>
    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">

            <a class="navbar-brand" href="#">Aplicacion - MENU -</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">

                    <li class="nav-item active">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/index.jsp">INICIO</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/view/creditos.jsp">Creditos</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/CreditosServlet?accion=listar">Listar Creditos</a>
                    </li> 

                </ul>        
            </div>
        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <p>ESTE ES EL MENSAJE DE LA APLICACION - CRISTIAN GARCES y CATALINA MONTOYA-</p>
                <h1> <c:out value="${sessionScope.MENSAJE}"></c:out> </h1>
                <br>
                <a href="${pageContext.servletContext.contextPath}/index.jsp">Ir index</a>
                <br>
                <a href="${pageContext.servletContext.contextPath}/view/creditoLista.jsp">Ir a lista creditos</a>

            </div>

        </main>

    </body>
</html>
