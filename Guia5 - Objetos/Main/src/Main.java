import Guia5.Password;
import Guia5.Persona;

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

                    Password pass1 = new Password();
                    Password pass2 = new Password(23);
                    System.out.println(pass1.getPassword() + pass1.esFuerte());
                    System.out.println(pass2.getPassword() + pass2.esFuerte());


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