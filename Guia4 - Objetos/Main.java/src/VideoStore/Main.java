package VideoStore;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cont = "y";

        //HARDCODE --------------------------

        Videoclub videoclub = new Videoclub();

        Pelicula pelicula1 = new Pelicula("La La Land", "Musical",
                LocalDate.of(2016, 12, 9), 128, "PG-13", "EE. UU.",
                "Una aspirante a actriz y un músico de jazz se enamoran y luchan por perseguir sus sueños en Los Ángeles.",
                10);
        Pelicula pelicula2 = new Pelicula("El Gran Hotel Budapest", "Comedia",
                LocalDate.of(2014, 3, 7), 100, "R", "EE. UU.",
                "Las aventuras de Gustave H, un legendario conserje en un famoso hotel europeo, y Zero Moustafa, el joven botones que se convierte en su amigo más confiable.",
                5);
        Pelicula pelicula3 = new Pelicula("El Código Da Vinci", "Misterio",
                LocalDate.of(2006, 5, 17), 149, "PG-13", "EE. UU.",
                "Un simbolista de Harvard sigue una pista enigmática a través de París mientras descubre una conspiración peligrosa que ha sido protegida durante siglos.",
                20);
        Pelicula pelicula4 = new Pelicula("Forrest Gump", "Drama",
                LocalDate.of(1994, 7, 6), 142, "PG-13", "EE. UU.",
                "Un hombre con un coeficiente intelectual bajo vive una vida extraordinaria y se convierte en parte de muchos eventos importantes de los Estados Unidos durante varias décadas.",
                15);
        Pelicula pelicula5 = new Pelicula("El Rey León", "Animación",
                LocalDate.of(1994, 6, 15), 88, "G", "EE. UU.",
                "Un joven león príncipe huye de su reino solo para aprender la verdadera importancia de la responsabilidad y la valentía.",
                25);
        Pelicula pelicula6 = new Pelicula("Titanic", "Romance",
                LocalDate.of(1997, 12, 19), 194, "PG-13", "EE. UU.",
                "Una joven aristócrata se enamora de un artista pobre a bordo del lujoso y desafortunado Titanic.",
                30);
        Pelicula pelicula7 = new Pelicula("El Diario de una Princesa", "Comedia",
                LocalDate.of(2001, 8, 3), 115, "G", "EE. UU.",
                "Una adolescente común descubre que es una princesa y debe aprender a navegar en la realeza mientras intenta mantener su verdadera identidad en secreto.", 12);
        Pelicula pelicula8 = new Pelicula("Inception", "Ciencia Ficción",
                LocalDate.of(2010, 7, 16), 148, "PG-13", "EE. UU.",
                "Un ladrón experto se adentra en los sueños de otras personas para robar sus secretos más valiosos.", 20);
        Pelicula pelicula9 = new Pelicula("Interstellar", "Ciencia Ficción",
                LocalDate.of(2014, 11, 7), 169, "PG-13", "EE. UU.",
                "Un grupo de exploradores viaja a través de un agujero de gusano en busca de un nuevo hogar para la humanidad.", 15);
        Pelicula pelicula10 = new Pelicula("Jurassic Park", "Aventuras",
                LocalDate.of(1993, 6, 9), 127, "PG-13", "EE. UU.",
                "Un multimillonario crea un parque temático de dinosaurios en una isla, pero las cosas no salen según lo planeado.", 25);
        Pelicula pelicula11 = new Pelicula("La Terminal", "Comedia",
                LocalDate.of(2004, 6, 18), 128, "PG-13", "EE. UU.",
                "Un hombre queda atrapado en la terminal de un aeropuerto debido a un problema con su visa.", 10);
        Pelicula pelicula12 = new Pelicula("El Caballero de la Noche", "Acción",
                LocalDate.of(2008, 7, 18), 152, "PG-13", "EE. UU.",
                "Batman se enfrenta al Joker, un psicópata despiadado que siembra el caos en Gotham City.", 30);
        Pelicula pelicula13 = new Pelicula("Piratas del Caribe: La Maldición del Perla Negra", "Aventuras",
                LocalDate.of(2003, 7, 9), 143, "PG-13", "EE. UU.",
                "El Capitán Jack Sparrow se une a la hija de un gobernador y un herrero para recuperar el barco maldito de Sparrow de manos de un grupo de piratas malvados.", 20);
        Pelicula pelicula14 = new Pelicula("El Club de la Pelea", "Drama",
                LocalDate.of(1999, 9, 10), 139, "R", "EE. UU.",
                "Un hombre insomne y un vendedor de jabón carismático crean un club de lucha clandestino que se convierte en algo más peligroso.", 15);
        Pelicula pelicula15 = new Pelicula("El Resplandor", "Terror",
                LocalDate.of(1980, 5, 23), 144, "R", "EE. UU.",
                "Un hombre acepta un trabajo de cuidador de un hotel aislado, pero la soledad y el aislamiento comienzan a afectarlo de manera peligrosa.", 10);

        videoclub.AgregarPelicula(pelicula1);
        videoclub.AgregarPelicula(pelicula2);
        videoclub.AgregarPelicula(pelicula3);
        videoclub.AgregarPelicula(pelicula4);
        videoclub.AgregarPelicula(pelicula5);
        videoclub.AgregarPelicula(pelicula6);
        videoclub.AgregarPelicula(pelicula7);
        videoclub.AgregarPelicula(pelicula8);
        videoclub.AgregarPelicula(pelicula9);
        videoclub.AgregarPelicula(pelicula10);
        videoclub.AgregarPelicula(pelicula11);
        videoclub.AgregarPelicula(pelicula12);
        videoclub.AgregarPelicula(pelicula13);
        videoclub.AgregarPelicula(pelicula14);
        videoclub.AgregarPelicula(pelicula15);

        Cliente cliente1 = new Cliente("Juan Pérez", "555-1234", "Av. Siempreviva 123");
        Cliente cliente2 = new Cliente("María Gómez", "555-5678", "Calle Falsa 123");
        Cliente cliente3 = new Cliente("Pedro Rodríguez", "555-2468", "Av. del Sol 456");
        Cliente cliente4 = new Cliente("Ana López", "555-7890", "Calle del Arco 789");
        Cliente cliente5 = new Cliente("Carlos Ruiz", "555-3690", "Av. de la Montaña 789");

        videoclub.AgregarCliente(cliente1);
        videoclub.AgregarCliente(cliente2);
        videoclub.AgregarCliente(cliente3);
        videoclub.AgregarCliente(cliente4);
        videoclub.AgregarCliente(cliente5);

        while (cont.equals("y")) {

            System.out.println("--------- Escoja una opcion --------- ");
            System.out.println("| 1 | VER PELICULAS\n| 2 | BUSCAR PELICULA\n| 3 | ALQUILAR PELICULA\n| 4 | DEVOLVER PELICULA\n| 5 | VER CLIENTES\n| 6 | VER ALQUILERES VIGENTES\n| 7 | VER ALQUILERES CLIENTE\n| 8 | VER DEVOLUCIONES HOY");

            int switch_opc = scan.nextInt();
            scan.nextLine();

            switch (switch_opc) {
                case 1:
                    System.out.println("VER PELICULAS");

                    videoclub.mostrarTodasPeliculas();

                    break;

                case 2:
                    System.out.println("BUSCAR PELICULA");

                    System.out.print("Escriba el nombre de la pelicula: ");
                    String nombre_peli_buscar = scan.nextLine();
                    Pelicula peli_buscada = videoclub.BuscarPelicula(nombre_peli_buscar);

                    if (peli_buscada != null) {
                        videoclub.mostrarPelicula(peli_buscada);
                    }
                    else {
                        System.out.println("No se encontro la pelicula buscada");
                    }

                    break;

                case 3:
                    System.out.println("ALQUILAR PELICULA");

                    String nombre_pelicula_alquilar;

                    System.out.print("Escriba el nombre de la pelicula a alquilar: ");
                    nombre_pelicula_alquilar = scan.nextLine();

                    System.out.print("El cliente ya se encuentra registrado? (y/n): ");
                    String registrado_alq = scan.nextLine();

                    if (registrado_alq.equals("y")) {
                        System.out.print("Escriba su telefono: ");
                        String tel_cliente_alq = scan.nextLine();

                        videoclub.Alquilar(nombre_pelicula_alquilar, tel_cliente_alq);
                    }
                    else {
                        Cliente nuevo_cliente = videoclub.CrearCliente();
                        videoclub.AgregarCliente(nuevo_cliente);

                        videoclub.Alquilar(nombre_pelicula_alquilar, nuevo_cliente.telefono);
                    }

                    break;

                case 4:
                    System.out.println("DEVOLVER PELICULA");

                    String nombre_pelicula_devolver;

                    System.out.print("Escriba el nombre de la pelicula a devolver: ");
                    nombre_pelicula_devolver = scan.nextLine();

                    System.out.print("Escriba el telefono del cliente: ");
                    String tel_cliente_dev = scan.nextLine();

                    videoclub.Devolver(tel_cliente_dev, nombre_pelicula_devolver);

                    break;

                case 5:
                    System.out.println("VER CLIENTES");

                    videoclub.mostrarTodosClientes();

                    break;

                case 6:
                    System.out.println("VER ALQUILERES VIGENTES");

                    videoclub.mostrarAlquileresVigentes();

                    break;

                case 7:
                    System.out.println("VER ALQUILERES CLIENTE");
                    break;

                case 8:
                    System.out.println("VER DEVOLUCIONES HOY");
                    break;


                default:
                    System.out.println("Opción no válida");
                    break;
            }

            System.out.println("Quieres seguir viendo opciones? (y/n) ");
            cont = scan.next();

        }
        scan.close();
    }

}
