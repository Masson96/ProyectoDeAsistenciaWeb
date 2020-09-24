package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Afp;
import modelo.AgregarTurnoModel;
import modelo.BuscarEmpleado;
import modelo.Empleado;
import modelo.Salidas;
import modeloDAO.AfpDAO;
import modeloDAO.AgregarTurnoDAO;
import modeloDAO.BuscarEmpleadoDAO;
import modeloDAO.EmpleadoDAO;
import modeloDAO.HorarioDAO;
import modeloDAO.SalidasDao;
import modeloDAO.TurnoDAO;

public class Controlador extends HttpServlet {

    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    TurnoDAO tdao = new TurnoDAO();
    HorarioDAO hdao = new HorarioDAO();
    BuscarEmpleado be = new BuscarEmpleado();
    BuscarEmpleadoDAO bedao = new BuscarEmpleadoDAO();
    AgregarTurnoModel atm = new AgregarTurnoModel();
    AgregarTurnoDAO atdao = new AgregarTurnoDAO();
    Salidas sal = new Salidas();
    SalidasDao saldao = new SalidasDao(); 

    Afp af = new Afp();
    AfpDAO afdao = new AfpDAO();
    int ide;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        System.out.println(menu);
        System.out.println(accion);

        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        //Listar tabla empleado
        if (menu.equals("ListarEmp")) {
            switch (accion) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
            }
            request.getRequestDispatcher("VistaEmpleado/listarEmpleado.jsp").forward(request, response);
        }
        //Agregar Tabla empleado
        if (menu.equals("AgregarEmp")) {
            switch (accion) {
                case "Agregar":
                    String nom = request.getParameter("txtNombres");
                    String apep = request.getParameter("txtApellidoPaterno");
                    String apem = request.getParameter("txtApellidoMaterno");
                    String dni = request.getParameter("txtDni");
                    String gene = request.getParameter("idgenero");
                    String direcc = request.getParameter("txtDireccion");
                    String tele = request.getParameter("txtTelefono");
                    String email = request.getParameter("txtCorreo");
                    String descan = request.getParameter("iddescanso");
                    String tur = request.getParameter("idturno");
                    String banc = request.getParameter("idBanco");
                    em.setNombres(nom);
                    em.setApellidoPaterno(apep);
                    em.setApellidoMaterno(apem);
                    em.setDni(dni);
                    em.setGenero(gene);
                    em.setDireccion(direcc);
                    em.setTelefono(tele);
                    em.setCorreo(email);
                    em.setDescanso(descan);
                    em.setTurno(tur);
                    em.setBanco(banc);
                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=ListarEmp&accion=Listar").forward(request, response);
                    //request.getRequestDispatcher("Controlador?menu=ListarEmp&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nom1 = request.getParameter("txtNombres");
                    String apep1 = request.getParameter("txtApellidoPaterno");
                    String apem1 = request.getParameter("txtApellidoMaterno");
                    String dni1 = request.getParameter("txtDni");
                    String gene1 = request.getParameter("idgenero");
                    String direcc1 = request.getParameter("txtDireccion");
                    String tele1 = request.getParameter("txtTelefono");
                    String email1 = request.getParameter("txtCorreo");
                    String descan1 = request.getParameter("iddescanso");
                    String tur1 = request.getParameter("idturno");
                    String banc1 = request.getParameter("idBanco");
                    String idEmpleado = request.getParameter("idEmpleado");
                    System.out.println(idEmpleado);
                    em.setNombres(nom1);
                    em.setApellidoPaterno(apep1);
                    em.setApellidoMaterno(apem1);
                    em.setDni(dni1);
                    em.setGenero(gene1);
                    em.setDireccion(direcc1);
                    em.setTelefono(tele1);
                    em.setCorreo(email1);
                    em.setDescanso(descan1);
                    em.setTurno(tur1);
                    em.setBanco(banc1);
                    em.setIdEmpleado(Integer.parseInt(idEmpleado));
                    edao.actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=ListarEmp&accion=Listar").forward(request, response);
                    break;
                default:
                    request.getRequestDispatcher("VistaEmpleado/add.jsp").forward(request, response);
            }
        }
        //Editar Empleado
        if (menu.equals("EditarEmp")) {
            switch (accion) {
                case "eddit":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("VistaEmpleado/add.jsp").forward(request, response);
                    break;
                default:
                    request.getRequestDispatcher("VistaEmpleado/add.jsp").forward(request, response);
            }
        }
        //Eliminar Empleado
        if (menu.equals("DeleteEmp")) {
            switch (accion) {
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    //System.out.println(ide);
                    edao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=ListarEmp&accion=Listar").forward(request, response);
                    break;
                default:
                    request.getRequestDispatcher("Controlador?menu=ListarEmp&accion=Listar").forward(request, response);
            }
        }

        //Listar Turnos---------------------------------------------------
        if (menu.equals("ListarTurno")) {
            switch (accion) {
                case "Listar":
                    List lista = tdao.listar();
                    request.setAttribute("turno", lista);
                    break;
            }
            request.getRequestDispatcher("VistaTurno/listarTurno.jsp").forward(request, response);
        }
        //LISTAR HORARIOS-------------------------------------------------
        if (menu.equals("ListarHorario")) {
            switch (accion) {
                case "Listar":
                    List lista = hdao.listar();
                    request.setAttribute("horario", lista);
                    break;
            }
            request.getRequestDispatcher("Horario.jsp").forward(request, response);
        }
        
        if (menu.equals("ListarSalidas")) {
            switch(accion){
                case "Listar":
                    List lista = saldao.listar();
                    request.setAttribute("salidas", em);
                    request.getRequestDispatcher("ListarSalidas.jsp").forward(request, response);
            }
            request.getRequestDispatcher("ListarSalidas.jsp").forward(request, response);
        }

        /*-------------Buscar empleado------------------*/
        if (menu.equals("BuscarEmpleado")) {
            switch (accion) {
                case "Aceptar":
                    String dni = request.getParameter("dniempleado");
                    em.setDni(dni);
                    em = edao.buscar(dni);
                    request.setAttribute("em", em);
                    break;
                default:
                    request.getRequestDispatcher("RegistroEmpleado.jsp").forward(request, response);
            }
            request.getRequestDispatcher("RegistroEmpleado.jsp").forward(request, response);
        }

        if (menu.equals("BuscarEmple")) {
            switch (accion) {
                case "Buscar":
                    String dni = request.getParameter("txtBuscar");
                    em.setDni(dni);
                    em = edao.buscar(dni);
                    request.setAttribute("em", em);
                    break;
                default:
                    request.getRequestDispatcher("VistaEmpleado/listarEmpleado.jsp").forward(request, response);
            }
            request.getRequestDispatcher("VistaEmpleado/listarEmpleado.jsp").forward(request, response);
        }

        /*----------Agregar AFP-------------*/
        if (menu.equals("AgregarCTAFP")) {
            switch (accion) {
                case "Agregar":
                    String ct = request.getParameter("txtCTC");
                    af.setCtcont(ct);
                    request.getRequestDispatcher("Controlador?menu=ListarEmp&accion=Listar").forward(request, response);
            }
        }
        if (menu.equals("AgregarTurno")) {
            switch (accion) {
                case "Agregar":
                    String detturno = request.getParameter("idturno");
                    atm.setDescTurno(detturno);
                    atdao.agregar(atm);
                    request.getRequestDispatcher("Controlador?menu=ListarEmp&accion=Listar").forward(request, response);
                    break;
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
