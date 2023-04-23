package RRHH;

import java.time.LocalDate;
import java.util.Objects;

public class Vendedor extends Empleado {
    /// ATRIBUTOS ------------------------------

    private double montoVentaMensual;
    private double sueldo;

    /// CONSTRUCTORES ------------------------------

    public Vendedor() {
    }

    public Vendedor(String legajo, String nombre, String apellido, String direccion, LocalDate fechaNacimiento, double montoVentaMensual) {
        super(legajo, nombre, apellido, direccion, fechaNacimiento);
        this.montoVentaMensual = montoVentaMensual;
        this.sueldo = montoVentaMensual * .3;
    }

    /// GETTERS & SETTERS ------------------------------

    public double getMontoVentaMensual() {
        return montoVentaMensual;
    }

    public void setMontoVentaMensual(double montoVentaMensual) {
        this.montoVentaMensual = montoVentaMensual;
        this.sueldo = montoVentaMensual * .3; // actualizado
    }

    public double getSueldo() {
        return sueldo;
    }

    /// METODOS ------------------------------

    @Override
    public String toString() {
        return "Vendedor{" +
                "montoVentaMensual = " + getMontoVentaMensual() +
                ", sueldo = " + getSueldo() +
                ", legajo = '" + getLegajo() + '\'' +
                ", nombre = '" + getNombre() + '\'' +
                ", apellido = '" + getApellido() + '\'' +
                ", direccion = '" + getDireccion() + '\'' +
                ", fechaNacimiento = " + getFechaNacimiento() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return Double.compare(vendedor.montoVentaMensual, montoVentaMensual) == 0 && Double.compare(vendedor.sueldo, sueldo) == 0;
    }

}