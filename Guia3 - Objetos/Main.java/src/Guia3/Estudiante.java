package Guia3;


final public class Estudiante extends Persona {
    private int anio_ingreso;
    private double cuota_mensual;
    private String carrera;

    // BUILDER/CONSTRUCTOR -------------------------------------------------------

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion, int anio_ingreso, double cuota_mensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anio_ingreso = anio_ingreso;
        this.cuota_mensual = cuota_mensual;
        this.carrera = carrera;
    }

    // GETTERS AND SETTER -------------------------------------------------------

    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public double getCuota_mensual() {
        return cuota_mensual;
    }

    public void setCuota_mensual(double cuota_mensual) {
        this.cuota_mensual = cuota_mensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // METODOS -------------------------------------------------------

    @Override
    public void Mostrar() {
        System.out.println("-------- ESTUDIANTE --------");
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Email: " + getEmail());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Anio de ingreso: " + getAnio_ingreso());
        System.out.println("Cuota Mensual: " + getCuota_mensual());
        System.out.println("Carrera: " + getCarrera());
    }
}
