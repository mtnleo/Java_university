package Gua9;

import java.util.Collections;
import java.util.LinkedList;

public class Calendario {
    // ATRIBUTOS

    private final LinkedList<String> diasSemana;

    // CONSTRUCTORES

    public Calendario() {
        diasSemana = new LinkedList<String>();
    }

    // METODOS

    public void addDia(String dia) {
        diasSemana.add(dia);
    }

    public void addDiaPos(int pos, String dia) {
        diasSemana.add(pos, dia);
    }

    public void mostrarDias() {
        for (String dia: diasSemana) {
            System.out.print(dia + " - ");
        }
    }

    public String buscarDiaPos(int pos) {
        return diasSemana.get(pos);
    }

    public int getTamanioListaDias() {
        return diasSemana.size();
    }

    public boolean eliminarDia(String dia) {
        return diasSemana.remove(dia);
    }

    public boolean buscarDia(String dia) {
        return diasSemana.contains(dia);
    }

    public void borrarLista() {
        diasSemana.clear();
    }

    public void ordenarDias() {
        Collections.sort(diasSemana);
    }
}
