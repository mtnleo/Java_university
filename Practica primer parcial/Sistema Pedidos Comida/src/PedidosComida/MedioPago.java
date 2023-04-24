package PedidosComida;

public class MedioPago {
    /// ATRIBUTOS -----------------------------

    private String nombre;
    private int recargo; // 0-100

    /// CONSTRUCTORES -----------------------------

    public MedioPago(String nombre, int recargo) {
        this.nombre = nombre;
        this.recargo = recargo;
    }

    /// GETTERS & SETTERS -----------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecargo() {
        return recargo;
    }

    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }
}
