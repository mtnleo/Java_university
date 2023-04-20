import Guia5.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        Random rand = new Random();

        while (cont.equals("y")) {
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            num_ej = scan.nextInt();
            scan.nextLine();

            switch (num_ej) {
                case 1:
                    System.out.println("Ejercicio 1.");
                    System.out.println("Escriba el nombre: ");
                    String nombre1 = scan.nextLine();
                    System.out.println("Escriba la edad: ");
                    int edad1 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Escriba el sexo (m/h): ");
                    char sexo1 = scan.nextLine().charAt(0);
                    System.out.println("Escriba el peso (en kg): ");
                    double peso1 = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Escriba la altura (en mts con coma ','): ");
                    double altura1 = scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Escriba el DNI: ");
                    String dni1 = scan.nextLine();

                    Persona persona1 = new Persona(nombre1, edad1, dni1, sexo1, peso1, altura1);
                    Persona persona2 = new Persona("Manela", 24, 'm');
                    Persona persona3 = new Persona();

                    System.out.println("La persona " + persona1.getNombre() + " " + persona1.informeIMC());
                    System.out.println("La persona " + persona2.getNombre() + " " + persona2.informeIMC());
                    System.out.println("La persona " + persona3.getNombre() + " " + persona3.informeIMC());

                    //mostrar si es mayor de edad
                    if (persona1.esMayorDeEdad()) {
                        System.out.println("La persona " + persona1.getNombre() + " es mayor de edad.");
                    }
                    if (persona2.esMayorDeEdad()) {
                        System.out.println("La persona " + persona2.getNombre() + " es mayor de edad.");
                    }
                    if (persona3.esMayorDeEdad()) {
                        System.out.println("La persona " + persona3.getNombre() + " es mayor de edad.");
                    }

                    //mostrar toString
                    System.out.println(persona1.toString());
                    System.out.println(persona2.toString());
                    System.out.println(persona3.toString());


                    break;

                case 2:
                    System.out.println("Ejercicio 2.");

                    int validos = 0;
                    Password[] passws = new Password[10];
                    boolean[] fuertes = new boolean[10];

                    Password pass1 = new Password();
                    Password pass2 = new Password(23);
                    System.out.println(pass1.getPassword() + pass1.esFuerte());
                    System.out.println(pass2.getPassword() + pass2.esFuerte());

                    for (int i = 0; i < 10; i++) {
                        Password pass = new Password(rand.nextInt(15) + 5);
                        passws[i] = pass;
                        fuertes[i] = pass.esFuerte();
                        validos++;
                    }

                    for (int i = 0; i < validos; i++) {
                        System.out.println(passws[i].getPassword() + "\n" + "Fuerte: " + fuertes[i]);
                    }

                    break;

                case 3:
                    System.out.println("Ejercicio 3.");

                    Electrodomestico[] electrodomesticos = new Electrodomestico[10];
                    electrodomesticos[0] = new Electrodomestico();
                    electrodomesticos[1] = new Electrodomestico(70, 10);
                    electrodomesticos[2] = new Electrodomestico(100, "Negro", 'B', 45);
                    electrodomesticos[3] = new Television(15, 15);
                    electrodomesticos[4] = new Lavadora(75, "AzuL", 'A', 40 , 35);
                    electrodomesticos[5] = new Television();
                    electrodomesticos[6] = new Lavadora();
                    electrodomesticos[7] = new Television(25, "Fucsia", 'C', 27, 48, true);
                    electrodomesticos[8] = new Lavadora(125, "gris", 'A', 60 , 65);
                    electrodomesticos[9] = new Lavadora(55,  35);

                    int contador_elec = 0;
                    int contador_lav = 0;
                    int contador_tele = 0;

                    for (Electrodomestico elec: electrodomesticos) {
                        int precio = elec.getPrecio_base();
                        System.out.println("Precio = " + "$" + precio + " - Clase: " + elec.getClass().getSimpleName());

                        if (elec instanceof Lavadora) {
                            contador_elec += precio;
                            contador_lav += precio;
                        }
                        else if (elec instanceof Television) {
                            contador_elec += precio;
                            contador_tele += precio;
                        }
                        else {
                            contador_elec += precio;
                        }
                    }

                    System.out.println("Precio Electrodomesticos = $" + contador_elec);
                    System.out.println("Precio Lavadoras = $" + contador_lav);
                    System.out.println("Precio Televisiones = $" + contador_tele);





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