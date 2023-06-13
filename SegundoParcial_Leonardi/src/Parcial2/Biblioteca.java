package Parcial2;

import com.google.gson.Gson;

import java.io.*;

public class Biblioteca {
    // ATRIBUTOS
    private final Coleccion<Material> material;

    // CONSTRUCTORES
    public Biblioteca() {
        this.material = new Coleccion<Material>();
    }

    // METODOS
    public void agregarMaterial(Material materialAgregar) {
        material.agregar(materialAgregar);
    }

    public void mostrarMaterial() {
        System.out.println("----- MATERIAL -------");
        material.listar();
    }

    public void eliminarMaterial(Material materialEliminar) {
        try {
            material.eliminar(materialEliminar);
        }
        catch (MaterialInexistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean alquilar(Material materialAlquilar) {
        boolean prestado = false;
        Material materialLeido = null;
        try {
            materialLeido = material.buscar(materialAlquilar);
            if (materialLeido != null) {
                if (materialLeido instanceof Libro) {
                    if(((Libro) materialLeido).prestar()) {
                        prestado = true;
                    } else {
                        throw new MaterialNoDisponibleException();
                    }
                }
                else if (materialLeido instanceof Revista) {
                    if(((Revista) materialLeido).prestar()) {
                        prestado = true;
                    } else {
                        throw new MaterialNoDisponibleException();
                    }
                }
                else {
                    System.out.println("Los articulos no se pueden prestar");
                }
            }
            else {
                throw new MaterialInexistenteException();
            }

        } catch (MaterialInexistenteException | MaterialNoDisponibleException e) {
            System.out.println(e.getMessage());
        }
        return prestado;
    }

    public void devolver(Material materialDevolver) {
        if (materialDevolver instanceof Libro) {
            ((Libro) materialDevolver).devolver();
            material.agregar(materialDevolver);

        }
        else if (materialDevolver instanceof Revista) {
            ((Revista) materialDevolver).devolver();
            material.agregar(materialDevolver);
        }
        else {
            System.out.println("El material provisto no se puede devolver ni prestar");
        }
    }

    public void cargarJson() {
        File file = new File("Bibliotequita.json");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            Gson gson = new Gson();

            gson.toJson(this, Biblioteca.class, bufferedWriter);
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println("Problema cargando informacion al Json");
            System.out.println(e.getMessage());
        }
    }

    public static Biblioteca leerJson(String pathname) {
        Biblioteca biblioteca = null;
        File file = new File(pathname);
        if (file.exists()) {
            if (file.canRead()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

                    Gson gson = new Gson();

                    biblioteca = gson.fromJson(bufferedReader, Biblioteca.class);
                }
                catch (IOException e) {
                    System.out.println("Hubo un problema leyendo el archivo");
                }
            }
            else {
                System.out.println("El archivo no tiene permisos de lectura :/");
            }
        }
        else {
            System.out.println("El archivo que se intento abrir no existe");
        }

        return biblioteca;
    }

}
