package Parcial2;

public abstract class HARDCODE {
    public static Biblioteca hardcodeMateriales(Biblioteca biblioteca) {
        Revista r1 = new Revista("Nat Geo", "Jimmy Chin", 2012, 2, 1, true);
        Revista r2 = new Revista("Nat Geo", "Jimmy Chin", 2012, 1, 2, true);
        Revista r3 = new Revista("Nat Geo", "Jimmy Chin", 2012, 3, 3, true);
        Revista r4 = new Revista("Nat Geo", "Jimmy Chin", 2012, 1, 4, true);
        Revista r5 = new Revista("The Humble Programmer", "Martin Leo", 2023, 1, 2, false); // a humbling experience completing guille's parciales is
        Revista r6 = new Revista("Free Solo", "Alex Honnold", 2015, 2, 1, false);

        Libro l1 = new Libro("Harry Potter and The Sorcerer's Stone", "Unnamed Author", 1991, 7, 456);
        Libro l2 = new Libro("Harry Potter and The Prisoner of Azkaban", "Unnamed Author", 1992, 3, 604);
        Libro l3 = new Libro("Guille Gimenez: A memoir", "Martin Leo", 2095, 3, 340);
        Libro l4 = new Libro("It", "Stephen King", 1987, 4, 890);

        Articulo a1 = new Articulo("Los piojos marinos", "Soledad Leo", 2020, 4, "La biologa marina Soledad extiende su conocimiento acerca de una especial poblacion de piojos que pudieron adaptarse a las duras condiciones del oceano atlantico");
        Articulo a2 = new Articulo("ChatGPT-3 en los parciales de programacion", "Martin Leo", 2023, 4, "Una exploracion sobre la facultad UTN y porque los docentes no les dejan a lxs alumnxs usar el chatGPT para hardcodear y no perder tanto tiempo en el examen, aunque sea divertido");

        biblioteca.agregarMaterial(r1);
        biblioteca.agregarMaterial(r2);
        biblioteca.agregarMaterial(r3);
        biblioteca.agregarMaterial(r4);
        biblioteca.agregarMaterial(r5);
        biblioteca.agregarMaterial(r6);
        biblioteca.agregarMaterial(l1);
        biblioteca.agregarMaterial(l2);
        biblioteca.agregarMaterial(l3);
        biblioteca.agregarMaterial(l4);
        biblioteca.agregarMaterial(a1);
        biblioteca.agregarMaterial(a2);

        return biblioteca;
    }
}
