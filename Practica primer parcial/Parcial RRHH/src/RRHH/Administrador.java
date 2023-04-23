package RRHH;

import java.time.LocalDate;
import java.util.Objects;

public class Administrador extends Empleado {
    /// ATRIBUTOS ------------------------------

    private String area;
    private double sueldo;

    /// CONSTRUCTORES ------------------------------

    public Administrador() {
    }

    public Administrador(String legajo, String nombre, String apellido, String direccion, LocalDate fechaNacimiento, String area, double sueldo) {
        super(legajo, nombre, apellido, direccion, fechaNacimiento);
        this.area = area;
        this.sueldo = 15;
    }

    /// GETTERS AND SETTERS ------------------------------

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /// METODOS ------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Administrador that = (Administrador) o;
        return Double.compare(that.sueldo, sueldo) == 0 && Objects.equals(area, that.area);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "area='" + getArea() + '\'' +
                ", sueldo=" + getSueldo() +
                ", legajo='" + getLegajo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                '}';
    }
}
