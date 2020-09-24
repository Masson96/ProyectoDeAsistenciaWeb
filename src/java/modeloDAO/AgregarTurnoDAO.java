package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.AgregarTurnoModel;
import modelo.TurnoEmpleado;

public class AgregarTurnoDAO {

    Conexion cn = new Conexion();
    TurnoEmpleado te = new TurnoEmpleado();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    //Operaciones CRUD
    
    public int agregar(AgregarTurnoModel atm){
        String sql = "insert into Turno(DescTurno)values(?)";
        try {
            con= cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, atm.getDescTurno());
            
            ps.executeQuery();
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
        return r;
    }
}
