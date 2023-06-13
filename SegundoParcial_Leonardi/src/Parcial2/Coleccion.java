package Parcial2;

import java.util.HashSet;

public class Coleccion<T> {
    // ATRIBUTOS
    private HashSet<T> coleccion;

    // CONSTRUCTORES

    public Coleccion() {
        this.coleccion = new HashSet<T>();
    }

    // METODOS
    public void agregar(T objeto) {
        coleccion.add(objeto);
    }

    public T buscar(T objeto) {
        T encontrado = null;
        for (T dato: coleccion) {
            if (objeto.equals(dato)) {
                encontrado = dato;
                break;
            }
        }
        return encontrado;
    }

    public void listar() {
        for (T dato: coleccion) {
            System.out.println(dato.toString());
        }
    }

    public void eliminar(T objeto) throws MaterialInexistenteException { // excepcion
        if (!coleccion.remove(objeto)) {
            throw new MaterialInexistenteException();
        }
    }
}
