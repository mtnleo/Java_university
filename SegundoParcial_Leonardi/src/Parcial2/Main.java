package Parcial2;

import com.google.gson.Gson;

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

            // CARGAR HARDCODE
            Biblioteca biblioteca = new Biblioteca();
            biblioteca = HARDCODE.hardcodeMateriales(biblioteca);

            switch (num_ej) {
                case 1:
                    System.out.println("Comprobar que funcione el hardcode");

                    biblioteca.mostrarMaterial();

                    break;

                case 2:
                    System.out.println("Guardar en Json");

                    biblioteca.cargarJson();

                    break;

                case 3:
                    System.out.println("cargar biblioteca desde json, comprobar funcionamiento");

                    Biblioteca biblioJson = Biblioteca.leerJson("Bibliotequita.json");
                    biblioJson.mostrarMaterial();

                    break;

                case 4:
                    System.out.println("Comprobar eliminar");
                    // eliminar uno que si existe
                    Libro l3 = new Libro("Guille Gimenez: A memoir", "Martin Leo", 2095, 3, 340);
                    biblioteca.eliminarMaterial(l3);
                    biblioteca.mostrarMaterial();

                    // eliminar uno que no existe (deberia mostrar el mensaje de error)
                    Libro l2 = new Libro("No existe", "Martin Leo", 2095, 3, 340);
                    System.out.println("############################");
                    biblioteca.eliminarMaterial(l2);
                    System.out.println("############################");


                    break;

                case 5:
                    System.out.println("Alquilar");
                    biblioteca.mostrarMaterial();
                    System.out.println("############################");
                    System.out.println("############################");
                    System.out.println("############################");
                    System.out.println("#### UNA VEZ BORRADO ########");

                    // alquilar una revista que existe y comprobar que baje la disponibilidad
                    Revista r1 = new Revista("Nat Geo", "Jimmy Chin", 2012, 1, 2, true);
                    biblioteca.alquilar(r1);

                    biblioteca.mostrarMaterial();

                    System.out.println("############################");
                    System.out.println("############################");
                    System.out.println("######## NO DISPONIBILIDAD ######");
                    // alquilar una revista que existe pero no tiene disponibilidad
                    biblioteca.alquilar(r1);

                    // alquilar un libro que no existe
                    Libro l1 = new Libro("No existe", "Martin Leo", 2095, 3, 340);
                    System.out.println("############################");
                    biblioteca.alquilar(l1);
                    System.out.println("############################");

                    break;

                case 6:
                    System.out.println("Devolver");

                    // devolver una revista supuestamente prestado
                    Revista rPrestada = new Revista("Nat Geo", "Jimmy Chin", 2012, 1, 2, true);
                    biblioteca.devolver(rPrestada);

                    // devolver un tipo que no se puede devolver
                    Articulo a2 = new Articulo("ChatGPT-3 en los parciales de programacion", "Martin Leo", 2023, 4, "Una exploracion sobre la facultad UTN y porque los docentes no les dejan a lxs alumnxs usar el chatGPT para hardcodear y no perder tanto tiempo en el examen, aunque sea divertido");
                    System.out.println("-------------------------------");
                    biblioteca.devolver(a2);



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