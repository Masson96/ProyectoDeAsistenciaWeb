package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Horario;

public class HorarioDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    //OPERACIONES CRUD
    public List listar() {
        String sql = "SELECT\n"
                + "Empleado.Nombres,\n"
                + "Empleado.ApellidoPaterno,\n"
                + "Empleado.ApellidoMaterno,\n"
                + "Empleado.DniEmpleado,\n"
                + "Actividad.DescActividad\n"
                + "FROM\n"
                + "Actividad INNER JOIN Contrato ON Actividad.idActividad = Contrato.idActividad\n"
                + "INNER JOIN Empleado ON Contrato.idEmpleado = Empleado.idEmpleado";
        List<Horario> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Horario H = new Horario();
                H.setNombreEmpleado(rs.getString(1));
                H.setApellidoPaterno(rs.getString(2));
                H.setApellidoMaterno(rs.getString(3));
                H.setDniEmpleado(rs.getString(4));
                H.setDescActividad(rs.getString(5));
                lista.add(H);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return lista;
    }

}
