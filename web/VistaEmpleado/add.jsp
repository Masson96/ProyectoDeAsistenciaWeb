<%-- 
    Document   : Empleado
    Created on : 27/11/2019, 10:12:30 AM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title> Div/Cuchito  </title>
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="js/FechaHora.js" type="text/javascript"></script>
        <script>
            function sololetra(e) {
                key = e.keysCode || e.which;
                teclado = String.fromCharCode(key).toLowerCase();
                letras = " abcdefgjhijklmnñopqrstuvwxyzáéíóú";
                especiales = "8-37-38-46-164";
                teclado_especial = false;
                for (var i in especiales) {
                    if (key == especiales[i]) {
                        teclado_especial = true;
                        break;
                    }
                }
                if (letras.indexOf(teclado) == -1 && !teclado_especial) {
                    return false;
                }
            }
        </script>
        <script>
            function solonumero(e) {
                key = e.keyCode || e.which;
                teclado = String.fromCharCode(key);
                numeros = "0123456789";
                especiales = "8-37-38-46";//array
                teclado_especial = false;
                for (var i in especiales)
                {
                    if (key == especiales[i]) {
                        teclado_especial = true;
                    }
                }
                if (numeros.indexOf(teclado) == -1 && !teclado_especial) {
                    return false;
                }
            }
        </script>

    </head>
    <%----%>
    <body id="page-top" onload="startTime()">
        <!-- Page Wrapper -->
        <div id="wrapper">
            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">DivCuchito<sup>2</sup></div>
                </a>
                <!-- Divider -->
                <hr class="sidebar-divider my-0">
                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="Principal.jsp">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Tablero</span></a>
                </li>
                <!-- Divider -->
                <hr class="sidebar-divider">
                <!-- Heading -->
                <div class="sidebar-heading">
                    Interface
                </div>
                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                        <i class="fas fa-fw fa-cog"></i>
                        <span>Empresa</span>
                    </a>
                    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <a class="collapse-item" href="AcercaEmpresa.jsp">Acerca de la empresa</a>
                        </div>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseEmp" aria-expanded="true" aria-controls="collapseEmp">
                        <i class="fas fa-fw fa-user"></i>
                        <span>Empleados</span>
                    </a>
                    <div id="collapseEmp" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Mantenimientos:</h6>
                            <a class="collapse-item" href="Controlador?menu=ListarEmp&accion=Listar">Listar</a>
                            <a class="collapse-item" href="Controlador?menu=AgregarEmp&accion=Nuevo">Registrar</a>
                        </div>
                    </div>
                </li>
                <!-- Divider -->
                <hr class="sidebar-divider">
                <!-- Heading -->
                <div class="sidebar-heading">
                    Herramientas
                </div>
                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages" aria-expanded="true" aria-controls="collapsePages">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Salidas</span>
                    </a>
                    <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Consultas:</h6>
                            <a class="collapse-item" href="ListarSalidas.jsp">Listar salidas</a>
                        </div>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseSoli" aria-expanded="true" aria-controls="collapseSoli">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Solicitudes</span>
                    </a>
                    <div id="collapseSoli" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Login Screens:</h6>
                            <a class="collapse-item" href="#">Generar soliciutd</a>
                        </div>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseRep" aria-expanded="true" aria-controls="collapseRep">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Reportes</span>
                    </a>
                    <div id="collapseRep" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <a class="collapse-item" href="Reportes.jsp">Cálculo y Generación</a>
                            <a class="collapse-item" href="#">Gestion de horas extras</a>
                            <a class="collapse-item" href="#">Gestion de registros</a>
                        </div>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="Controlador?menu=ListarHorario&accion=Listar">
                        <i class="fas fa-fw fa-user"></i>
                        <span>Horarios</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseHor" aria-expanded="true" aria-controls="collapseHor">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Turnos</span>
                    </a>
                    <div id="collapseHor" class="collapse" aria-labelledby="headingHor" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <a class="collapse-item" href="Controlador?menu=ListarTurno&accion=Listar">Listar Trunos</a>
                            <a class="collapse-item" href="VistaEmpleado/EmpleadoAdd.jsp">Registrar</a>
                        </div>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseJust" aria-expanded="true" aria-controls="collapseJust">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Justificaciones</span>
                    </a>
                    <div id="collapseJust" class="collapse" aria-labelledby="headingJust" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Manimientos:</h6>
                            <a class="collapse-item" href="#">Listar</a>
                            <a class="collapse-item" href="#">Registrar</a>
                        </div>
                    </div>
                </li>

                <!-- Nav Item - Tables -->
                <li class="nav-item">
                    <a class="nav-link" href="tables.html">
                        <i class="fas fa-fw fa-table"></i>
                        <span>Tables</span></a>
                </li>
                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">
            </ul>
            <!-- End of Sidebar -->
            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">
                <!-- Main Content -->
                <div id="content">
                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
                        <!-- Sidebar Toggle (Topbar) -->
                        <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                            <i class="fa fa-bars"></i>
                        </button>
                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">
                            <%-- contenido de la parte superior --%>
                            <div class="topbar-divider d-none d-sm-block"></div>
                            <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small">
                                        ${usuario.getNom()}
                                        ${usuario.getApe()}
                                    </span>
                                    <img class="img-profile rounded-circle" src="images/images.png" alt="60" width="60">
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                                    <a class="dropdown-item" href="#">
                                        <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Perfil
                                    </a>
                                    <a class="dropdown-item" href="#">
                                        <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                        configuraciones
                                    </a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Cerrar sesion
                                    </a>
                                </div>
                            </li>
                        </ul>
                    </nav>
                    <!-- Inicio de contenido-->
                    <form action="Controlador?menu=AgregarEmp" method="POST">
                        <div class="col-md-10 offset-md-1">
                            <div class="card-header">
                                <h2>Agregar Empleado</h2>
                            </div>
                            <!-- form complex example -->
                            <div class="form-row mt-4">
                                <div class="col-sm-4 pb-3">
                                    <label>Nombres :</label>
                                    <input type="hidden" value="${empleado.getIdEmpleado()}" name="idEmpleado" />
                                    <input type="text" value="${empleado.getNombres()}" class="form-control" name="txtNombres" onkeypress="return sololetra(event)" placeholder="Ingrese el nombre">
                                </div>
                                <div class="col-sm-4 pb-3">
                                    <label>Apellido paterno :</label>
                                    <input type="text" value="${empleado.getApellidoPaterno()}" class="form-control" name="txtApellidoPaterno" onkeypress="return sololetra(event)" placeholder="Ingrese los apellidos">
                                </div>
                                <div class="col-sm-4 pb-3">
                                    <label>Apellido materno :</label>
                                    <input type="text" value="${empleado.getApellidoMaterno()}" class="form-control" name="txtApellidoMaterno" onkeypress="return sololetra(event)" placeholder="Ingrese los apellidos">
                                </div>
                                <div class="col-sm-3 pb-3">  
                                    <label>DNI :</label>
                                    <input type="text" value="${empleado.getDni()}" class="form-control" name="txtDni" onkeypress="return solonumero(event)" onpaste="return false" maxlength="8" placeholder="Ingrese solo 8 caracteres">  
                                </div>
                                <div class="col-sm-2 pb-3">
                                    <label>Genero :</label>
                                    <select class="form-control" name="idgenero">
                                        <option>Seleccione</option>
                                        <option value="Masculino">Masculino</option>
                                        <option value="Femenino">Femenino</option>

                                    </select>
                                </div>
                                <div class="col-sm-4 pb-3">  
                                    <label>Dirección :</label>
                                    <input type="text" value="${empleado.getDireccion()}" class="form-control" name="txtDireccion" placeholder="Ingrese la dirección">  
                                </div>

                                <div class="col-sm-3 pb-3">
                                    <label>Telefono :</label>
                                    <input type="text" value="${empleado.getTelefono()}" class="form-control" name="txtTelefono" onkeypress="return solonumero(event)" onpaste="return false" maxlength="9" placeholder="Ingrese solo 9 catacteres">
                                </div>
                                <div class="col-sm-4 pb-3">
                                    <label>E-mail :</label>
                                    <input type="text" value="${empleado.getCorreo()}" class="form-control" name="txtCorreo" placeholder="Ingrese el correo">
                                </div>
                                <div class="col-sm-2 pb-3">
                                    <label>Turno :</label>
                                    <select class="form-control" name="idturno">
                                        <option>Seleccione</option>
                                        <option value="Manana">Mañana</option>
                                        <option value="Tarde">Tarde</option>
                                    </select>
                                </div>
                                <div class="col-sm-2 pb-3">
                                    <label>Descanso :</label>
                                    <select class="form-control" name="iddescanso">
                                        <option>Seleccione :</option>
                                        <option value="Domingo">Domingo</option>
                                        <option value="Lunes">Lunes</option>
                                        <option value="Martes">Martes</option>
                                        <option value="Miercoles">Miercoles</option>
                                        <option value="Jueves">Jueves</option>
                                        <option value="Viernes">Viernes</option>
                                        <option value="Sabado">Sabado</option>
                                    </select>
                                </div>
                                <div class="col-sm-2 pb-3">
                                    <label>Cargo :</label>
                                    <select class="form-control" name="idcargo">
                                        <option>Seleccione</option>
                                        <option value="Mozo">Mozo</option>
                                        <option value="Cajero">Cajero</option>
                                        <option value="Hornero">Hornero</option>
                                        <option value="Cocinero">Cocinero</option>
                                        <option value="Barman">Barman</option>
                                        <option value="Anfitriona">Anfitriona</option>
                                        <option value="Conserje">Conserje</option>
                                        <option value="Asistente">Asistente</option>
                                        <option value="Administrador">Administrador</option>
                                    </select>
                                </div>
                                <div class="col-sm-2 pb-3">
                                    <label>Banco</label>
                                    <select class="form-control" name="idBanco">
                                        <option>Seleccione</option>
                                        <option value="Interbank">Interbank</option>
                                    </select>
                                </div>
                                <div class="col-sm-3 pb-3">
                                    <label>Seguro :</label>
                                    <select class="form-control" name="idseguro">
                                        <option>Seleccione</option>
                                        <option value="AFP PRIMA">AFP Prima</option>
                                    </select>
                                </div>
                                <br>
                                <div class="col-auto">
                                    <label>Cuenta contable </label>
                                    <label class="sr-only" for="inlineFormInputGroup">Username</label>
                                    <div class="input-group mb-2">
                                        <div class="input-group-prepend">
                                            <div class="input-group-text">CT</div>
                                        </div>
                                        <input type="text" class="form-control" name="txtCTC" id="inlineFormInputGroup" placeholder=" Ejem: 0000">
                                    </div>
                                </div>
                                <br>
                                <div class="col-sm-4 pb-3">
                                    <label>Huella :</label>
                                    <br>
                                    <img src="images/fingerprint.bmp" alt="70" width="170"/>
                                </div>
                            </div>
                            <div  style="text-align: center;">
                                <input type="hidden" name="accion" value="Agregar" href="Controlador?menu=AgregarTurno&accion=Agregar">
                                <input type="submit" name="accion" value="Agregar" class="btn btn-info" href="Controlador?menu=ListarEmp&accion=Listar">
                                <input type="submit" name="accion" value="Actualizar" class="btn btn-success" href="Controlador?menu=ActualizarEmp&accion=Actualizar">
                            </div>
                        </div>
                    </form>

                </div>

                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; Div Cuchito 2019</span>
                        </div>
                    </div>
                </footer>
                <!-- Fin de contenido-->
            </div>
        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Salir?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Desea realmente salir del sistema?.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancelar</button>
                        <form action="Validar" method="POST">
                            <button name="accion" value="Salir" class="btn btn-primary" href="#">Salir</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- End of Content Wrapper -->
        <%----%>
        <script src="js/FechaHora.js" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>