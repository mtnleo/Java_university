package Clases10;

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
                    System.out.println("Ejercicio 1 y 2.");

                    // lista strings
                    ListaGenerica<String> miListaGenerica = new ListaGenerica<>();

                    miListaGenerica.agregarElemento("Argentina");
                    miListaGenerica.agregarElemento("Austria");
                    miListaGenerica.agregarElemento("Estados Unidos");
                    miListaGenerica.agregarElemento("Argelia");
                    miListaGenerica.agregarElemento("Madagascar");

                    //System.out.println("La lista comprende " + miListaGenerica.getSize() + " elementos.");
                    //System.out.println("Elemento en la posicion 0: " + miListaGenerica.buscarElementoPosicion(0));
                    //System.out.println("------- MOSTRAR LISTA ----------");
                    //miListaGenerica.mostrarLista();

                    // lista characters
                    ListaGenerica<Character> miListaGenericaChars = new ListaGenerica<>();

                    miListaGenericaChars.agregarElemento('A');
                    miListaGenericaChars.agregarElemento('G');
                    miListaGenericaChars.agregarElemento('F');
                    miListaGenericaChars.agregarElemento('E');
                    miListaGenericaChars.agregarElemento('O');

                    System.out.println("La lista comprende " + miListaGenericaChars.getSize() + " elementos.");
                    System.out.println("Elemento en la posicion 0: " + miListaGenericaChars.buscarElementoPosicion(0));
                    System.out.println("------- MOSTRAR LISTA ----------");
                    miListaGenericaChars.mostrarLista();
                    System.out.println("Lista luego de cambiarle O y A: ");
                    miListaGenericaChars.intercambiarElementos('O', 'A');
                    miListaGenericaChars.mostrarLista();
                    System.out.println("Lista intentando cambiarle F y Z (no existe): ");
                    miListaGenericaChars.intercambiarElementos('F', 'Z');




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