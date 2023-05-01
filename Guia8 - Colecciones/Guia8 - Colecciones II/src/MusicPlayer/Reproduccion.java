package MusicPlayer;

public interface Reproduccion {
    public abstract void Reproducir();
    public abstract void aniadirCancion(Cancion c);
    public abstract void cambiarCancion();
    public abstract void eliminarCancion(String nombre);
    public abstract void verMiLista();
}
