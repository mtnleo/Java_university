package Parcial;

import java.io.*;
import java.util.HashSet;
import com.google.gson.Gson;


public class Federacion {
    // ATRIBUTOS

    private String nombre;
    private String fechaFundacion;
    private int copas; //3 papaaaa
    private final HashSet<Integrante> plantel;

    // CONSTRUCTORES

    public Federacion(String nombre, String fechaFundacion, int copas, HashSet<Integrante> plantel) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.copas = copas;
        this.plantel = plantel;
    }

    public Federacion(String nombre, String fechaFundacion, int copas) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.copas = copas;
        this.plantel = new HashSet<>();
    }

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    // METODOS

    public void mostrarFederacion() {
        System.out.println("-------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha fundación: " + fechaFundacion);
        System.out.println("Copas: " + copas);
        mostrarHashSetPlantel();
    }

    public void mostrarHashSetPlantel() {
        for (Integrante integ: plantel) {
            System.out.println("---------------");
            System.out.println(integ.toString());
        }
    }

    public void agregarIntegrantePlantel(Integrante integrante) {
        if (!plantel.contains(integrante)) {
            try {
                if (plantel.size() < 23) { // si el plantel supera las 23 personas
                    if (integrante instanceof Entrenador) { // si es un entrenador el q hay q agregar, verificar q no haya otro
                        boolean dobleEntrenador = false;
                        for (Integrante integ: plantel) { // verifico a ver si hay otro entrenador
                            if (integ instanceof Entrenador) {
                                dobleEntrenador = true;
                                break;
                            }
                        }
                        if (dobleEntrenador) { // si ya existe un entrenador no lo agrego
                            throw new NumeroEntrenadorExcedidoException();
                        }
                        else {
                            plantel.add(integrante);
                        }
                    }
                    else {
                        plantel.add(integrante);
                    }
                }
                else {
                    throw new PlantelExcedidoException();
                }

            }
            catch (PlantelExcedidoException | NumeroEntrenadorExcedidoException e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            System.out.println("Ese jugador ya se encuentra cargado");
        }


    }

    public boolean removerIntegrante(String nombre, String apellido) {
        boolean encontrado = false;
        for (Integrante integrante: plantel) {
            if (integrante.getNombre().equals(nombre) && integrante.getApellido().equals(apellido)) {
                plantel.remove(integrante);
                encontrado = true;
            }
            break;
        }
        return encontrado;
    }

    public void cargarJson(String path) {
        File file = new File(path);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            Gson gson = new Gson();

            Federacion agregar = this;

            gson.toJson(agregar, Federacion.class, bufferedWriter);

            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println("Error cargando el Json");
            System.out.println(e.getMessage());
        }
    }

    public static Federacion leerJson(String path) {
        Federacion federacion = null;
        File file = new File(path);

        if (file.exists()) {
            if (file.canRead()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

                    Gson gson = new Gson();

                    federacion = gson.fromJson(bufferedReader, Federacion.class);

                    bufferedReader.close();
                }
                catch (IOException e) {
                    System.out.println("Problema leyendo del Json (" + path + ").");
                    System.out.println(e.getMessage());
                }
            }
            else {
                System.out.println("No hay permisos para leer del archivo (" + path + ").");
            }
        }
        else {
            System.out.println("El archivo json provisto no existe (" + path + ").");
        }

        return federacion;
    }


}
