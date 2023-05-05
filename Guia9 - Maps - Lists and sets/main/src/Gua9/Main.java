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