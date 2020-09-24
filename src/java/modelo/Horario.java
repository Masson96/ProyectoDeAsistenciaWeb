
package modelo;

public class Horario 
{
    int idEmpleado;
    String NombreEmpleado;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String DniEmpleado;
    String DescActividad;

    public Horario() {
    }

    public Horario(int idEmpleado, String NombreEmpleado, String ApellidoPaterno, String ApellidoMaterno, String DniEmpleado, String DescActividad) {
        this.idEmpleado = idEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.DniEmpleado = DniEmpleado;
        this.DescActividad = DescActividad;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getDniEmpleado() {
        return DniEmpleado;
    }

    public void setDniEmpleado(String DniEmpleado) {
        this.DniEmpleado = DniEmpleado;
    }

    public String getDescActividad() {
        return DescActividad;
    }

    public void setDescActividad(String DescActividad) {
        this.DescActividad = DescActividad;
    }
    
    
}
