package PedidosComida;

public class Plato {
    /// ATRIBUTOS -----------------------------

    private String nombre;
    private double costo;
    private int cantidadPedido;

    /// CONSTRUCTORES -----------------------------

    public Plato(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
        this.cantidadPedido = 0;
    }

    public Plato() {
    }

    /// GETTERS AND SETTERS -----------------------------

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadPedido() {
        return cantidadPedido;
    }

    public void setCantidadPedido(int cantidadPedido) {
        this.cantidadPedido = cantidadPedido;
    }

    /// METODOS
}
