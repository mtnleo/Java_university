package Libreria;
import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    UUID id;
    double monto;
    LocalDate fecha;
    UUID id_cliente;
    Cliente cliente;
    ItemVenta[] items = new ItemVenta[10];

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Factura(Cliente cliente, ItemVenta[] items) {
        this.id = UUID.randomUUID();
        this.monto = sumarItems(items);
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.id_cliente = cliente.id;
        this.items = items;
    }

    public double sumarItems(ItemVenta[] items) {
        double precioTotal = 0;
        for (ItemVenta item: items) {
            precioTotal += item.precio;
        }
        return precioTotal;
    }

    public String LeerItems() {
        String items = "";
        for (ItemVenta item: this.items) {
            if (items.equals("")) {
                items = items.concat(item.nombre);
            }
            else {
                items = items.concat(", ").concat(item.nombre);
            }

        }
        return items;
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
        System.out.println("Items comprados: " + this.LeerItems());
    }

}
