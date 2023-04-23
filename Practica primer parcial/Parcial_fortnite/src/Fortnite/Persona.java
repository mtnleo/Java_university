package Fortnite;

import java.util.Objects;

public abstract class Persona {
    /// ATRIBUTOS --------------------------

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String localidad;

    /// CONSTRUCTORS --------------------------

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.localidad = "";
    }

    public Persona(String nombre, String apellido, int edad, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
    }

    /// GETTERS AND SETTERS --------------------------



    /// METODOS --------------------------

    public void concentrar() {
        System.out.println("Concentrar");
    }

    public void viajar() {
        System.out.println("Viajar");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(localidad, persona.localidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, localidad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
