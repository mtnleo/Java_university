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

                case 2:
                    System.out.println("Ejercicio 2.");

                    Cliente cliente1 = new Cliente("Martin Leonardi", "mtnleonardi@gmail.com", 15);
                    cliente1.MostrarCliente();

                    ItemVenta item1 = new ItemVenta("Logitech G203", "Mouse", 200);
                    ItemVenta item2 = new ItemVenta("Redragon Kumara", "Teclado Mecanico", 400);
                    ItemVenta item3 = new ItemVenta("Lenovo Ideapad Gaming 3", "Laptop", 3200);

                    ItemVenta[] itemsComprados = {item1, item2, item3};


                    Factura factura1 = new Factura( cliente1, itemsComprados);
                    factura1.mostrarFactura();

                    System.out.println("\nFactura luego de aplicar descuento: ");
                    factura1.montoDescontado();
                    factura1.mostrarFactura();

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