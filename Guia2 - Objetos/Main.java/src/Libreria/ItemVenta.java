package Libreria;

import java.util.UUID;

public class ItemVenta {
    UUID id;
    String nombre;
    String descripcion;
    double precio;

    public ItemVenta(String nombre, String descripcion, double precio) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
