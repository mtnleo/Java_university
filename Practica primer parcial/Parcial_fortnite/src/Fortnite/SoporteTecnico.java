package Fortnite;

public class SoporteTecnico extends Persona {
    /// ATRIBUTOS --------------------------

    protected String area_especializa;

    /// CONSTRUCTORS --------------------------

    public SoporteTecnico() {
        super();
        this.area_especializa = "";
    }

    public SoporteTecnico(String nombre, String apellido, int edad, String localidad, String area_especializa) {
        super(nombre, apellido, edad, localidad);
        this.area_especializa = area_especializa;
    }

    /// METODOS --------------------------

    public void arreglarPerifericos() {
        System.out.println("Perifericos arreglados");
    }

    public void cambiarPerifericos() {
        System.out.println("Perifericos cambiados");
    }

    @Override
    public String toString() {
        return "SoporteTecnico{" +
                "area_especializa='" + area_especializa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
