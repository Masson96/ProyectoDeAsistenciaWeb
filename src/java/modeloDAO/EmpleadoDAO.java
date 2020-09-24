package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import modelo.TurnoEmpleado;

public class EmpleadoDAO {

    Conexion cn = new Conexion();
    TurnoEmpleado te = new TurnoEmpleado();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Empleado buscarEmpleado(String dni) {
        Empleado ebusq = new Empleado();
        String sql = "Select * from Empleado where DniEmpleado=" + dni;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ebusq.setIdEmpleado(rs.getInt(1));
                ebusq.setNombres(rs.getString(2));
                ebusq.setApellidoPaterno(rs.getString(3));
                ebusq.setApellidoMaterno(rs.getString(4));
                ebusq.setDni(rs.getString(5));
                ebusq.setGenero(rs.getString(6));
                ebusq.setDireccion(rs.getString(7));
                ebusq.setTelefono(rs.getString(8));
                ebusq.setCorreo(rs.getString(9));
                ebusq.setDescanso(rs.getString(10));
                ebusq.setFecha_hora(rs.getString(11));
                ebusq.setTurno(rs.getString(12));
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return ebusq;
    }

    public Empleado buscar(String dni) {
        Empleado empl = new Empleado();
        String sql = "select * from Empleado where DniEmpleado=" + dni;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                empl.setIdEmpleado(rs.getInt(1));
                empl.setNombres(rs.getString(2));
                empl.setApellidoPaterno(rs.getString(3));
                empl.setApellidoMaterno(rs.getString(4));
                empl.setDni(rs.getString(5));
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return empl;
    }

    //OPERACIONES CRUD
    public List listar() {
        String sql = "SELECT \n"
                + "Empleado.idEmpleado,\n"
                + "Empleado.Nombres,\n"
                + "Empleado.ApellidoPaterno,\n"
                + "Empleado.ApellidoMaterno,\n"
                + "Empleado.DniEmpleado,\n"
                + "Empleado.Genero,\n"
                + "Empleado.Direccion,\n"
                + "Empleado.Telefono,\n"
                + "Empleado.Correo,\n"
                + "Empleado.Dia_Descanso,\n"
                + "Empleado.Fecha_hora,\n"
                + "Turno.DescTurno\n"
                + "FROM Empleado INNER JOIN Turno \n"
                + "on Empleado.idTurno = Turno.idTurno";
        List<Empleado> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setIdEmpleado(rs.getInt(1));
                em.setNombres(rs.getString(2));
                em.setApellidoPaterno(rs.getString(3));
                em.setApellidoMaterno(rs.getString(4));
                em.setDni(rs.getString(5));
                em.setGenero(rs.getString(6));
                em.setDireccion(rs.getString(7));
                em.setTelefono(rs.getString(8));
                em.setCorreo(rs.getString(9));
                em.setDescanso(rs.getString(10));
                em.setFecha_hora(rs.getString(11));
                em.setTurno(rs.getString(12));
                lista.add(em);
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return lista;
    }

    public int agregar(Empleado em) {
        String sql = "insert into Empleado(Nombres, ApellidoPaterno, ApellidoMaterno, DniEmpleado, Genero, Direccion, Telefono, Correo, Dia_Descanso, idTurno)"
                + "values(?,?,?,?,?,?,?,?,?,(select idTurno from Turno where DescTurno=?))";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getNombres());
            ps.setString(2, em.getApellidoPaterno());
            ps.setString(3, em.getApellidoMaterno());
            ps.setString(4, em.getDni());
            ps.setString(5, em.getGenero());
            ps.setString(6, em.getDireccion());
            ps.setString(7, em.getTelefono());
            ps.setString(8, em.getCorreo());
            ps.setString(9, em.getDescanso());
            ps.setString(10, em.getTurno());
            //ps.setString(11, em.getBanco());

            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return r;
    }

    public Empleado listarEmpleado() {
        Empleado listemple = new Empleado();
        String sql = "Select idEmpleado, Nombres from Empleado";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                listemple.setIdEmpleado(rs.getInt(1));
                listemple.setNombres(rs.getString(2));
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return listemple;
    }

    public Empleado listarId(int id) {
        Empleado emp = new Empleado();
        String sql = "select * from Empleado where idEmpleado=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                emp.setIdEmpleado(rs.getInt(1));
                emp.setNombres(rs.getString(2));
                emp.setApellidoPaterno(rs.getString(3));
                emp.setApellidoMaterno(rs.getString(4));
                emp.setDni(rs.getString(5));
                emp.setGenero(rs.getString(6));
                emp.setDireccion(rs.getString(7));
                emp.setTelefono(rs.getString(8));
                emp.setCorreo(rs.getString(9));
                emp.setDescanso(rs.getString(10));
                emp.setFecha_hora(rs.getString(11));
                emp.setTurno(rs.getString(12));
            }
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return emp;
    }

    public int actualizar(Empleado em) {
        String sql = "update Empleado set Nombres=?, ApellidoPaterno=?, ApellidoMaterno=?, DniEmpleado=?, Genero=?, Direccion=?, Telefono=?, Correo=?, Dia_Descanso=? where idEmpleado=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getNombres());
            ps.setString(2, em.getApellidoPaterno());
            ps.setString(3, em.getApellidoMaterno());
            ps.setString(4, em.getDni());
            ps.setString(5, em.getGenero());
            ps.setString(6, em.getDireccion());
            ps.setString(7, em.getTelefono());
            ps.setString(8, em.getCorreo());
            ps.setString(9, em.getDescanso());
            ps.setString(10, em.getTurno());
            ps.setInt(10, em.getIdEmpleado());
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from Empleado where idEmpleado=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("ERROR" + e);
        }
    }
}
