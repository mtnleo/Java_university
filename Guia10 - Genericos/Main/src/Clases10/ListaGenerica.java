package Clases10;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    //ATRIBUTOS

    private final List<T> lista = new ArrayList<T>();

    //CONSTRUCTORES

    public ListaGenerica() {}

    //METODOS

    public void intercambiarElementos(T el1, T el2) {
        if (lista.contains(el1) && lista.contains(el2)) {
            int ind1 = lista.indexOf(el1);
            int ind2 = lista.indexOf(el2);

            lista.set(ind1, el2);
            lista.set(ind2, el1);

        }
        else {
            System.out.println("Uno o mas elementos no se encuentran en la lista");
        }

    }

    public void agregarElemento(T elemento) {
        lista.add(elemento);
    }

    public T buscarElementoPosicion(int pos) {
        return lista.get(pos);
    }

    public int getSize() {
        return lista.size();
    }

    public void mostrarLista() {
        for (T elemento: lista) {
            System.out.println(elemento.toString());
        }
    }


}
