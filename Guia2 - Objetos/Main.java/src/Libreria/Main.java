package Libreria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character continuar = 'y';
        Scanner scan = new Scanner(System.in);

        while(continuar == 'y') {

            System.out.println("Escriba el ejercicio que quieras realizar:");

            int ejercicio = scan.nextInt();

            switch(ejercicio) {
                case 1:
                    System.out.println("Ejercicio 1.");

                    Autor autor1 = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
                    Autor autor2 = new Autor("Javier", "Santaolalla", "javisanta@email.com", 'M');

                    autor1.mostrarAutor();

                    Libro libro1 = new Libro("Effective Java", 450, 150, autor1);

                    libro1.mostrarLibro();

                    libro1.setPrecio(500);
                    libro1.setStock(libro1.getStock() + 50);

                    libro1.mostrarAutorLibro(0);
                    libro1.mostrarLibro();

                    libro1.agregarAutor(autor2);

                    libro1.presentarLibro();

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