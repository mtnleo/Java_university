package Libreria;

import java.util.UUID;

public class ClienteBanco {

    UUID id;
    String nombre;
    Character genero;

    public ClienteBanco(String nombre, Character genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public void MostrarCliente() {
        System.out.println("-------- CLIENTE --------");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Genero: " + this.genero);
    }


}
