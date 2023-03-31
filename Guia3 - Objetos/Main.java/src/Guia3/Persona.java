package Guia3;

public class Persona {
    protected int dni;
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String direccion;

    // BUILDER/CONSTRUCTOR -------------------------------------------------------

    public Persona(int dni, String nombre, String apellido, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    // GETTERS AND SETTER -------------------------------------------------------

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // METODOS -------------------------------------------------------

    public void Mostrar() {
        System.out.println("-------- PERSONA --------");
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Email: " + getEmail());
        System.out.println("Dirección: " + getDireccion());
    }

}
