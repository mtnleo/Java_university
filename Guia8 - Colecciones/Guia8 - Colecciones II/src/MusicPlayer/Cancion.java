package MusicPlayer;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Cancion {
    // CONSTANTES Y DEMAS

    private final String[] generosAceptados = {"ROCK", "TRAP", "JAZZ", "HIP HOP", "POP", "METAL", "CLASICA"};

    // ATRIBUTOS

    private String nombre;
    private int duracion; //en minutos
    private String genero;
    private Album album;
    private Artista artista;
    private boolean invitado;
    private Artista artistaInvitado;

    // CONSTRUCTORS

    public Cancion(String nombre, int duracion, String genero, Album album, Artista artista) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = verificarGenero(genero);
        this.album = album;
        this.artista = artista;
        this.invitado = false;
        this.artistaInvitado = null;
    }

    public Cancion(String nombre, int duracion, String genero, Album album, Artista artista, Artista artistaInvitado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = verificarGenero(genero);
        this.album = album;
        this.artista = artista;
        this.invitado = true;
        this.artistaInvitado = artistaInvitado;
    }

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Artista getArtistaInvitado() {
        return artistaInvitado;
    }

    public void setArtistaInvitado(Artista artistaInvitado) {
        this.artistaInvitado = artistaInvitado;
        this.invitado = true;
    }

    // METODOS

    private String pasarMinutosHoras(int segundos) {
        int minutos = segundos / 60;
        int segundosRestantes = segundos - (minutos * 60);

        String resultado;
        if (segundosRestantes < 10) {
            resultado = String.valueOf(minutos) + ":0" + String.valueOf(segundosRestantes);
        }
        else {
            resultado = String.valueOf(minutos) + ":" + String.valueOf(segundosRestantes);
        }



        return resultado;
    }

    private String verificarGenero(String genero) {
        Scanner scan = new Scanner(System.in);

        boolean encontrado = false;

        for (String gen: generosAceptados) {
            if (gen.equalsIgnoreCase(genero)) {
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Genero incorrecto, escribalo nuevamente: ");
            String nuevoGenero = scan.nextLine();
            genero = verificarGenero(nuevoGenero);
        }

        return genero;
    }

    @Override
    public String toString() {
        String msg = nombre + "   -   " + pasarMinutosHoras(duracion) + "\n" + "By " + artista.getNombre() + "   -   " + album.getTitulo() + " | " + genero;
        if(invitado) {
            msg = msg.concat("ft. " + artistaInvitado.getNombre());
        }

        return msg;
    }

}

