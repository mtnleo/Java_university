package ClasesParcial;

import java.util.Objects;

public abstract class Propiedad {
    // ATRIBUTOS ------------------------------------------

    private final String direccion;
    private final Persona propietario;
    private int precioBase;
    private int costoVenta;

    // CONSTRUCTORES ------------------------------------------

    public Propiedad(String direccion, Persona propietario, int precioBase, int costoVenta) {
        this.direccion = direccion;
        this.propietario = propietario;
        this.precioBase = precioBase;
        this.costoVenta = costoVenta;
    }

    // GETTERS & SETTERS ------------------------------------------

    public String getDireccion() {
        return direccion;
    }

    public int getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(int costoVenta) {
        this.costoVenta = costoVenta;
    }

    // METODOS ------------------------------------------

    protected abstract int calcularCostoVenta(int precioBase, int unidades);

        /// TO STRING Y EQUALS
    @Override
    public String toString() {
        return
                "\ndireccion = " + direccion +
                "\npropietario = " + propietario.toString() +
                "\nprecioBase = " + precioBase +
                "\ncostoVenta = " + costoVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return precioBase == propiedad.precioBase && costoVenta == propiedad.costoVenta && Objects.equals(direccion, propiedad.direccion) && Objects.equals(propietario, propiedad.propietario);
    }


}
