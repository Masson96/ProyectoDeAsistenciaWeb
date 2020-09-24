<%-- 
    Document   : index
    Created on : 12/12/2019, 05:05:57 PM
    Author     : Masson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Iniciar sesión</title>
    </head>
    <body>
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand">DivCuchito</a>
            <form class="form-inline">
                <a class="btn btn-outline-success my-2 my-sm-0" type="submit" href="InicioPag.jsp">Pagina Principal</a>
            </form>
        </nav>
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body ">
                    <form class="form-sing" action="Validar" method="POST">
                        <div class="form-group text-center">
                            <h3>Login</h3>
                            <img src="images/logotipo1 (1).png" alt="70" width="170"/>
                            <br>
                            <label>Bienvenidos al Sistema</label>
                        </div>
                        <div class="form-group">
                            <label>Usuario :</label>
                            <input type="text" name="txtuser" class="form-control" placeholder="Ingrese su usuario...">
                        </div>
                        <div class="form-group">
                            <label>Contraseña :</label>
                            <input type="password" name="txtpass" class="form-control" placeholder="Ingrese su clave">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block"> 
                    </form>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
