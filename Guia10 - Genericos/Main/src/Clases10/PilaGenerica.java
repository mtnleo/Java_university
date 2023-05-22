package Clases10;

import java.util.Stack;

public class PilaGenerica<T extends Number> {
    // ATRIBUTOS

    private final Stack<T> pila = new Stack<T>();

    // CONSTRUCTOR

    public PilaGenerica() {}

    // METODOS

    public void agregarElemento(T elemento) {
        pila.push(elemento);
    }

    public void mostrarPila() {
        Stack<T> aux = new Stack<T>();
        while (!pila.empty()) {
            T elemento = pila.pop();
            aux.push(elemento);
            System.out.println(elemento);
        }
        while (!aux.empty()) {
            T elemento = aux.pop();
            pila.push(elemento);
        }
    }


}
