package MusicPlayer;

public final class Artista {
    // ATRIBUTOS

    private final String nombre;
    private final String nacionalidad;
    private final String edad;

    // CONSTRUCTORS

    public Artista(String nombre, String nacionalidad, String edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getEdad() {
        return edad;
    }

    // METODOS
}
