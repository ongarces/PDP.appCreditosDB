<%-- 
    Document   : creditos
    Created on : 29/05/2018, 08:17:30 AM
    Author     : cgaop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Template for CREDITOS</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">

            <a class="navbar-brand" href="#">Aplicacion - CREDITOS -</a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/index.jsp">Inicio</a>
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
                <div class="container">

                    <!-- FORM INVOCA AL SERVLET -->
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/CreditosServlet">

                        <div class="form-row">
                            <div class="col">
                                <input type="text" name="txtidcredito" class="form-control" placeholder="IDcredito">
                            </div>  
                            <div class="col">
                                <input type="text" name="txtmonto" class="form-control" placeholder="Monto a prestar">
                            </div>
                        </div>

                        <div class="form-row">                            
                            <div class="col">
                                <input type="text" name="txtnombres" class="form-control" placeholder="Nombres del titular">
                            </div>                            
                            <div class="col">
                                <input type="text" name="txtdocumento" class="form-control" placeholder="Documento del titular">
                            </div>                            
                        </div>

                        <div class="form-row">                            
                            <div class="col-sm-3">
                                <label for="inputState">Tipo trabajador:</label>                                 
                            </div>
                            <div class="col-sm-3"> 
                                <select id="inputState" class="form-control" name="txttrabajador">
                                    <option value="independiente">Independiente</option>
                                    <option value="dependiente">Dependiente</option>
                                </select>
                            </div>
                        </div>
                        
                        <div class="form-row">                            
                            <div class="col-sm-3">
                                <label for="inputState">Tipo credito:</label>                                 
                            </div>
                            <div class="col-sm-3"> 
                                <select id="inputState" class="form-control" name="txttipocredito">
                                    <option selected value="vivienda">Vivienda</option>
                                    <option value="estudio">Estudio</option>
                                    <option value="inversion">Inversion</option>
                                </select>
                            </div>
                        </div>
                        
                         <div class="form-row">                            
                            <div class="col-sm-3">
                                <label for="inputState">Es vinculado:</label>                                 
                            </div>
                            <div class="col-sm-3"> 
                                <select id="inputState" class="form-control" name="txtvinculado">
                                    <option selected value="SI">SI</option>
                                    <option value="NO">NO</option>
                                </select>
                            </div>
                        </div>

                        <br><br><br>

                        <!-- DIV BOTONES -->
                        <!-- DIV BOTONES -->
                        <center>
                            <div class="">
                                <button name="accion" value="crear" type="submit" class="btn btn-primary">Registrar Credito</button>
                            </div>                            
                            <!--div class="">
                                <button name="accion" value="listar" type="submit" class="btn btn-primary">Listar cursos</button>
                            </div-->
                        </center>

                    </form>

                </div>
            </div>

        </main>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

    </body>
</html>