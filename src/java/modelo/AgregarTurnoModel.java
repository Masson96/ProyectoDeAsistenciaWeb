package modelo;

public class AgregarTurnoModel 
{
    int idTurno;
    String DescTurno;

    public AgregarTurnoModel() {
    }

    public AgregarTurnoModel(int idTurno, String DescTurno) {
        this.idTurno = idTurno;
        this.DescTurno = DescTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getDescTurno() {
        return DescTurno;
    }

    public void setDescTurno(String DescTurno) {
        this.DescTurno = DescTurno;
    }
    
    
}
