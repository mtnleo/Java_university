package Guia6;

public final class Libro extends Texto implements Prestable {
    /// ATRIBUTOS ----------------------------------

    private boolean prestado;

    /// CONSTRUCTOR ----------------------------------

    public Libro(String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        this.prestado = false;
    }

    /// GETTERS AND SETTERS ----------------------------------

    public boolean isPrestado() {
        return prestado;
    }

    /// METODOS DE LA INTERFAZ ----------------------------------

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    /// METODOS ----------------------------------

    @Override
    public String toString() {
        return "Libro{" +
                "prestado=" + prestado +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
