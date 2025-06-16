package Modelos;

public class Resultados {
    private int nroPartido;
    private int setsEquipoA;
    private int setsEquipoB;
    private TablaPosiciones tablaPosiciones;

    public Resultados() {
    }

    public Resultados(int nroPartido, int setsEquipoA, int setsEquipoB) {
        this.nroPartido = nroPartido;
        this.setsEquipoA = setsEquipoA;
        this.setsEquipoB = setsEquipoB;
    }

    public int getNroPartido() {
        return nroPartido;
    }

    public void setNroPartido(int nroPartido) {
        this.nroPartido = nroPartido;
    }

    public int getSetsEquipoA() {
        return setsEquipoA;
    }

    public void setSetsEquipoA(int setsEquipoA) {
        this.setsEquipoA = setsEquipoA;
    }

    public int getSetsEquipoB() {
        return setsEquipoB;
    }

    public void setSetsEquipoB(int setsEquipoB) {
        this.setsEquipoB = setsEquipoB;
    }

    @Override
    public String toString() {
        return "Resultados{" +
                "nroPartido=" + nroPartido +
                ", setsEquipoA=" + setsEquipoA +
                ", setsEquipoB=" + setsEquipoB +
                '}';
    }

    public int calcResultado(){
        if (setsEquipoA>setsEquipoB){
            return 1;
        }else return 0;
    }
}