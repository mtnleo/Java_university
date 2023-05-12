package Gua9;

import java.util.HashSet;

public class Jugadores {
    // ATRIBUTOS

    HashSet<String> plantilla;

    // CODNSTRUCTOR

    public Jugadores() {
        this.plantilla = new HashSet<String>();
    }

    // GETTERS AND SETTERS

    public HashSet<String> getPlantilla() {
        return plantilla;
    }

    // METODOS

    public void aniadirJugador(String jugador) {
        plantilla.add(jugador);
    }

    public void removerJugador(String jugador) {
        plantilla.remove(jugador);
    }

    public void removerTodosJugadores() {
        plantilla.clear();
    }

    public int sizePlantilla() {
        return plantilla.size();
    }

    public void mostrarJugadores() {
        System.out.println("------- PLANTILLA -------");
        for (String jug: plantilla) {
            System.out.println("> " + jug);
        }
    }

    public boolean chequearExiste(String jug) {
        return plantilla.contains(jug);
    }

    public boolean contiene(HashSet<String> plantillaComparar) {
        return plantilla.containsAll(plantillaComparar);
    }

    public void agregarPlantilla(HashSet<String> plantillaComparar) {
        plantilla.addAll(plantillaComparar);
    }
}
