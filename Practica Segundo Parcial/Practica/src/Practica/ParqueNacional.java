package Practica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ParqueNacional {
    // ATRIBUTOS
    private String nombre;
    private int hectareas;
    private HashMap<String, LinkedList<Animal>> biosfera;
    private HashSet<String> biomas_aceptados;

    // CONSTRUCTORES
    public ParqueNacional(String nombre, int hectareas) {
        this.nombre = nombre;
        this.hectareas = hectareas;
        this.biosfera = new HashMap<String, LinkedList<Animal>>();
        this.biomas_aceptados = new HashSet<String>();
    }

    // METODOS
    public void agregarBiomaAceptado(String bioma) {
        biomas_aceptados.add(bioma);
    }

    public void agregarAnimal(Animal animal) {
        String habitat = animal.getHabitat();
        try {
            if (biomas_aceptados.contains(habitat)) {
                if (!biosfera.containsKey(habitat)) {
                    biosfera.put(habitat, new LinkedList<Animal>());
                }

                LinkedList<Animal> lista = biosfera.get(habitat);
                lista.add(animal);
            }
            else {
                throw new BiomaNoExisteException();
            }
        } catch(BiomaNoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarBiosfera() {
        String[] biomas = biosfera.keySet().toArray(new String[0]);
        for (String bioma: biomas) {
            System.out.println("\n-----------------------------------\nBioma ---- " + bioma);
            mostrarAnimales(bioma);
        }
    }

    public void mostrarAnimales(String habitat) {
        try {
            if (biosfera.containsKey(habitat)) {
                mostrarLista(biosfera.get(habitat));
            }
            else {
                throw new BiomaNoExisteException();
            }
        }
        catch (BiomaNoExisteException e) {
            System.out.println(e.getMessage());
        }

    }

    public<T> void mostrarLista(LinkedList<T> lista) {
        for (T obj: lista) {
            System.out.println("#######");
            System.out.println(obj.toString());
        }
    }

}
