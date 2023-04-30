package MusicPlayer;

public final class Album {
    // ATRIBUTOS

    private final int anio;
    private final int titulo;
    private final Artista artista;

    // CONSTRUCTORS

    public Album(int anio, int titulo, Artista artista) {
        this.anio = anio;
        this.titulo = titulo;
        this.artista = artista;
    }

    // GETTERS & SETTERS

    public int getAnio() {
        return anio;
    }

    public int getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    // METODOS
}
