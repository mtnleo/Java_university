import Guia6.*;

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

                    Numero num1 = new Numero(2);
                    Numero num2 = new Numero(5);
                    Numero num3 = new Numero(123);
                    Numero num4 = new Numero(92);
                    Numero num5 = new Numero(92);

                    System.out.println("Numero " + num2.getNumero() + " es mayor a " + num1.getNumero() + ": " + num2.esMayor(num1));
                    System.out.println("Numero " + num3.getNumero() + " es menor a " + num4.getNumero() + ": " + num3.esMenor(num4));
                    System.out.println("Numero " + num4.getNumero() + " es igual a " + num5.getNumero() + ": " + num4.esIgual(num5));

                    break;

                case 4:
                    System.out.println("Ejercicio 4.");

                    Libro libro1 = new Libro("SKD2392", "El senior de los anillos", 1954);
                    Libro libro2 = new Libro("HGK3212", "Harry Potter y el Prisionero de Azkaban", 1999);
                    Revista revista1 = new Revista("GV5565", "Nat Geo", 2023, 5);
                    Revista revista2 = new Revista("FGGD7655", "Time", 2006, 1);

                    libro1.prestar();
                    libro2.prestar();
                    libro2.devolver();

                    System.out.println(libro1.toString());
                    System.out.println(libro2.toString());
                    System.out.println(revista1.toString());
                    System.out.println(revista2.toString());


                    break;
                    
                case 5:
                    System.out.println("Ejercicio 5.");
                    
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