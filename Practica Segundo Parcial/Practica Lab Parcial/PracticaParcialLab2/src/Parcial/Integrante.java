package Parcial;

import java.util.Objects;

public class Integrante {
    // INTEGRANTE

    private String nombre;
    private String apellido;
    private int edad;

    // CONSTRUCTOR

    public Integrante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodos

    public void viajar() {
        System.out.println("Viajo");
    }

    public void concentrar() {
        System.out.println("Concentro!");
    }

    @Override
    public String toString() {
        return
                "\nNombre = " + nombre +
                "\nApellido =" + apellido +
                "\nEdad = " + edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integrante that = (Integrante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
