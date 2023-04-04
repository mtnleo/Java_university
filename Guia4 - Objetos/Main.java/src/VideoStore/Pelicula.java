package VideoStore;

import java.time.LocalDate;

public class Pelicula {
    protected String nombre;
    protected String genero;
    protected LocalDate fecha_lanzamiento;
    protected int duracion;
    protected String clasificacion;
    protected String pais;
    protected String descripcion;

    protected int veces_alquilada;
    protected int copias;

    // GETTERS & SETTERS ---------------------------------------------------

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getVeces_alquilada() {
        return veces_alquilada;
    }

    public void setVeces_alquilada(int veces_alquilada) {
        this.veces_alquilada = veces_alquilada;
    }

    // BUILDER ---------------------------------------------------

    public Pelicula(String nombre, String genero, LocalDate fecha_lanzamiento, int duracion, String clasificacion, String pais, String descripcion, int copias) {
        this.nombre = nombre;
        this.genero = genero;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.pais = pais;
        this.descripcion = descripcion;
        this.copias = copias;
        this.veces_alquilada = 0;
    }

    // METODOS ---------------------------------------------------

    public boolean check_disponibilidad_pelicula() {
        return getCopias() > 0;
    }

}
