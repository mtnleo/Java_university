package Fortnite;

import java.util.ArrayList;

public class Plantel {
    /// ATRIBUTOS --------------------

    private Entrenador entrenador;
    private final ArrayList<Jugador> jugadores;
    private final ArrayList<SoporteTecnico> tecnicos;

    /// CONSTRUCTORS --------------------

    public Plantel() {
        this.entrenador = new Entrenador();
        this.jugadores = new ArrayList<Jugador>();
        this.tecnicos = new ArrayList<SoporteTecnico>();
    }

    /// GETTERS AND SETTERS -----------------

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }


    /// ARRAYLIST FUNCS -----------------

    public void agregarJugador(Jugador jugador) {
        if (!buscarNickname(jugador.nickname)) {
            jugadores.add(jugador);
        }
        else {
            System.out.println("Nickname ya se encuentra en la lista");
        }
    }

    public int getTamanioJugadores() {
        return jugadores.size();
    }

    public void agregarTecnico(SoporteTecnico tecnico) {
        tecnicos.add(tecnico);
    }

    public int getTamanioTecnicos() {
        return tecnicos.size();
    }

    /// METODOS -------------------------

    public int contarVictoriasTotales() {
        int victorias = 0;
        for (Jugador jug: jugadores) {
            victorias += jug.victorias;
        }
        return victorias;
    }

    public boolean buscarNickname(String nick) {
        boolean encontrado = false;

        for (Jugador jug: jugadores) {
            if (jug.nickname.equals(nick)) {
                encontrado = true;
                break;
            }
        }

        return encontrado;
    }

    public void mostrarJugadores() {
        System.out.println("---------- Jugadores ---------- \n");
        for (Jugador jug: jugadores) {
            System.out.println("---> " + jug.toString());
        }
    }

    public void mostrarTecnico() {
        System.out.println("---------- Soporte Tecnico ---------- \n");
        for (SoporteTecnico tec: tecnicos) {
            System.out.println("---> " + tec.toString());
        }
    }

    public void mostrarEntrenador() {
        System.out.println("Entrenador: \n" + entrenador.toString());
    }
}
