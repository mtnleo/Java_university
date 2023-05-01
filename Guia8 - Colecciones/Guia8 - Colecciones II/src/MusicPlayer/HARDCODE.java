package MusicPlayer;

public class HARDCODE {
    // artistas
    Artista artista1 = new Artista("Taylor Swift", "Estados Unidos", "32");
    Artista artista2 = new Artista("Harry Styles", "Reino Unido", "27");
    Artista artista3 = new Artista("Shawn Mendes", "Canadá", "23");
    Artista artista4 = new Artista("Ed Sheeran", "Reino Unido", "30");

    // albumes

    Album album1 = new Album(2012, "Red", artista1);
    Album album2 = new Album(2014, "1989", artista1);
    Album album3 = new Album(2017, "Reputation", artista1);
    Album album4 = new Album(2019, "Lover", artista1);
    Album album5 = new Album(2020, "Folklore", artista1);
    Album album6 = new Album(2022, "Harry's House", artista2);
    Album album7 = new Album(2016, "Illuminate", artista3);
    Album album8 = new Album(2017, "Divide", artista4);

    // canciones

    Cancion cancion1 = new Cancion("We Are Never Ever Getting Back Together", 3, "Pop", album1, artista1);
    Cancion cancion2 = new Cancion("Shake It Off", 4, "Pop", album2, artista1);
    Cancion cancion3 = new Cancion("Look What You Made Me Do", 4, "Pop", album3, artista1);
    Cancion cancion4 = new Cancion("Cruel Summer", 3, "Pop", album4, artista1);
    Cancion cancion5 = new Cancion("Betty", 4, "Pop", album5, artista1);
    Cancion cancion6 = new Cancion("Matilda", 4, "Pop", album6, artista2);
    Cancion cancion7 = new Cancion("Treat You Better", 3, "Pop", album7, artista3);
    Cancion cancion8 = new Cancion("Galway Girl", 4, "Pop", album8, artista4);

    // AHORA TENGO QUE AGREGARLAS A LAS LISTAS

}
