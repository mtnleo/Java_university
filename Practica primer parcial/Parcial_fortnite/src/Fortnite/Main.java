package Fortnite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        while (cont.equals("y")) {
            System.out.println("| 1 | Ver plantel\n| 2 | Otras funciones\n| 3 | Ver total victorias\n| 4 | Ver entrenador\n| 5 | Ver Jugadores\n| 6 | Ver Soporte tecnico");
            num_ej = scan.nextInt();
            scan.nextLine();

            // CARGAR EL PLANTEL

            Plantel plantel = new Plantel();

            Jugador jugador1 = new Jugador("Juan", "Pérez", 25, "Buenos Aires", "tirador", "JPerez", 10);
            Jugador jugador2 = new Jugador("María", "García", 28, "Madrid", "recolector", "MGarcia", 8);
            Jugador jugador3 = new Jugador("Pedro", "Gómez", 30, "México DF", "soporte", "PGomez", 12);
            Jugador jugador4 = new Jugador("Luis", "García", 25, "Madrid", "Recolector", "LGarcia", 7);
            Jugador jugador5 = new Jugador("Ana", "Martínez", 31, "Barcelona", "Tirador", "AMartinez", 12);
            Jugador jugadorError = new Jugador("Prueba", "Error", 31, "Barcelona", "Tirador", "JPerez", 12);

            Entrenador entrenador1 = new Entrenador("Lionel", "Scaloni", 38, "Buenos Aires", 5);

            SoporteTecnico soporte1 = new SoporteTecnico("Malena", "Fernand", 24, "Mar del Plata", "Redes");
            SoporteTecnico soporte2 = new SoporteTecnico("Hernan", "Calutz", 21, "Mar del Plata", "Software");
            SoporteTecnico soporte3 = new SoporteTecnico("Felipe", "Montehermoso", 21, "Mar del Plata", "Hardware");

            plantel.agregarJugador(jugador1);
            plantel.agregarJugador(jugador2);
            plantel.agregarJugador(jugador3);
            plantel.agregarJugador(jugador4);
            plantel.agregarJugador(jugador5);
            plantel.agregarJugador(jugadorError);

            plantel.setEntrenador(entrenador1);

            plantel.agregarTecnico(soporte1);
            plantel.agregarTecnico(soporte2);
            plantel.agregarTecnico(soporte3);




            switch (num_ej) {
                case 1:
                    System.out.println("Ver el plantel");

                    plantel.mostrarEntrenador();
                    plantel.mostrarJugadores();
                    plantel.mostrarTecnico();

                    break;

                case 2:
                    System.out.println("Otras cosas para probar.\n");

                    jugador3.concentrar();
                    entrenador1.darIndicaciones();
                    soporte3.arreglarPerifericos();

                    break;

                case 3:
                    System.out.println("Victorias totales: " + plantel.contarVictoriasTotales());

                    break;

                case 4:
                    plantel.mostrarEntrenador();

                    break;

                case 5:
                    plantel.mostrarJugadores();

                    break;

                case 6:
                    plantel.mostrarTecnico();

                    break;


                default:
                    System.out.println("|X| ESCRIBA UN EJERCICIO VALIDO |X|");

                    break;

            }

            System.out.println("--- Deseas continuar viendo ejercicios? (y/n)");
            cont = scan.nextLine();

        }

        scan.close();
    }

}