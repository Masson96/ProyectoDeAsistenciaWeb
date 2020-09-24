package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Afp;

public class AfpDAO 
{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    //OPERACIONES---------
    
    public List listar(){
        String sql="select * from AFP";
        List<Afp> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Afp af = new Afp();
                af.setIdAfp(rs.getInt(1));
                af.setCtcont(rs.getString(2));
                af.setComision(rs.getString(3));
                lista.add(af);
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
        return lista;
    }
    
    public int agregar (Afp af){
        String sql = "insert into AFP(CtaContable)values(?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, af.getCtcont());
            
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
        return r;
    }
    

}
