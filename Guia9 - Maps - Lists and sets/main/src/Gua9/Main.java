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