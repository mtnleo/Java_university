package MusicPlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cont = "y";
        Scanner scan = new Scanner(System.in);
        int num_ej;
        String num_ej_letra;

        Player player = new Player("Basic", "Premium");

        HARDCODE.cargarCanciones(player.listaPremium, player.listaBasica);

        while (cont.equals("y")) {
            System.out.println("Escriba el ejercicio que quieras realizar: ");
            num_ej_letra = scan.next();
            scan.nextLine();

            if (num_ej_letra.charAt(0) == 'p' || num_ej_letra.charAt(0) == 'P') {
                num_ej = 112;
            } else {
                num_ej = Integer.parseInt(num_ej_letra);
            }

            switch (num_ej) {
                case 112:
                    if (player.isPremium()) {
                        if (player.listaPremium.reproduciendo != null) {
                            player.pausaResumir();
                        }
                        else {
                            System.out.println("No hay nada reproduciendose :P");
                        }
                    } else {
                        if (player.listaBasica.reproduciendo != null) {
                            player.pausaResumir();
                        }
                        else {
                            System.out.println("No hay nada reproduciendose :P");
                        }
                    }

                    break;

                case 0:
                    player.mostrarReproduciendo();

                    break;

                case 1:

                    player.Reproducir();

                    break;

                case 2:
                    System.out.println("Mostrar lista basica.");

                    player.listaBasica.verMiLista();

                    break;

                case 3:
                    System.out.println("Aniadir cancion basica");

                    Artista artista1 = new Artista("Taylor Swift", "Estados Unidos", "32");
                    Album album4 = new Album(2019, "Lover", artista1);

                    Cancion cancion4 = new Cancion("Cornelia Street", 289, "Pop", album4, artista1);

                    player.listaBasica.aniadirCancion(cancion4);

                    break;

                case 4:
                    System.out.println("Remover lista basica.");

                    player.listaBasica.eliminarCancion("Betty");

                    break;

                case 5:
                    System.out.println("Cambiar cancion basica.");

                    player.listaBasica.cambiarCancion();

                    break;

                case 6:
                    System.out.println("Mostrar lista premium.");

                    player.listaPremium.verMiLista();

                    break;

                case 7:
                    System.out.println("Aniadir cancion lista premium.");

                    Artista artista1p = new Artista("Taylor Swift", "Estados Unidos", "32");
                    Album album4p = new Album(2019, "Lover", artista1p);

                    Cancion cancion4p = new Cancion("The Man", 289, "Pop", album4p, artista1p);


                    player.listaPremium.aniadirCancion(cancion4p);

                    break;

                case 8:
                    System.out.println("Eliminar cancion lista premium.");

                    player.listaPremium.eliminarCancion("Shake"); //shake it off

                    break;

                case 9:
                    System.out.println("Ahora sos premium!");

                    player.setPremium(true);

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