package Libreria;

import java.util.UUID;

public class Cliente {
    UUID id;
    String nombre;
    String email;
    double descuento;

    public Cliente(String nombre, String email, double descuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public void MostrarCliente() {
            System.out.println("-------- CLIENTE --------");
            System.out.println("ID: " + this.id);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("e-mail: " + this.email);
            System.out.println("Descuento: " + this.descuento);
    }

}
