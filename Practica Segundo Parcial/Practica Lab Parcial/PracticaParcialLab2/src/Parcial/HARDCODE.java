package Parcial;

public abstract class HARDCODE {
    public static Federacion cargarFederacion() {
        Federacion fed = new Federacion("Argentina", "21 Febrero, 1893", 3);

        // INTEGRANTE
        Entrenador ent1 = new Entrenador("Leonel", "Scaloni", 45, "Pase y pase", "Futbol Champagne");

        AyudanteCampo ayu1 = new AyudanteCampo("Pablo", "Aimar", 43, "Desempeño individual y colectivo");

        Futbolista fut1 = new Futbolista("Leonel", "Messi", 35, 10, Posicion.DELANTERO);
        Futbolista fut2 = new Futbolista("Sergio", "Aguero", 33, 9, Posicion.DELANTERO);
        Futbolista fut3 = new Futbolista("Angel", "Di Maria", 33, 11, Posicion.DELANTERO);
        Futbolista fut4 = new Futbolista("Gonzalo", "Higuain", 34, 9, Posicion.DELANTERO);
        Futbolista fut5 = new Futbolista("Paulo", "Dybala", 27, 21, Posicion.DELANTERO);
        Futbolista fut6 = new Futbolista("Nicolas", "Otamendi", 33, 17, Posicion.DEFENSA);
        Futbolista fut7 = new Futbolista("Marcos", "Rojo", 31, 16, Posicion.DEFENSA);
        Futbolista fut8 = new Futbolista("Javier", "Mascherano", 37, 14, Posicion.MEDIOCAMPISTA);
        Futbolista fut9 = new Futbolista("Rodrigo", "De Paul", 27, 18, Posicion.MEDIOCAMPISTA);
        Futbolista fut10 = new Futbolista("Giovani", "Lo Celso", 25, 20, Posicion.MEDIOCAMPISTA);
        Futbolista fut11 = new Futbolista("Emiliano", "Martinez", 29, 23, Posicion.ARQUERO);
        Futbolista fut12 = new Futbolista("Nahuel", "Molina", 24, 22, Posicion.DEFENSA);
        Futbolista fut13 = new Futbolista("Gonzalo", "Montiel", 24, 4, Posicion.DEFENSA);
        Futbolista fut14 = new Futbolista("Nicolas", "Tagliafico", 28, 3, Posicion.DEFENSA);
        Futbolista fut15 = new Futbolista("Leandro", "Paredes", 27, 5, Posicion.MEDIOCAMPISTA);
        Futbolista fut16 = new Futbolista("Alejandro", "Gomez", 33, 25, Posicion.MEDIOCAMPISTA);
        Futbolista fut17 = new Futbolista("Lucas", "Alario", 28, 26, Posicion.DELANTERO);
        Futbolista fut18 = new Futbolista("Franco", "Armani", 34, 27, Posicion.ARQUERO);
        Futbolista fut19 = new Futbolista("Julian", "Alvarez", 23, 9, Posicion.DELANTERO);

        Masajista mas1 = new Masajista("Martin", "Leonardi", 19, "Edicion de video Udemy", 2);
        Masajista mas2 = new Masajista("Hernan", "Navarra", 21, "Tecnico Electronica", 5);

        // AGREGAR
        fed.agregarIntegrantePlantel(ent1);
        fed.agregarIntegrantePlantel(ayu1);
        fed.agregarIntegrantePlantel(fut1);
        fed.agregarIntegrantePlantel(fut2);
        fed.agregarIntegrantePlantel(fut3);
        fed.agregarIntegrantePlantel(fut4);
        fed.agregarIntegrantePlantel(fut5);
        fed.agregarIntegrantePlantel(fut6);
        fed.agregarIntegrantePlantel(fut7);
        fed.agregarIntegrantePlantel(fut8);
        fed.agregarIntegrantePlantel(fut9);
        fed.agregarIntegrantePlantel(fut10);
        fed.agregarIntegrantePlantel(fut11);
        fed.agregarIntegrantePlantel(fut12);
        fed.agregarIntegrantePlantel(fut13);
        fed.agregarIntegrantePlantel(fut14);
        fed.agregarIntegrantePlantel(fut15);
        fed.agregarIntegrantePlantel(fut16);
        fed.agregarIntegrantePlantel(fut17);
        fed.agregarIntegrantePlantel(fut18);
        fed.agregarIntegrantePlantel(fut19);
        fed.agregarIntegrantePlantel(mas1);
        fed.agregarIntegrantePlantel(mas2);

        return fed;
    }

    public static Federacion cargarFederacionMenosUno() { // para que pueda agregar uno mas y ver si puedo meter un DT, bug fixing
        Federacion fed = new Federacion("Argentina", "21 Febrero, 1893", 3);

        // INTEGRANTE
        Entrenador ent1 = new Entrenador("Leonel", "Scaloni", 45, "Pase y pase", "Futbol Champagne");

        AyudanteCampo ayu1 = new AyudanteCampo("Pablo", "Aimar", 43, "Desempeño individual y colectivo");

        Futbolista fut1 = new Futbolista("Leonel", "Messi", 35, 10, Posicion.DELANTERO);
        Futbolista fut2 = new Futbolista("Sergio", "Aguero", 33, 9, Posicion.DELANTERO);
        Futbolista fut3 = new Futbolista("Angel", "Di Maria", 33, 11, Posicion.DELANTERO);
        Futbolista fut4 = new Futbolista("Gonzalo", "Higuain", 34, 9, Posicion.DELANTERO);
        Futbolista fut5 = new Futbolista("Paulo", "Dybala", 27, 21, Posicion.DELANTERO);
        Futbolista fut6 = new Futbolista("Nicolas", "Otamendi", 33, 17, Posicion.DEFENSA);
        Futbolista fut7 = new Futbolista("Marcos", "Rojo", 31, 16, Posicion.DEFENSA);
        Futbolista fut8 = new Futbolista("Javier", "Mascherano", 37, 14, Posicion.MEDIOCAMPISTA);
        Futbolista fut9 = new Futbolista("Rodrigo", "De Paul", 27, 18, Posicion.MEDIOCAMPISTA);
        Futbolista fut10 = new Futbolista("Giovani", "Lo Celso", 25, 20, Posicion.MEDIOCAMPISTA);
        Futbolista fut11 = new Futbolista("Emiliano", "Martinez", 29, 23, Posicion.ARQUERO);
        Futbolista fut12 = new Futbolista("Nahuel", "Molina", 24, 22, Posicion.DEFENSA);
        Futbolista fut13 = new Futbolista("Gonzalo", "Montiel", 24, 4, Posicion.DEFENSA);
        Futbolista fut14 = new Futbolista("Nicolas", "Tagliafico", 28, 3, Posicion.DEFENSA);
        Futbolista fut15 = new Futbolista("Leandro", "Paredes", 27, 5, Posicion.MEDIOCAMPISTA);
        Futbolista fut16 = new Futbolista("Alejandro", "Gomez", 33, 25, Posicion.MEDIOCAMPISTA);
        Futbolista fut17 = new Futbolista("Lucas", "Alario", 28, 26, Posicion.DELANTERO);
        Futbolista fut18 = new Futbolista("Franco", "Armani", 34, 27, Posicion.ARQUERO);

        Masajista mas1 = new Masajista("Martin", "Leonardi", 19, "Edicion de video Udemy", 2);
        Masajista mas2 = new Masajista("Hernan", "Navarra", 21, "Tecnico Electronica", 5);

        // AGREGAR
        fed.agregarIntegrantePlantel(ent1);
        fed.agregarIntegrantePlantel(ayu1);
        fed.agregarIntegrantePlantel(fut1);
        fed.agregarIntegrantePlantel(fut2);
        fed.agregarIntegrantePlantel(fut3);
        fed.agregarIntegrantePlantel(fut4);
        fed.agregarIntegrantePlantel(fut5);
        fed.agregarIntegrantePlantel(fut6);
        fed.agregarIntegrantePlantel(fut7);
        fed.agregarIntegrantePlantel(fut8);
        fed.agregarIntegrantePlantel(fut9);
        fed.agregarIntegrantePlantel(fut10);
        fed.agregarIntegrantePlantel(fut11);
        fed.agregarIntegrantePlantel(fut12);
        fed.agregarIntegrantePlantel(fut13);
        fed.agregarIntegrantePlantel(fut14);
        fed.agregarIntegrantePlantel(fut15);
        fed.agregarIntegrantePlantel(fut16);
        fed.agregarIntegrantePlantel(fut17);
        fed.agregarIntegrantePlantel(fut18);
        fed.agregarIntegrantePlantel(mas1);
        fed.agregarIntegrantePlantel(mas2);

        return fed;
    }
}
