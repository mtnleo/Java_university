package MusicPlayer;

public abstract class HARDCODE {
    // artistas
    public static Artista artista1 = new Artista("Taylor Swift", "Estados Unidos", "32");
    public static Artista artista2 = new Artista("Harry Styles", "Reino Unido", "27");
    public static Artista artista3 = new Artista("Shawn Mendes", "Canadá", "23");
    public static Artista artista4 = new Artista("Ed Sheeran", "Reino Unido", "30");

    // albumes

    public static Album album1 = new Album(2012, "Red", artista1);
    public static Album album2 = new Album(2014, "1989", artista1);
    public static Album album3 = new Album(2017, "Reputation", artista1);
    public static Album album4 = new Album(2019, "Lover", artista1);
    public static Album album5 = new Album(2020, "Folklore", artista1);
    public static Album album6 = new Album(2022, "Harry's House", artista2);
    public static Album album7 = new Album(2016, "Illuminate", artista3);
    public static Album album8 = new Album(2017, "Divide", artista4);

    // canciones

    public static Cancion cancion1 = new Cancion("We Are Never Ever Getting Back Together", 187, "Pop", album1, artista1);
    public static Cancion cancion2 = new Cancion("Shake It Off", 256, "Pop", album2, artista1);
    public static Cancion cancion3 = new Cancion("Look What You Made Me Do", 241, "Pop", album3, artista1);
    public static Cancion cancion4 = new Cancion("Cruel Summer", 329, "Pop", album4, artista1);
    public static Cancion cancion5 = new Cancion("Betty", 290, "Pop", album5, artista1);
    public static Cancion cancion6 = new Cancion("Matilda", 323, "Pop", album6, artista2);
    public static Cancion cancion7 = new Cancion("Treat You Better", 231, "Pop", album7, artista3);
    public static Cancion cancion8 = new Cancion("Galway Girl", 229, "Pop", album8, artista4);

    // AHORA TENGO QUE AGREGARLAS A LAS LISTAS

    public static void cargarCanciones(ListaPremium lp, ListaBasica lb) {
        lp.aniadirCancion(HARDCODE.cancion1);
        lp.aniadirCancion(HARDCODE.cancion2);
        lp.aniadirCancion(HARDCODE.cancion3);
        lp.aniadirCancion(HARDCODE.cancion4);
        lb.aniadirCancion(HARDCODE.cancion5);
        lb.aniadirCancion(HARDCODE.cancion6);
        lb.aniadirCancion(HARDCODE.cancion7);
        lb.aniadirCancion(HARDCODE.cancion8);
    }

}
