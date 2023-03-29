package Guia3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while (continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch (ejercicio) {
                case 1:
                    System.out.println("Ejercicio 1.");

                    Cilindro cil1 = new Cilindro();
                    cil1.MostrarDatosCilindro();

                    Cilindro cil2 = new Cilindro(9, "Negro", 12);
                    cil2.MostrarDatosCilindro();

                    System.out.println("Area Cilindro: " + cil2.CalcularArea());

                    break;

                default:
                    System.out.println("|X| Escriba un numero de ejercicio valido |X|.\n");
                    break;
            }

            System.out.println("Desea seguir viendo ejercicios? ('y'/'n')");
            String respuesta = scan.next();
            continuar = respuesta.charAt(0);
        }

        scan.close();
    }
}
