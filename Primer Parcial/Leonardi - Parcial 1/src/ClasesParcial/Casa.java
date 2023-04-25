package ClasesParcial;

import java.util.Objects;

public class Casa extends Propiedad implements Alquiler {
    // ATRIBUTOS ------------------------------------------

    private double costoAlquiler;
    private int pisos;

    // CONSTRUCTORES ------------------------------------------

    public Casa(String direccion, Persona propietario, int precioBase, int pisos, int mesesAlquilada) {
        super(direccion, propietario, precioBase, precioBase);
        super.setCostoVenta(calcularCostoVenta(precioBase, pisos));
        this.costoAlquiler = this.calcularAlquileres(precioBase, mesesAlquilada);
        this.pisos = pisos;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Casa casa = (Casa) o;
        return costoAlquiler == casa.costoAlquiler && pisos == casa.pisos;
    }

    @Override
    public String toString() {
        return "####### Casa ########" +
                super.toString() +
                "\ncostoAlquiler = " + costoAlquiler +
                "\npisos = " + pisos;
    }
}
