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
                    System.out.println("Ejercicio 1.");

                    // lista strings
                    ListaGenerica<String> miListaGenerica = new ListaGenerica<>();

                    miListaGenerica.agregarElemento("Argentina");
                    miListaGenerica.agregarElemento("Austria");
                    miListaGenerica.agregarElemento("Estados Unidos");
                    miListaGenerica.agregarElemento("Argelia");
                    miListaGenerica.agregarElemento("Madagascar");

                    System.out.println("La lista comprende " + miListaGenerica.getSize() + " elementos.");
                    System.out.println("Elemento en la posicion 0: " + miListaGenerica.buscarElementoPosicion(0));
                    System.out.println("------- MOSTRAR LISTA ----------");
                    miListaGenerica.mostrarLista();



                    break;

                case 2:
                    System.out.println("Ejercicio 2.");

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

                case 3:
                    System.out.println("Ejercicio 3.");

                    PilaGenerica<Integer> miPilaGenericaPrimos = new PilaGenerica<Integer>();

                    miPilaGenericaPrimos.agregarElemento(5);
                    miPilaGenericaPrimos.agregarElemento(7);
                    miPilaGenericaPrimos.agregarElemento(11);
                    miPilaGenericaPrimos.agregarElemento(13);
                    miPilaGenericaPrimos.agregarElemento(17);

                    miPilaGenericaPrimos.mostrarPila();

                    break;

                case 4:
                    System.out.println("Ejercicio 4.");

                    ListaGenerica<Integer> listaIntegers = new ListaGenerica<>();

                    listaIntegers.agregarElemento(3);
                    listaIntegers.agregarElemento(2);
                    listaIntegers.agregarElemento(5);
                    listaIntegers.agregarElemento(8);
                    listaIntegers.agregarElemento(7);
                    listaIntegers.agregarElemento(8);
                    listaIntegers.agregarElemento(0);


                    ListaGenerica.imprimirLista(listaIntegers.getLista());

                    break;

                case 5:
                    System.out.println("Ejercicio 5.");

                    //ESTO ESTÁ MAL -> ClaseHijaGenerica<ClaseHijaGenerica<ClaseHijaGenerica<ClaseHijaGenerica>>> hijita = new ClaseHijaGenerica<ClaseHijaGenerica<>>();

                    break;

                case 6:
                    System.out.println("Ejercicio 6.");

                    String comp1 = "Pasto";
                    String comp2 = "Pasto";
                    String comp3 = "NotPasto";

                    System.out.println(comp1 + " + " + comp2 + " son iguales? -> " + ListaGenerica.comparar(comp1, comp2));
                    System.out.println(comp1 + " + " + comp3 + " son iguales? -> " + ListaGenerica.comparar(comp1, comp3));

                    break;

                case 7:
                    System.out.println("Ejercicio 7.");

                    Par<String, Integer> parKV1 = new Par<>("Perito Moreno has.", 724000);
                    Par<String, Integer> parKV2 = new Par<>("Perito Moreno has.", 12841);

                    System.out.println(parKV1.key + " -> " + parKV1.value);
                    System.out.println(parKV2.key + " -> " + parKV2.value);

                    break;

                case 8:
                    System.out.println("Ejercicio 8.");



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