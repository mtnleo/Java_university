package PedidosComida;

import java.util.UUID;

public class Usuario {
    /// ATRIBUTOS -----------------------------

    private UUID id;
    private String nombre;
    private String mail;
    private String direccion;

    /// CONSTRUCTORES -----------------------------

    public Usuario() {

    }

    public Usuario(String nombre, String mail, String direccion) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
    }

    /// GETTERS & SETTERS -----------------------------

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }

    /// METODOS ------------------------------


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
