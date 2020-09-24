package modelo;

public class Afp {

    int idAfp;
    String Ctcont;
    String Comision;

    public Afp() {
    }

    public Afp(int idAfp, String Ctcont, String Comision) {
        this.idAfp = idAfp;
        this.Ctcont = Ctcont;
        this.Comision = Comision;
    }

    public int getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(int idAfp) {
        this.idAfp = idAfp;
    }

    public String getCtcont() {
        return Ctcont;
    }

    public void setCtcont(String Ctcont) {
        this.Ctcont = Ctcont;
    }

    public String getComision() {
        return Comision;
    }

    public void setComision(String Comision) {
        this.Comision = Comision;
    }

}
