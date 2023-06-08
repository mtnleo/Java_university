package Practica;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

public class ParquesArgentina {
    // ATRIBUTOS

    private TreeSet<ParqueNacional> parques; // ordenados por numero de hectareas
    private final String ARCHIVO_PARQUES = "nombre_parques.txt";

    // CONSTRUCTOR

    public ParquesArgentina() {
        this.parques = new TreeSet<ParqueNacional>();
    }

    // METODOS

    public void agregarParqueNacional(ParqueNacional parque) {
        parques.add(parque);
    }

    public void mostrarParquesCargados() {
        for (ParqueNacional parque: parques) {
            System.out.println("-------------------");
            System.out.println(parque.getNombre());
            System.out.print("Hectareas: ");
            if (parque.getHectareas() > 0) {
                System.out.println(parque.getHectareas());
            } else {
                System.out.println("No cargadas");
            }
        }
    }

    public void cargarNombreParquesTxt() {
        File file = new File(ARCHIVO_PARQUES);
        try {
            BufferedWriter fSalida = new BufferedWriter(new FileWriter(file));
            for (ParqueNacional parque: parques) {
                fSalida.write(parque.getNombre());
                fSalida.newLine();
            }
            fSalida.close();
        }
        catch (IOException e) {
            System.out.println("Se produjo un error al escribir al archivo");
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> leerNombreParquesTxt() {
        File file = new File(ARCHIVO_PARQUES);

        ArrayList<String> arreglo = new ArrayList<String>();

        if (file.exists()) {
            try {
                BufferedReader fEntrada = new BufferedReader(new FileReader(file));
                String linea = null;

                while ((linea = fEntrada.readLine()) != null) {
                    arreglo.add(linea);
                }

                fEntrada.close();
            }
            catch (IOException e) {
                System.out.println("Ocurrio un problema leyendo el archivo");
            }

        }
        else {
            System.out.println("Ese archivo no existe");
        }

        return arreglo;
    }

    public static void leerArrayListNombreParques(ArrayList<String> arreglo) {
        for (String nombre: arreglo) {
            System.out.println(nombre);
        }
    }



}
