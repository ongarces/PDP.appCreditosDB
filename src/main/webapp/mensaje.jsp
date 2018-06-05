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

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <p>ESTE ES EL MENSAJE DE LA APLICACION - CRISTIAN GARCES y CATALINA MONTOYA-</p>
                <h1>
                    <c:out value="${sessionScope.MENSAJE}"></c:out>
                    
                    <a href="${pageContext.servletContext.contextPath}/index.jsp">Regresar</a>
                </h1>
            </div>

        </main>

    </body>
</html>
