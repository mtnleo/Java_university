package Practica;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ParqueNacional implements Comparable<ParqueNacional> {
    // ATRIBUTOS
    private String nombre;
    private int hectareas;
    private String provinciaMayoritaria;
    private HashMap<String, LinkedList<Animal>> biosfera;
    private HashSet<String> biomas_aceptados;

    private static final String NOMBRE_ARCHIVO = "parque_nacional.json";

    // CONSTRUCTORES
    public ParqueNacional(ParqueNacional p) {
        this.nombre = p.nombre;
        this.hectareas = p.hectareas;
        this.biosfera = p.biosfera;
        this.biomas_aceptados = p.biomas_aceptados;
    }

    public ParqueNacional(String nombre) {
        this.nombre = nombre;
        this.hectareas = 0;
        this.biosfera = new HashMap<String, LinkedList<Animal>>();
        this.biomas_aceptados = new HashSet<String>();
    }

    public ParqueNacional(String nombre, int hectareas) {
        this.nombre = nombre;
        this.hectareas = hectareas;
        this.biosfera = new HashMap<String, LinkedList<Animal>>();
        this.biomas_aceptados = new HashSet<String>();
    }

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @Override
    public int compareTo(ParqueNacional o) { // para poder comparar en clase ParquesArgentina
        if (o.hectareas == 0) { return -1; }
        return Integer.compare(this.hectareas, o.hectareas);
    }

    public void cargarParqueNacionalJson() {
        File file = new File(NOMBRE_ARCHIVO);
        try {
            BufferedWriter fSalida = new BufferedWriter(new FileWriter(file));

            Gson gson = new Gson();

            gson.toJson(this, fSalida);

            fSalida.close();
        }
        catch (IOException e) {
            System.out.println("Problema abriendo el buffer del archivo json");
        }
        catch (JsonSyntaxException e) {
            System.out.println("Error sintaxis Json");
            System.out.println(e.getMessage());
        } catch (JsonIOException e) {
            System.out.println("Error IO Json");
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<ParqueNacional> leerParqueNacionalJson() {
        ArrayList<ParqueNacional> arreglo = new ArrayList<ParqueNacional>();

        File file = new File(NOMBRE_ARCHIVO);
        if (file.exists()) {
            try {
                BufferedReader fEntrada = new BufferedReader(new FileReader(file));

                String linea = null; // linea que luego convierto en algo que json pueda leer

                Gson gson = new Gson();

                while ((linea = fEntrada.readLine()) != null) {
                    ParqueNacional parqueNacional = gson.fromJson(linea, ParqueNacional.class);

                    arreglo.add(parqueNacional);
                }

                fEntrada.close();
            }
            catch (IOException e) {
                System.out.println("Problema abriendo el buffer para leer Json");
            }
        }
        else {
            System.out.println("No existe el archivo que se intenta abrir (" + NOMBRE_ARCHIVO + ")");
        }

        return arreglo;
    }
}
