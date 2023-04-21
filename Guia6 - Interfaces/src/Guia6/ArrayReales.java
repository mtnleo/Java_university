package Guia6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayReales implements Estadistica{
    private ArrayList<Double> lista;

    /// BUILDER ---------------------------

    public ArrayReales() {
        this.lista = new ArrayList<Double>();
    }

    /// ABSTRACCION ARRAYLIST ---------------------------

    public void quitar(int indice) {
        lista.remove(indice);
    }

    public void quitarTodos() {
        lista.clear();
    }

    public double obtener(int indice) {
        return lista.get(indice);
    }

    public int tamano() {
        return lista.size();
    }


    public void agregar(double numero) {
        lista.add(numero);
    }

    /// INTERFAZ ---------------------------

    public double minimo() {
        return Collections.min(lista);
    }

    public double maximo() {
        return Collections.max(lista);
    }

    public double sumatorio() {
        double suma = 0;
        for (double num: lista) {
            suma += num;
        }
        return suma;
    }

    /// METODOS ---------------------------

    public void CargarLista(int cantidad) {
        Random rand = new Random();
        for (int i = 0; i < cantidad; i++) {
            lista.add(rand.nextDouble(100));
        }
    }

    public String MostrarLista() {
        return lista.toString();
    }

}
