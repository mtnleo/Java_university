package Guia3;

final public class Staff extends Persona {
    private double salario;
    private String turno;

    // BUILDER/CONSTRUCTOR -------------------------------------------------------

    public Staff(int dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    // GETTERS AND SETTER -------------------------------------------------------

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // METODOS -------------------------------------------------------

    public double getSalarioAnual() {
        return getSalario() * 12;
    }

    @Override
    public void Mostrar() {
        System.out.println("-------- STAFF --------");
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Email: " + getEmail());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Salario: " + getSalario());
        System.out.println("Salario Anual: " + getSalarioAnual());
        System.out.println("Turno: " + getTurno());
    }

}
