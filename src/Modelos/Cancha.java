package Modelos;

public class Cancha {
    private int nroCancha;
    private String ubicacion;

    public Cancha() {
    }

    public Cancha(int nroCancha, String ubicacion) {
        this.nroCancha = nroCancha;
        this.ubicacion = ubicacion;
    }

    public int getNroCancha() {
        return nroCancha;
    }

    public void setNroCancha(int nroCancha) {
        this.nroCancha = nroCancha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Cancha{" +
                "nroCancha=" + nroCancha +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}