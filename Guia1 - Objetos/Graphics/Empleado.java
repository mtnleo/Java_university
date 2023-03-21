package Graphics;

public class Empleado {
    int dni;
    String nombre;
    String apellido;
    float salario;

    public Empleado(int dni, String nombre, String apellido, int salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public float saberSalarioAnual() {
        return getSalario() * 12;
    }

    public void MostrarEmpleado() {
        System.out.println("---------------------");
        System.out.println("Nombre: " + this.nombre + " " + this.apellido);
        System.out.println("DNI: " + this.dni);
        System.out.println("Salario: " + getSalario());

    }

    public void aumentarSalario(float porcentaje) {
        System.out.println((float)(porcentaje/100));
        float nuevoSalario = getSalario() * (float)(porcentaje/100) + getSalario();
        setSalario(nuevoSalario);
    }
}
