package Guia6;

import java.util.ArrayList;
import java.util.Random;

public class Matematicas implements Extremos {
    private ArrayList<Double> lista;

    /// CONSTRUCTOR ---------------------------

    public Matematicas() {
        this.lista = new ArrayList<Double>();
    }

    /// ABSTRACCION ARRAYLIST ---------------------------

    public void agregar(double num) {
        lista.add(num);
    }

    public void remover(int indice) {
        lista.remove(indice);
    }

    public void removerTodos() {
        lista.clear();
    }

    public double obtener(int indice) {
        return lista.get(indice);
    }

    /// INTERFAZ ---------------------------

    public double inicio() {
        return lista.get(0);
    }

    public double fin() {
        return lista.get(lista.size() - 1);
    }

    /// METODOS -----------------------------

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
