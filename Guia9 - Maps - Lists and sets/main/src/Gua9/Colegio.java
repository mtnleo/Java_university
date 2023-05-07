package Gua9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Colegio {
    // ATRIBUTOS

    private HashMap<String, LinkedList<String>> alumnxs;

    // CONSTRUCTOR

    public Colegio() {
        alumnxs = new HashMap<>();
    }

    // METODOS

    public void addAlumno(String nacionalidad, String nombre) {
        if (alumnxs.containsKey(nacionalidad)) {
            alumnxs.get(nacionalidad).add(nombre);
        }
        else {
            alumnxs.put(nacionalidad, new LinkedList<String>());
            alumnxs.get(nacionalidad).add(nombre);
        }
    }

    public void showAll() {
        for (Map.Entry<String, LinkedList<String>> alus : alumnxs.entrySet()) {
            System.out.println(alus.getKey() + " - " + alus.getValue().size() + " alumnxs: " + listaToString(alus.getValue()));
        }
    }

    public void showNacionalidad(String nacionalidad) {
        try {
            System.out.println(nacionalidad + " - " + alumnxs.get(nacionalidad).size() + " alumnxs: " + listaToString(alumnxs.get(nacionalidad)));
        } catch(NullPointerException e) {
            System.out.println("No existe tal pais");
        }

    }

    public int cuantos() {
        return alumnxs.size();
    }

    public void borra(String nacionalidad) {
        try {
            alumnxs.remove(nacionalidad);
        } catch(NullPointerException e) {
            System.out.println("No existe tal pais");
        }

    }



    private String listaToString(LinkedList<String> lista) {
        String rtrn = "";
        for (String str: lista) {
            if (rtrn.equals("")) {
                rtrn = rtrn.concat("[ " + str);
            }
            else {
                rtrn = rtrn.concat(" - " + str);
            }
        }
        rtrn = rtrn.concat(" ]");
        return rtrn;
    }
}
