package MusicPlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;

        ListaBasica listaBasica = new ListaBasica("Basic");
        ListaPremium listaPremium = new ListaPremium("Premium");

        HARDCODE.cargarCanciones(listaPremium, listaBasica);

        while (cont.equals("y")) {
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            num_ej = scan.nextInt();
            scan.nextLine();

            switch (num_ej) {
                case 1:
                    System.out.println("Mostrar lista basica.");

                    listaBasica.verMiLista();

                    break;

                case 2:
                    System.out.println("Aniadir cancion basica");

                    Artista artista1 = new Artista("Taylor Swift", "Estados Unidos", "32");
                    Album album4 = new Album(2019, "Lover", artista1);

                    Cancion cancion4 = new Cancion("Cornelia Street", 289, "Pop", album4, artista1);

                    listaBasica.aniadirCancion(cancion4);

                    break;

                case 3:
                    System.out.println("Remover lista basica.");

                    listaBasica.eliminarCancion("Betty");

                    break;

                case 4:
                    System.out.println("Cambiar cancion basica.");

                    listaBasica.cambiarCancion();

                    break;

                case 6:
                    System.out.println("Mostrar lista premium.");

                    listaPremium.verMiLista();

                    break;

                case 7:
                    System.out.println("Aniadir cancion lista premium.");

                    Artista artista1p = new Artista("Taylor Swift", "Estados Unidos", "32");
                    Album album4p = new Album(2019, "Lover", artista1p);

                    Cancion cancion4p = new Cancion("The Man", 289, "Pop", album4p, artista1p);


                    listaPremium.aniadirCancion(cancion4p);

                    break;

                case 8:
                    System.out.println("Eliminar cancion lista premium.");

                    listaPremium.eliminarCancion("Shake"); //shake it off

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