package Parcial;

import java.util.Objects;

public class AyudanteCampo extends Integrante implements Entrenamiento, Partido {
    // ATRIBUTOS

    private String metodologia;

    // CONSTRUCTORES

    public AyudanteCampo(String nombre, String apellido, int edad, String metodologia) {
        super(nombre, apellido, edad);
        this.metodologia = metodologia;
    }

    // GETTERS AND SETTERS

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    // METODOS

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AyudanteCampo that = (AyudanteCampo) o;
        return Objects.equals(metodologia, that.metodologia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), metodologia);
    }

    @Override
    public void prepararEntrenamiento() {
        System.out.println("Ayudante prepara el entrenamiento");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Ayudante ayuda al DT en el partido");
    }
}
