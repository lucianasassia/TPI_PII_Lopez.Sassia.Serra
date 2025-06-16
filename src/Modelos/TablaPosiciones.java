package Modelos;

public class TablaPosiciones {
    private Equipo equipo;
    private int jugados;
    private int ganados;
    private int perdidos;
    private int puntos;

    Resultados resultados1 = new Resultados();

    public TablaPosiciones() {
    }

    public TablaPosiciones(Equipo equipo, int jugados, int ganados, int perdidos, int puntos) {
        this.equipo = equipo;
        this.jugados = jugados;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.puntos = puntos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getJugados() {
        return jugados;
    }

    public void setJugados(int jugados) {
        this.jugados = jugados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public int setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "TablaPosiciones{" +
                "equipo=" + equipo +
                ", jugados=" + jugados +
                ", ganados=" + ganados +
                ", perdidos=" + perdidos +
                ", puntos=" + puntos +
                '}';
    }

    public void actualizar(){
        resultados1 = Resultados.()

    }
}
}
