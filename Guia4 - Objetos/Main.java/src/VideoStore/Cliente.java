package VideoStore;

public class Cliente {
    protected String nombre;
    protected String telefono;
    protected String direccion;

    Factura[] facturas;
    protected int validos_alquileres;

    // GETTERS & SETTERS ---------------------------------------------------

    public int getValidos_alquileres() {
        return validos_alquileres;
    }

    public void setValidos_alquileres(int validos_alquileres) {
        this.validos_alquileres = validos_alquileres;
    }


    // BUILDER ---------------------------------------------------

    public Cliente(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.facturas = new Factura[20];
    }

    // METODOS ---------------------------------------------------

    public void AgregarAlquilerCliente(Factura factura_agregar) {
        int val_factura = getValidos_alquileres();

        try {
            this.facturas[val_factura] = factura_agregar;
            setValidos_alquileres(val_factura + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("|X| No entran mas alquileres |X|");
        }
    }

}
