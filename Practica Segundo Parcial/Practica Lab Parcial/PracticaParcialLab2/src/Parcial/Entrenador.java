package Parcial;

import java.util.Objects;

public class Entrenador extends Integrante implements Entrenamiento, Partido {
    // ATRIBUTOS

    private String sistemaJuego;
    private String estilo;

    // CONSTRUCTOR

    public Entrenador(String nombre, String apellido, int edad, String sistemaJuego, String estilo) {
        super(nombre, apellido, edad);
        this.sistemaJuego = sistemaJuego;
        this.estilo = estilo;
    }

    // GETTERS AND SETTERS

    public String getSistemaJuego() {
        return sistemaJuego;
    }

    public void setSistemaJuego(String sistemaJuego) {
        this.sistemaJuego = sistemaJuego;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    // METODOS

    @Override
    public boolean equals(Object o) { // si bien no se puede agregar más de un entrenador, si el usuario vuelve a ingresar
        if (this == o) return true;   // el mismo entrenador, entonces no dará mensaje de error.
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Entrenador that = (Entrenador) o;
        return Objects.equals(sistemaJuego, that.sistemaJuego) && Objects.equals(estilo, that.estilo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sistemaJuego, estilo);
    }

    @Override
    public void prepararEntrenamiento() {
        System.out.println("DT prepara el entrenamiento");
    }

    @Override
    public void jugarPartido() {
        System.out.println("DT dirige en el partido");
    }
}
