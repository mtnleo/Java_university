package Libreria;
import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    UUID id;
    double monto;
    LocalDate fecha;
    UUID id_cliente;
    Cliente cliente;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Factura(double monto, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.monto = monto;
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.id_cliente = cliente.id;
    }

    public void montoDescontado() {
        setMonto(getMonto() - getMonto() * (this.cliente.descuento / 100));
    }

    public void mostrarFactura() {
        System.out.println("-------- FACTURA --------");
        System.out.println("ID: " + this.id);
        System.out.println("Monto: " + this.monto);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("ID Cliente: " + this.id_cliente);
    }

}
