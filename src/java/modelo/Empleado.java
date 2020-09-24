
package modelo;


public class Empleado 
{
    int idEmpleado;
    String Nombres;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String Dni;
    String Genero;
    String Direccion;
    String Telefono;
    String Correo;
    String Descanso;
    String Fecha_hora;
    String Turno;
    String cargo;
    String Banco;
    String Ctaafp;
    

    public Empleado() {
    }

    public Empleado(int idEmpleado, String Nombres, String ApellidoPaterno, String ApellidoMaterno, String Dni, String Genero, String Direccion, String Telefono, String Correo, String Descanso, String Fecha_hora, String Turno, String cargo, String Banco, String Ctaafp) {
        this.idEmpleado = idEmpleado;
        this.Nombres = Nombres;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Dni = Dni;
        this.Genero = Genero;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Descanso = Descanso;
        this.Fecha_hora = Fecha_hora;
        this.Turno = Turno;
        this.cargo = cargo;
        this.Banco = Banco;
        this.Ctaafp = Ctaafp;
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

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDescanso() {
        return Descanso;
    }

    public void setDescanso(String Descanso) {
        this.Descanso = Descanso;
    }

    public String getFecha_hora() {
        return Fecha_hora;
    }

    public void setFecha_hora(String Fecha_hora) {
        this.Fecha_hora = Fecha_hora;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getCtaafp() {
        return Ctaafp;
    }

    public void setCtaafp(String Ctaafp) {
        this.Ctaafp = Ctaafp;
    }

   
}
