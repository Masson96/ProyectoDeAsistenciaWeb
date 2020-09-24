
package modelo;

public class TurnoEmpleado 
{
    int idturno;
    String DescripTurno;

    public TurnoEmpleado() {
    }

    public TurnoEmpleado(int idturno, String DescripTurno) {
        this.idturno = idturno;
        this.DescripTurno = DescripTurno;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getDescripTurno() {
        return DescripTurno;
    }

    public void setDescripTurno(String DescripTurno) {
        this.DescripTurno = DescripTurno;
    }
    
}
