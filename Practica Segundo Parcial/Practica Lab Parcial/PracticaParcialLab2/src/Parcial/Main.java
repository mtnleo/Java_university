package Parcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        while (cont.equals("y")) {
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            num_ej = scan.nextInt();
            scan.nextLine();

            switch (num_ej) {
                case 1:
                    System.out.println("HARDCODE DE DATOS Y MUESTRA");

                    Federacion afa = HARDCODE.cargarFederacion();

                    afa.mostrarFederacion();

                    break;

                case 2:
                    System.out.println("FORZAR ERRORES");

                    Federacion afa23Jug = HARDCODE.cargarFederacion();
                    Federacion afa22Jug = HARDCODE.cargarFederacionMenosUno();

                    Futbolista fut1 = new Futbolista("Lucas", "Alario", 28, 26, Posicion.DELANTERO);
                    Futbolista fut2 = new Futbolista("German", "Lux", 41, 12, Posicion.ARQUERO);
                    Entrenador ent1 = new Entrenador("Marcelo", "Gallardo", 47, "Pase y pase, napoleonico", "Futbol Total");

                    System.out.println("Jugador que ya esta: (NO DEBERIA DAR ERROR");
                    afa23Jug.agregarIntegrantePlantel(fut1); // no deberia dar error porque ya esta
                    System.out.println("Jugador que no esta: (DEBERIA DAR ERROR MAS DE 23 JUGADORES");
                    afa23Jug.agregarIntegrantePlantel(fut2); // deberia dar error de que ya existe
                    System.out.println("Otro entrenador: (DEBERIA DAR ERROR MAS DE UN ENTRENADOR");
                    afa22Jug.agregarIntegrantePlantel(ent1); // deberia tirar error de mas de un entrenador

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