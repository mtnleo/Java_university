package Parcial2;

import java.util.Objects;

public class Articulo extends Material{
    // ATRIBUTOS
    private String resumen;

    // CONSTRUCTORES

    public Articulo() {
    }

    public Articulo(String titulo, String autor, int anioPublicacion, int cantEjemplares, String resumen) {
        super(titulo, autor, anioPublicacion, cantEjemplares);
        this.resumen = resumen;
    }

    // GETTERS/SETTERS

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    // METODOS

    @Override
    public String toString() {
        return "| Articulo -------------" +
                super.toString() +
                "\nResumen = " + resumen;
    }
}
