package PedidosComida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// CONDICIONES DEL SWITCH/WHILE ---------------------------

        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        /// CARGAR SISTEMA ---------------------------

        Sistema sistema = new Sistema();

        Hardcode.CargarLocales(sistema);
        Hardcode.CargarUsuarios(sistema);

        /// MAIN WHILE ------------------------

        while (cont.equals("y")) {
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            num_ej = scan.nextInt();
            scan.nextLine();

            switch (num_ej) {
                case 1:
                    System.out.println("Mostrar Locales.");

                    sistema.mostrarLocales();

                    break;

                case 2:
                    System.out.println("Mostrar Platos de un local.");

                    System.out.println("Escriba el local que quiere buscar: ");
                    String localBuscado = scan.nextLine();

                    Local localEncontrado = sistema.buscarLocal(localBuscado);

                    if (localEncontrado != null) {
                        localEncontrado.mostrarPlatos();
                    }
                    else {
                        System.out.println("No se encontro el local :/");
                    }

                    break;

                case 3:
                    System.out.println("Mostrar Usuarios.");

                    sistema.mostrarUsuarios();

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