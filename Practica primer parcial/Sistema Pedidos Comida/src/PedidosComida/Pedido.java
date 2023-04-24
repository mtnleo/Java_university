package PedidosComida;

import java.util.ArrayList;

public class Pedido {
    /// ATRIBUTOS -----------------------------

    private Usuario usuario;
    private Local local;
    private double precioTotal;
    private String medioEntrega;
    private MedioPago medioPago;
    private String direccionEntrega;
    private ArrayList<Plato> platos;
    private double precioTotalRecargo;
    private boolean completado;

    /// CONSTRUCTOR -----------------------------

    public Pedido(Usuario usuario, Local local, String medioEntrega, MedioPago medioPago, String direccion, ArrayList<Plato> platos) {
        this.usuario = usuario;
        this.local = local;
        this.precioTotal = calcularPrecioTotalPlatos(platos);
        this.medioEntrega = medioEntrega;
        this.medioPago = medioPago;
        this.direccionEntrega = direccion;
        this.platos = platos;
        this.precioTotalRecargo = calcularPrecioRecargo(precioTotal, medioPago.getRecargo());
        this.completado = false;
    }

    public Pedido() {
    }

    /// GETTERS AND SETTERS ---------------------------

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    /// METODOS --------------------------------

    public double calcularPrecioRecargo(double precioTotal, int recargo) {
        return precioTotal + precioTotal * (double)(recargo / 100);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "usuario=" + usuario +
                ", local=" + local +
                ", precioTotal=" + precioTotal +
                ", medioEntrega='" + medioEntrega + '\'' +
                ", medioPago=" + medioPago +
                ", direccionEntrega='" + direccionEntrega + '\'' +
                ", platos=" + platos +
                ", precioTotalRecargo=" + precioTotalRecargo +
                ", completado=" + completado +
                '}';
    }

    public double calcularPrecioTotalPlatos(ArrayList<Plato> platos) {
        double total = 0;
        for (Plato pla: platos) {
            total += pla.getCantidadPedido() * pla.getCosto();
        }
        return total;
    }
}
