package Libreria;

public class Autor {
    String nombre;
    String apellido;
    String email;
    Character genero;

    public Autor(String nombre, String apellido, String email, Character genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public void mostrarAutor() {
        System.out.println("-------- AUTOR --------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("e-mail: " + this.email);
        System.out.println("Genero: " + this.genero);
    }

}
