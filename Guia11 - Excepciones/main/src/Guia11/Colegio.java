package Guia11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Colegio {
    // ATRIBUTOS

    private HashMap<String, LinkedList<String>> alumnes;

    // CONSTRUCTORES

    public Colegio() {
        this.alumnes = new HashMap<String, LinkedList<String>>();
    }

    // METODOS

    public void agregarAlumnx(String nacionalidad, String nombreApellido) {
        if (alumnes.containsKey(nacionalidad)) {
            alumnes.get(nacionalidad).add(nombreApellido);
        }
        else {
            alumnes.put(nacionalidad, new LinkedList<String>());
            alumnes.get(nacionalidad).add(nombreApellido);
        }
    }

    public void verNacionalidad(String nacionalidad) {
        System.out.println("Nacionalidad: " + nacionalidad + " | Cant. alumnes: " + alumnes.get(nacionalidad));
    }

    public void mostrarNacionalidades() {
        Set<String> keys = alumnes.keySet();
        for (String key: keys) {
            System.out.println("Nacionalidad: " + key + " | Cant. alumnes: " + alumnes.get(key).size());
        }
    }

    public int cuantos() {
        return alumnes.size();
    }

    public boolean borrar(String nombreAlumno) {
        Set<String> keys = alumnes.keySet();
        boolean encontrado = false;
        for (String key: keys) {
            encontrado = alumnes.get(key).remove(nombreAlumno);
            if (encontrado) {
                return true;
            }
        }
        return false;
    }

}
