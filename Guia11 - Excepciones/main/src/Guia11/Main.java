package Guia11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        while (cont.equals("y")) {
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            try {
                num_ej = scan.nextInt();
                scan.nextLine();

                switch (num_ej) {
                    case 1:
                        System.out.println("Ejercicio 1.");
                    /* QUE ESTA MAL EN ESTE CODIGO?
                    try
                    {
                        Persona p = baseDeDatos.buscar(datos);
                        System.out.println(“Los datos pertenecen a: ” + p);
                    }
                    catch(Exception e) {
                        // Maneja cualquiera de las excepciones comprobadas
                    }
                    catch(RuntimeException e) {
                        // Maneja cualquiera de las excepciones no comprobadas
                    }

                    - Está mal que toma cualquier tipo de excepciones comprobadas o no, y no especifica cual es.
                    A su vez, no limpia lo que hizo en el try en el codigo (no hay finally). No le provee un mensaje al usuario
                    acerca de cual fue el error, por lo que no lo puede resolver más adelante
                     */

                        break;

                    case 2:
                        System.out.println("Ejercicio 2.");

                    /*
                    Explique lo que sucede el siguiente código y por qué.

                    public static class EjemploExcepciones{
                        public static int devuelveNumero(int num) {
                            try {
                                if (num % 2 == 0) {
                                    throw new Exception("Lanzando excepcion");
                                }
                                return 1;
                            }
                            catch (Exception ex) {
                                ex.getMessage().concat("Rompi todoo y pase por Catch");
                                return 2;
                            }
                            finally {
                                return 3;
                            }
                        }
                    }

                    - Chequea si un numero es par. Si lo es tira una excepcion diciendo que rompió todoo
                    y luego retorna 2. Si no lo es retorna 1. El finally no se que pinta ahi
                     */

                        break;

                    case 3:
                        System.out.println("Ejercicio 3.");

                        JuegoAdivinar juego1 = new JuegoAdivinar();

                        juego1.mainLoop();

                        break;

                    case 4: // En este pude resolverlo sin tener que utilizar try/catch
                        System.out.println("Ejercicio 4.");

                        Colegio colegio = new Colegio();

                        colegio.agregarAlumnx("Colombia", "Pedro Ramirez");
                        colegio.agregarAlumnx("Colombia", "James Rodriguez");
                        colegio.agregarAlumnx("Colombia", "Juana Quintana");
                        colegio.agregarAlumnx("Argentina", "Diego Peretti");
                        colegio.agregarAlumnx("Argentina", "Lionel Messi");
                        colegio.agregarAlumnx("Argentina", "Eugenia Pareto");
                        colegio.agregarAlumnx("Islandia", "Lars Gunderson");
                        colegio.agregarAlumnx("Islandia", "Marcus Larson");


                        System.out.println(colegio.cuantos());
                        System.out.println("------------------");
                        colegio.mostrarNacionalidades();
                        System.out.println("------------------");
                        colegio.verNacionalidad("Argentina");
                        System.out.println("------------------");
                        System.out.println("Se intenta eliminar Pedro Ramirez: \n Eliminado? " + colegio.borrar("Pedro Ramirez"));
                        System.out.println("Se intenta eliminar Ilkay Gundogan: \n Eliminado? " + colegio.borrar("Ilkay Gundogan"));


                        break;


                    default:
                        System.out.println("|X| ESCRIBA UN EJERCICIO VALIDO |X|");

                        break;

                }

                System.out.println("--- Deseas continuar viendo ejercicios? (y/n)");
                cont = scan.nextLine();


            } catch (InputMismatchException ex) {
                System.out.println("Escriba un valor valido");
                scan.nextLine();
            }


        }

        scan.close();

    }
}