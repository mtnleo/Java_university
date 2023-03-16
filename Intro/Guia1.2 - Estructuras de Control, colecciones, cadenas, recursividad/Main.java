import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Character continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while(continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch(ejercicio) {
                case 1: //declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.
                    System.out.println("Ejercicio 1.\n");


                    break;
                /// DEFAULT
                default:
                    System.out.println("|X| EJERCICIO INVALIDO |X|\n");

                    break;

            }

            System.out.println("Desea seguir viendo ejercicios? ('y'/'n')");
            String respuesta = scan.next();
            continuar = respuesta.charAt(0);

        }

        scan.close();

    }
}


