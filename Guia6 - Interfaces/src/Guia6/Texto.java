package Guia6;

public class Texto {
    /// ATRIBUTOS ----------------------------------

    protected String codigo;
    protected String titulo;
    protected int anio;

    /// CONSTRUCTOR ----------------------------------

    public Texto(String codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    /// GETTERS AND SETTERS ----------------------------------

    public String getCodigo() {
        return codigo;
    }

    public int getAnio() {
        return anio;
    }

    /// METODOS ----------------------------------

    @Override
    public String toString() {
        return "Texto{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
