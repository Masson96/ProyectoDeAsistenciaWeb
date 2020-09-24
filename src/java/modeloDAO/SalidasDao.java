package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Salidas;

public class SalidasDao {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    //OPERACIONES CRUD
    public List listar() {
        String sql = "SELECT\n"
                + "empleado.idEmpleado,\n"
                + "empleado.Nombres,\n"
                + "empleado.ApellidoPaterno,\n"
                + "empleado.ApellidoMaterno,\n"
                + "empleado.DniEmpleado,\n"
                + "empleado.Genero,\n"
                + "actividad.DescActividad,\n"
                + "marcacion.HoraFinalizacion_Mar\n"
                + "FROM\n"
                + "empleado INNER JOIN  marcacion ON empleado.idEmpleado = marcacion.idEmpleado\n"
                + "INNER JOIN contrato ON empleado.idEmpleado = contrato.idEmpleado\n"
                + "INNER JOIN actividad ON contrato.idActividad = actividad.idActividad;";
        List<Salidas> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Salidas sali = new Salidas();
                sali.setIdEmpleado(rs.getInt(1));
                sali.setApellidosPaterno(rs.getString(2));
                sali.setApellidoMaterno(rs.getString(3));
                sali.setDniEmpleado(rs.getString(4));
                sali.setDescActividad(rs.getString(5));
                sali.setSalida(rs.getString(6));
                lista.add(sali);
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return lista;
    }

}
