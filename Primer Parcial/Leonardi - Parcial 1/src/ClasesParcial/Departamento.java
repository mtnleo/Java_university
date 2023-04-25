package ClasesParcial;

import java.util.ArrayList;
import java.util.Objects;

public class Departamento extends Propiedad implements Alquiler {
    // ATRIBUTOS ------------------------------------------

    private double costoAlquiler;
    private final int ambientes;

    // CONSTRUCTORES ------------------------------------------

    public Departamento(String direccion, Persona propietario, int precioBase, int ambientes, int mesesAlquilado) {
        super(direccion, propietario, precioBase, precioBase);
        super.setCostoVenta(calcularCostoVenta(precioBase, ambientes));
        this.costoAlquiler = calcularAlquileres(precioBase, mesesAlquilado);
        this.ambientes = ambientes;
    }

    // GETTERS & SETTERS ------------------------------------------

    public double getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(double costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }


    // METODOS ------------------------------------------

    /// IMPLEMENTACION SUPERCLASE

    protected int calcularCostoVenta(int precioBase, int unidades) {
        return precioBase * unidades;
    }

    /// IMPLEMENTACION INTERFAZ ALQUILER

    public int calcularAlquileres(int precioBase, int mesesAlquilado) {
        return precioBase * mesesAlquilado;
    }

    public void aumentarAlquileres(int porcentaje) {
        double costoActual =getCostoAlquiler();
        double porcentajeMultiplicar =  porcentaje / 100.0;
        double costoTotal = costoActual + (costoActual * porcentajeMultiplicar);
        setCostoAlquiler(costoTotal);
    }

        /// TOSTRING Y EQUALS

    @Override
    public String toString() {
        return "~~~~~ Departamento ~~~~~\n" +
                super.toString() +
                "\ncostoAlquiler = " + costoAlquiler +
                "\nambientes = " + ambientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Departamento that = (Departamento) o;
        return costoAlquiler == that.costoAlquiler && ambientes == that.ambientes;
    }
}

