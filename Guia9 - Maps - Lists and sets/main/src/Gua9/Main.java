package Gua9;

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
                    System.out.println("Ejercicio 1.");

                    Colegio colegio = new Colegio();

                    colegio.addAlumno("Dinamarca", "Lars Gundersen");
                    colegio.addAlumno("Dinamarca", "Mette Nielsen");
                    colegio.addAlumno("Dinamarca", "Soren Jensen");

                    colegio.addAlumno("Francia", "Julien Dubois");
                    colegio.addAlumno("Francia", "Sophie Laurent");
                    colegio.addAlumno("Francia", "Antoine Dupont");

                    colegio.addAlumno("Japon", "Yuki Nakamura");
                    colegio.addAlumno("Japon", "Aya Tanaka");

                    colegio.addAlumno("Mexico", "Juan García");
                    colegio.addAlumno("Mexico", "Sofía Hernández");
                    colegio.addAlumno("Mexico", "Luis González");

                    colegio.addAlumno("Suecia", "Anna Johansson");
                    colegio.addAlumno("Suecia", "Erik Karlsson");

                    System.out.println("Hay " + colegio.cuantos() + " alumnxs.");

                    colegio.showNacionalidad("Dinamarca");

                    colegio.borra("Japon");

                    colegio.showAll();
                    colegio.showNacionalidad("Japon");

                    break;

                case 2:
                    System.out.println("Ejercicio 2.");

                    Calendario diasSemana = new Calendario();


                    diasSemana.addDia("Lunes");
                    diasSemana.addDia("Martes");
                    diasSemana.addDia("Miercoles");
                    diasSemana.addDia("Jueves");
                    diasSemana.addDia("Viernes");
                    diasSemana.addDia("Sabado");
                    diasSemana.addDia("Domingo");

                    diasSemana.addDiaPos(4, "Juernes");

                    Calendario nuevaSemana = diasSemana;

                    nuevaSemana.mostrarDias();

                    System.out.println("\nPos 3: " + diasSemana.buscarDiaPos(3) + " - Pos 4: " + diasSemana.buscarDiaPos(4));
                    System.out.println("Primer dato: " + diasSemana.buscarDiaPos(0) + " - Ultima pos: " + diasSemana.buscarDiaPos(diasSemana.getTamanioListaDias() - 1));

                    System.out.println("Eliminar 'Juernes': " + diasSemana.eliminarDia("Juernes") + " - Eliminar 'sabamingo': " + diasSemana.eliminarDia("Sabamingo"));
                    System.out.println("Contiene lunes: " + diasSemana.buscarDia("Lunes"));

                    System.out.println("Dias ordenados: ");
                    diasSemana.ordenarDias();

                    diasSemana.mostrarDias();

                    System.out.println("\nBorrar lista.");
                    diasSemana.borrarLista();
                    diasSemana.mostrarDias();

                    break;

                case 3:
                    System.out.println("Ejercicio 3.");

                    Jugadores plantilla = new Jugadores();
                    Jugadores plantilla1 = new Jugadores();
                    Jugadores plantilla2 = new Jugadores();

                    plantilla.aniadirJugador("Maximiliano Romero");
                    plantilla.aniadirJugador("Ricardo Álvarez");
                    plantilla.aniadirJugador("Federico Mancuello");
                    plantilla.aniadirJugador("Pablo Galdames");
                    plantilla.aniadirJugador("Lucas Robertone");
                    plantilla.aniadirJugador("Francisco Ortega");
                    plantilla.aniadirJugador("Miguel Brizuela");
                    plantilla.aniadirJugador("Lautaro Gianetti");
                    plantilla.aniadirJugador("Luis Abram");
                    plantilla.aniadirJugador("Hernán De La Fuente");
                    plantilla.aniadirJugador("Matías Borgogno");
                    plantilla.aniadirJugador("Matías Borgogno");
                    plantilla.aniadirJugador("Matías Borgogno");
                    plantilla1.aniadirJugador("Sergio Busquets");
                    plantilla1.aniadirJugador("Lionel Messi");
                    plantilla2.aniadirJugador("Lautaro Gianetti");
                    plantilla2.aniadirJugador("Maximiliano Romero");

                    plantilla.mostrarJugadores();

                    System.out.println("Esta Neymar Jr. en la plantilla? " + plantilla.chequearExiste("Neymar Jr."));
                    System.out.println("Esta Luis Abram en la plantilla? " + plantilla.chequearExiste("Luis Abram"));
                    System.out.println("Se encuentra la plantilla 2 en la plantilla 0? " + plantilla.contiene(plantilla2.getPlantilla()));
                    System.out.println("Se encuentra la plantilla 1 en la plantilla 0? " + plantilla.contiene(plantilla1.getPlantilla()));
                    System.out.println("Plantilla tras unir plantilla 1 y plantilla 2" );
                    plantilla1.agregarPlantilla(plantilla2.getPlantilla());
                    plantilla1.mostrarJugadores();
                    plantilla2.removerTodosJugadores();
                    System.out.println("Tamanio de plantilla 2 tras borrar todos los jugadores: " + plantilla2.sizePlantilla());

                    break;

                default:
                    System.out.println("|X| ESCRIBA UN EJERCICIO VALIDO |X|");

                    break;

            }

            System.out.println("\n--- Deseas continuar viendo ejercicios? (y/n)");
            cont = scan.nextLine();

        }

        scan.close();
    }

}