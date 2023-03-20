package Graphics;
import java.util.Scanner;

public class Main {

    public class Rectangulo {

    }
    public static void main(String[] args) {
        Character continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while(continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch(ejercicio) {
                case 1:
                    System.out.println("Ejercicio 1.");

                    Graphics.Rectangulo recti = new Graphics.Rectangulo();

                    System.out.println("Antes de cambiar, el alto del rect es " + recti.getAlto() + " y el ancho del rectangulo es " + recti.getAncho());

                    System.out.println("Establezca el alto: ");
                    recti.setAlto(scan.nextFloat());

                    System.out.println("Establezca el ancho: ");
                    recti.setAncho(scan.nextFloat());

                    System.out.println("El alto del rectangulo es " + recti.getAlto());
                    System.out.println("El ancho del rectangulo es " + recti.getAncho());

                    System.out.println("El area del rectangulo es " + recti.area());
                    System.out.println("El perimetro del rectangulo es " + recti.perimetro());

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
