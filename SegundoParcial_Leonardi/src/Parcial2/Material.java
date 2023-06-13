package Parcial2;

import java.util.Objects;

public class Material {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantEjemplares;
    private boolean disponibilidad;

    // CONSTRUCTORES
    public Material(){}

    public Material(String titulo, String autor, int anioPublicacion, int cantEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.cantEjemplares = cantEjemplares;
        if (cantEjemplares > 0) {
            this.disponibilidad = true;
        }
        else {
            this.disponibilidad = false;
        }
    }

    // GETTERS/SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    // METODOS
    public boolean checkDisponibilidad() {
        return this.cantEjemplares > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return anioPublicacion == material.anioPublicacion && Objects.equals(titulo, material.titulo) && Objects.equals(autor, material.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anioPublicacion);
    }

    @Override
    public String toString() {
        return  "\nTitulo = " + titulo +
                "\nAutor='" + autor +
                "\nAnio de Publicacion = " + anioPublicacion +
                "\nCantidad de Ejemplares = " + cantEjemplares +
                "\nDisponibilidad = " + disponibilidad;
    }
}
