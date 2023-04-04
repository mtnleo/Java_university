package VideoStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int switch_opc = scan.nextInt();
        String cont = "y";

        while (cont.equals("y")) {

            switch (switch_opc) {
                case 1:
                    System.out.println("Opción 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada");
                    break;


                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println("Quieres seguir viendo opciones? (y/n) ");
            cont = scan.next();

        }
        scan.close();
    }

    }
}