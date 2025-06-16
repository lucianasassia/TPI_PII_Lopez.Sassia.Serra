package Modelos;

public class Partido {
    private int nroPartido;
    private String equipoA;
    private String equipoB;
    private int dniArbitro;
    private int nroCancha;
    private String estado;


    public Partido(int nroPartido, String equipoA, String equipoB, int dniArbitro, int nroCancha, String estado) {
        this.nroPartido = nroPartido;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.dniArbitro = dniArbitro;
        this.nroCancha = nroCancha;
        this.estado = estado;
    }

    // Getters y Setters
    public int getNroPartido() { return nroPartido; }
    public void setNroPartido(int nroPartido) { this.nroPartido = nroPartido; }

    public String getEquipoA() { return equipoA; }
    public void setEquipoA(String equipoA) { this.equipoA = equipoA; }

    public String getEquipoB() { return equipoB; }
    public void setEquipoB(String equipoB) { this.equipoB = equipoB; }

    public int getDniArbitro() { return dniArbitro; }
    public void setDniArbitro(int dniArbitro) { this.dniArbitro = dniArbitro; }

    public int getNroCancha() { return nroCancha; }
    public void setNroCancha(int nroCancha) { this.nroCancha = nroCancha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Partido{" +
                "nroPartido=" + nroPartido +
                ", equipoA='" + equipoA + '\'' +
                ", equipoB='" + equipoB + '\'' +
                ", dniArbitro=" + dniArbitro +
                ", nroCancha=" + nroCancha +
                ", estado='" + estado + '\'' +
                '}';
    }

}