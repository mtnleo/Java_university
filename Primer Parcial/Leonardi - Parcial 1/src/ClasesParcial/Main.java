package ClasesParcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// WHILE SCANNERS ------------------------------------
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        ///////////////////////////////////////////////////////
        /// LLAMO AL HARDCODE

        Inmobiliaria inmobiliaria = new Inmobiliaria();
        HARDCODE.agregarDatos(inmobiliaria);


        while (cont.equals("y")) {
            /// PREGUNTA EJERCICIO ------------------------------------
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            System.out.println("| 1 | Mostrar Casas.\n| 2 | Mostrar Oficinas.\n| 3 | Mostrar Departamentos.\n| 4 | Eliminar Propiedad.\n| 5 | Mostrar Propiedad de Mayor Valor.\n| 6 | Aumentar y mostrar alquileres.\n| 7 | Mostrar personas.");
            num_ej = scan.nextInt();
            scan.nextLine();

            /// MAIN SWITCH ------------------------------------------

            switch (num_ej) {
                case 1:
                    System.out.println("Mostrar Casas.");

                    inmobiliaria.mostrarCasas();

                    break;

                case 2:
                    System.out.println("Mostrar Oficinas.");

                    inmobiliaria.mostrarOficinas();

                    break;

                case 3:
                    System.out.println("Mostrar Departamentos.");

                    inmobiliaria.mostrarDepartamentos();

                    break;

                case 4:
                    System.out.println("Eliminar Propiedad.");

                    System.out.println("Escriba la direccion de la propiedad que desea eliminar.");
                    String propiedadDireccion = scan.nextLine();

                    Propiedad propiedadEliminar = inmobiliaria.buscarPropiedad(propiedadDireccion);

                    if (propiedadEliminar != null) {
                        if (propiedadEliminar instanceof Casa) {
                            inmobiliaria.eliminarCasa((Casa) propiedadEliminar);
                        }
                        else if(propiedadEliminar instanceof Departamento) {
                            inmobiliaria.eliminarDepartamento((Departamento) propiedadEliminar);
                        }
                        else {
                            inmobiliaria.eliminarOficina((Oficina) propiedadEliminar);
                        }

                        System.out.println("Propiedad eliminada con exito!");
                    }
                    else {
                        System.out.println("No se encontro la propiedad buscada");
                    }


                    break;

                case 5:
                    System.out.println("Mostrar Propiedad Mayor Valor");

                    Propiedad propiedadMayorValor = inmobiliaria.getPropiedadMayorValor();

                    System.out.println(propiedadMayorValor.toString());

                    break;

                case 6:
                    System.out.println("Aumentar y mostrar alquileres nuevamente");

                    inmobiliaria.aumentarAlquileres(10);

                    inmobiliaria.mostrarCasas();
                    inmobiliaria.mostrarDepartamentos();


                    break;

                case 7:
                    System.out.println("Mostrar Personas");

                    inmobiliaria.mostrarPersonas();

                    break;

                default:
                    System.out.println("|X| ESCRIBA UN EJERCICIO VALIDO |X|");

                    break;

            }

            System.out.println("**** Deseas continuar viendo ejercicios? (y/n) ****\n");
            cont = scan.nextLine();

        }

        scan.close();
    }

}