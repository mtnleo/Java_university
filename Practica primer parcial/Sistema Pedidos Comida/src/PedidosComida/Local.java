package PedidosComida;

import java.util.UUID;
import java.util.ArrayList;

public class Local {
    /// ATRIBUTOS -----------------------------

    private UUID id;
    private String nombre;
    private String direccion;
    public ArrayList<Plato> platos;
    public ArrayList<MedioPago> medioDePago;
    public ArrayList<Pedido> pedidos;

    /// CONSTRUCTORES  -----------------------------

    public Local(String nombre, String direccion) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.direccion = direccion;
        this.platos = new ArrayList<Plato>();
        this.medioDePago = new ArrayList<MedioPago>();
    }

    /// GETTERS AND SETTERS -------------------

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /// METODOS  -----------------------------

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void agregarMediodePago(MedioPago medioPago) {
        medioDePago.add(medioPago);
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    ///// MUESTRA

    public void mostrarPlatos() {
        for(Plato plato: platos) {
            System.out.println(plato.toStringVer());
        }
    }

    @Override
    public String toString() {
        return "Local{" +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
