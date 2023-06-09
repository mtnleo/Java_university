package Parcial;

import java.util.HashSet;

public class Federacion {
    // ATRIBUTOS

    private String nombre;
    private String fechaFundacion;
    private int copas; //3 papaaaa
    private HashSet<Integrante> plantel;

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
        this.plantel = new HashSet<Integrante>();
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

    public void agregarIntegrantePlantel(Integrante integrante) {
        plantel.add(integrante);
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
}
