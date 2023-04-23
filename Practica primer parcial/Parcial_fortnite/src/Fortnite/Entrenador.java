package Fortnite;

public class Entrenador extends Persona implements ParticipaPartida {
    /// ATRIBUTOS --------------------------

    protected int anios_experiencia;

    /// CONSTRUCTORS --------------------------

    public Entrenador() {
        super();
        this.anios_experiencia = 0;
    }

    public Entrenador(String nombre, String apellido, int edad, String localidad, int anios_experiencia) {
        super(nombre, apellido, edad, localidad);
        this.anios_experiencia = anios_experiencia;
    }

    /// METODO INTERFAZ --------------------------

    @Override
    public boolean participarPartida(Object a) {
        return a instanceof Entrenador;
    }

    /// METODOS --------------------------

    public void darIndicaciones() {
        System.out.println("El entrenador da indicaciones");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "anios_experiencia=" + anios_experiencia +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
