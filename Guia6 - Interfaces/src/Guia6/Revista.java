package Guia6;

public final class Revista extends Texto {
    /// ATRIBUTOS ----------------------------------

    private int numero;

    /// CONSTRUCTOR ----------------------------------

    public Revista(String codigo, String titulo, int anio, int numero) {
        super(codigo, titulo, anio);
        this.numero = numero;
    }

    /// GETTERS AND SETTERS ----------------------------------

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /// METODOS ----------------------------------

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                ", codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
