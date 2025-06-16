package Modelos;

public class Arbitro {
    private int dni;
    private String nombre;
    private boolean disponible;

    public Arbitro() {
    }

    public Arbitro(int dni, String nombre, boolean disponible) {
        this.dni = dni;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Arbitro{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", disponible=" + disponible +
                '}';
    }

    public int getDisponible() {
        if (disponible = true) {
            return 1;
        }else
            return 0;
    }


}
