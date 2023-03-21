package Graphics;

public class ItemVenta {
    int id;
    String descripcion;
    int cantidad;
    double pUnitario;
    double pTotal;

    public ItemVenta(int id, String descripcion, int cantidad, int pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
        this.pTotal = obtenerPrecioTotal();
    }

    public double obtenerPrecioTotal() {
        return (this.pUnitario * this.cantidad);
    }

    public void MostrarItem() {
        System.out.println("---------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Precio Unitario: " + this.pUnitario);
        System.out.println("Precio Total: " + this.pTotal);
    }


}
