package Parcial;

import java.util.Objects;

public class Futbolista extends Integrante implements Partido {
    // ATRIBUTOS

    private int nroCamiseta;
    private Posicion puesto;

    // CONSTRUCTORES

    public Futbolista(String nombre, String apellido, int edad, int nroCamiseta, Posicion puesto) {
        super(nombre, apellido, edad);
        this.nroCamiseta = nroCamiseta;
        this.puesto = puesto;
    }

    // GETTERS AND SETTERS

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public Posicion getPuesto() {
        return puesto;
    }

    public void setPuesto(Posicion puesto) {
        this.puesto = puesto;
    }

    // METODOS


    @Override
    public String toString() {
        return "Tipo: Futbolista " +
                super.toString() +
                "\nNro. Camiseta = " + nroCamiseta +
                "\nPuesto=" + puesto;
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugador jugando partido");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(super.equals(o))) return false;
        Futbolista that = (Futbolista) o;
        return nroCamiseta == that.nroCamiseta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nroCamiseta, puesto);
    }
}
