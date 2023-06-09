package Parcial;

import java.util.Objects;

public class Masajista extends Integrante implements Asistencia {
    // ATRIBUTO

    private String titulo;
    private int aniosExperiencia;

    // CONSTRUCTORES

    public Masajista(String nombre, String apellido, int edad, String titulo, int aniosExperiencia) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.aniosExperiencia = aniosExperiencia;
    }

    // GETTERS AND SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // METODOS

    @Override
    public void asistirJugador() {
        System.out.println("Masajista asiste al jugador.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Masajista masajista = (Masajista) o;
        return aniosExperiencia == masajista.aniosExperiencia && Objects.equals(titulo, masajista.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), titulo, aniosExperiencia);
    }
}
