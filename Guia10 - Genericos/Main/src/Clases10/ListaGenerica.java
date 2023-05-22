package Clases10;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    //ATRIBUTOS

    private List<T> lista = new ArrayList<T>();

    //CONSTRUCTORES

    public ListaGenerica() {}

    //METODOS

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
