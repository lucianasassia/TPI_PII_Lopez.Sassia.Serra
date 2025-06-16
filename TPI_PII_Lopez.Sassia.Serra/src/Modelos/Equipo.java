package Modelos;

public class Equipo {
    private int codEquipo;
    private String nombreEquipo;

    public Equipo() {
    }

    public Equipo(int codEquipo, String nombreEquipo) {
        this.codEquipo = codEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public int getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(int codEquipo) {
        this.codEquipo = codEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "codEquipo=" + codEquipo +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                '}';
    }
}