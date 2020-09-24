package modelo;

public class BuscarEmpleado {

    int idEmpleado;
    String Nombres;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String DniEmpleado;

    public BuscarEmpleado() {
    }

    public BuscarEmpleado(int idEmpleado, String Nombres, String ApellidoPaterno, String ApellidoMaterno, String DniEmpleado) {
        this.idEmpleado = idEmpleado;
        this.Nombres = Nombres;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.DniEmpleado = DniEmpleado;
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

    
    
}
