
package modelo;

public class Salidas 
{
    int idEmpleado;
    String Nombres;
    String ApellidosPaterno;
    String ApellidoMaterno;
    String DniEmpleado;
    String DescActividad;
    String salida;

    public Salidas() {
    }

    public Salidas(int idEmpleado, String Nombres, String ApellidosPaterno, String ApellidoMaterno, String DniEmpleado, String DescActividad, String salida) {
        this.idEmpleado = idEmpleado;
        this.Nombres = Nombres;
        this.ApellidosPaterno = ApellidosPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.DniEmpleado = DniEmpleado;
        this.DescActividad = DescActividad;
        this.salida = salida;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidosPaterno() {
        return ApellidosPaterno;
    }

    public void setApellidosPaterno(String ApellidosPaterno) {
        this.ApellidosPaterno = ApellidosPaterno;
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

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

   
    
    
}
