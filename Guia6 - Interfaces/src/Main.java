import Guia6.ArrayReales;
import Guia6.Matematicas;

import java.util.ArrayList;
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

                    ArrayReales listita = new ArrayReales();
                    listita.CargarLista(5);
                    System.out.println(listita.MostrarLista());

                    System.out.println("Minimo: " + listita.minimo());
                    System.out.println("Maximo: " + listita.maximo());
                    System.out.println("Suma: " + listita.sumatorio());


                    break;

                case 2:
                    System.out.println("Ejercicio 2.");

                    Matematicas lista_mate = new Matematicas();
                    lista_mate.CargarLista(5);
                    System.out.println(lista_mate.MostrarLista());

                    System.out.println("Inicio: " + lista_mate.inicio());
                    System.out.println("Fin: " + lista_mate.fin());

                    break;

                case 3:
                    System.out.println("Ejercicio 3.");


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