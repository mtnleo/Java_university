package MusicPlayer;

import java.util.Stack;

public class ListaBasica implements Reproduccion {
    // ATRIBUTOS

    private String nombre;
    public Cancion reproduciendo;
    public Stack<Cancion> stackBasica;

    // CONSTRUCTORES

    public ListaBasica(String nombre) {
        this.nombre = nombre;
        this.stackBasica = new Stack<Cancion>();
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
        this.reproduciendo = stackBasica.pop();
        Stack<Cancion> copia = new Stack<Cancion>();

        System.out.println("Reproduciendo: \n" + reproduciendo.toString());

        while (!stackBasica.empty()) {
            copia.push(stackBasica.pop());
        }

        stackBasica.push(reproduciendo);

        while (!copia.empty()) {
            stackBasica.push(copia.pop());
        }
    }

    public void aniadirCancion(Cancion c) {
        stackBasica.push(c);
    }

    public void cambiarCancion() {
        System.out.println("Cambiar cancion es una funcion premium!");
    }

    public void eliminarCancion(String nombre) {
        System.out.println("Eliminar cancion es una funcion premium!");
    }

    public void verMiLista() {
        mostrarStack();
    }

    // METODOS STACK

    private void mostrarStack() {
        Stack<Cancion> copia = new Stack<Cancion>();
        int i = 1;

        while (!stackBasica.empty()) {
            Cancion c = stackBasica.pop();

            System.out.println("| " + i + " |  " + c.toString());

            copia.push(c);
        }

        while (!copia.empty()) {
            stackBasica.push(copia.pop());
        }
    }

}
