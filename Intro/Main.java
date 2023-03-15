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
                    
                    int N = 10;
                    double A = 600;
                    Character C = 'C';

                    System.out.println("N = " + N + "\nA = " + A + "\nchara = " + C);
                    System.out.println("N + A = " + (N+A) + "\nA - N = " + (A-N) + "\nValor Numerico de C = " + (int) C);

                    break;
                case 2: //declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar por pantalla una serie de operaciones entre ellas.
                    System.out.println("Ejercicio 2.\n");

                    int X = 1;
                    int Y = 5;
                    double N2 = 10;
                    double M = 50;

                    int oper_a = (int)M + X + Y;
                    double oper_b = N2 * (double)Y;

                    System.out.println("M + X + Y = " + oper_a + "\nN * Y = " + oper_b);
                    
                    break;

                case 3: //declare una variable entera N, asignarle un valor. A continuación escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su valor a 3, duplicar su valor.
                    System.out.println("Ejercicio 3.\n"); 

                    int N3 = 10;
                    int operacion = (N3 + 77 - 3) * 2;

                    System.out.println("Valor de la operacion: " + operacion);

                    break;

                case 4: //declare cuatro variables enteras A, B, C y D y asignarle un valor a cada una. A continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
                    System.out.println("Ejercicio 4.\n"); 

                    int A4 = 10;
                    int B4 = 50;
                    int C4 = 80;
                    int D4 = 90;

                    System.out.println("Valores antes: A = " + A4 + " B = " + B4 + " C = " + C4 + " D = " + D4); 

                    int B_aux = B4; //agrego el aux para que no tome el valor que fue cambiado
                    B4 = C4;
                    C4 = A4;
                    A4 = D4;
                    D4 = B_aux;

                    System.out.println("Valores despues: A = " + A4 + " B = " + B4 + " C = " + C4 + " D = " + D4); 

                    break;
                
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
