package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.BuscarEmpleado;

public class BuscarEmpleadoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public BuscarEmpleado buscar(String dni) {
        
        BuscarEmpleado be = new BuscarEmpleado();
        String sql = "select * from Empleado where DniEmpleado="+dni;
        try {
            con=cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                be.setIdEmpleado(rs.getInt(1));
                be.setNombres(rs.getString(2));
                be.setApellidoPaterno(rs.getString(3));
                be.setApellidoMaterno(rs.getString(4));
                be.setDniEmpleado(rs.getString(5));
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
        return be;
    }
}
