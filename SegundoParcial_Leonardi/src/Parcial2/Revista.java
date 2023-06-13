package Parcial2;

import java.util.Objects;

public class Revista extends Material implements Alquilar{
    // ATRIBUTOS
    private int numEdicion;
    private boolean suscripcion;

    // CONSTRUCTORES

    public Revista() {
    }

    public Revista(String titulo, String autor, int anioPublicacion, int cantEjemplares, int numEdicion, boolean suscripcion) {
        super(titulo, autor, anioPublicacion, cantEjemplares);
        this.numEdicion = numEdicion;
        this.suscripcion = suscripcion;
    }

    // GETTERS/SETTERS

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public boolean tieneSuscripcion() {
        return suscripcion;
    }

    public void establecerSuscripcion(boolean suscripcion) {
        this.suscripcion = suscripcion;
    }

    // METODOS

    @Override
    public boolean prestar() {
        boolean prestado = false;
        if (checkDisponibilidad()) {
            prestado = true;
            super.setCantEjemplares(super.getCantEjemplares() - 1);
            if (super.getCantEjemplares() == 0) {
                super.setDisponibilidad(false);
            }
        }

        return prestado;
    }

    @Override
    public void devolver() {
        super.setCantEjemplares(super.getCantEjemplares() + 1);
        if (!checkDisponibilidad()) {
            super.setDisponibilidad(true);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Revista revista = (Revista) o;
        return numEdicion == revista.numEdicion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numEdicion);
    }

    @Override
    public String toString() {
        return "| Revista -------------" +
                super.toString() +
                "\nNumero de edicion = " + numEdicion +
                "\nPosee suscripcion = " + suscripcion;
    }
}
