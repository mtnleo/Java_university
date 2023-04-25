package ClasesParcial;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {
    // ATRIBUTOS ------------------------------------------

    private final String nombre;
    private final String apellido;
    private final int dni;

    // CONSTRUCTORES ------------------------------------------

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // GETTERS & SETTERS ------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    // METODOS ------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni == persona.dni && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public String toString() {
        return
                "| nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                '|';
    }
}
