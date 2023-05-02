package MusicPlayer;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaPremium implements Reproduccion {
    // ATRIBUTOS

    private String nombre;
    public Cancion reproduciendo;
    public LinkedList<Cancion> listaPremium;

    // CONSTRUCTORES

    public ListaPremium(String nombre) {
        this.nombre = nombre;
        listaPremium = new LinkedList<Cancion>();
    }

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // METODOS INTERFAZ

    public void Reproducir() {
        Scanner scan = new Scanner(System.in);

        mostrarLista();

        System.out.println("Escriba el numero de la cancion a reproducir: ");
        int numer = scan.nextInt();

        Cancion reproducida = listaPremium.get(numer-1);

        if (reproducida == null) {
            System.out.println("Cancion no encontrada T.T");
            reproducida = listaPremium.get(0);
        }
        System.out.println("Reproduciendo \n" + reproducida.toString());

        this.reproduciendo = reproducida;
    }

    public void cambiarCancion() {
        this.reproduciendo = listaPremium.get(listaPremium.indexOf(reproduciendo) + 1);
    }

    public void aniadirCancion(Cancion c) {
        listaPremium.add(c);
    }

    public void eliminarCancion(String nombre) {
        Cancion buscada = buscarCancion(nombre);

        if( buscada != null) {
            listaPremium.remove(buscada);
        }
        else {
            System.out.println("Cancion no encontrada :/");
        }
    }

    public void verMiLista() {
        mostrarLista();
    }

    // METODOS LISTA

    private void mostrarLista() {
        int i = 1;
        for (Cancion can: listaPremium) {
            System.out.println("| " + i + " |  " + can.toString());
            i+=1;
        }
    }

    private Cancion buscarCancion(String nombre) {
        Cancion buscada = null;
        for (Cancion c: listaPremium) {
            if (c.getNombre().toLowerCase().startsWith(nombre.toLowerCase())) {
                buscada = c;
                break;
            }
        }
        return buscada;
    }


}
