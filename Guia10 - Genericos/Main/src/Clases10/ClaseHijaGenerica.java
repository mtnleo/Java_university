package Clases10;

public class ClaseHijaGenerica <T extends ClasePadreGenerica<?>> extends ClasePadreGenerica<T>{
    // ATRIBUTOS

    public int hectareas;

    // CONSTRUCTORES

    public ClaseHijaGenerica(String nombre, int hectareas) {
        super(nombre);
        this.hectareas = hectareas;
    }

    // METODOS

    @Override
    public String toString() {
        return "ClaseHijaGenerica{" +
                "hectareas=" + hectareas +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
