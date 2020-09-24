package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

public class TurnoDAO 
{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    //OPERACIONES CRUD
    
    public List listar(){
        String sql = "select idEmpleado, DniEmpleado, Nombres, ApellidoPaterno, ApellidoMaterno from Empleado;";
        List<Empleado> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setIdEmpleado(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNombres(rs.getString(3));
                em.setApellidoPaterno(rs.getString(4));
                em.setApellidoMaterno(rs.getString(5));    
                lista.add(em);
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return lista;
    }
}
