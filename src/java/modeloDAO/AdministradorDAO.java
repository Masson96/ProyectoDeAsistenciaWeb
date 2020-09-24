package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Administrador;

public class AdministradorDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Administrador validar(String user, String dni) {
        Administrador ad = new Administrador();
        String sql = "Select * from administrador where user=? and DniAdm=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                ad.setUser(rs.getString("User")); //o numero de la columna
                ad.setDni(rs.getString("DniAdm"));
                ad.setNom(rs.getString("NombresAdm"));
                ad.setApe(rs.getString("ApellidosAdm"));
            }
        } catch (Exception e) {
            System.err.println("ERROR"+e);
        }
        return ad;
    }
}
