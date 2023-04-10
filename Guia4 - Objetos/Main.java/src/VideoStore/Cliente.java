package VideoStore;

public class Cliente {
    protected String nombre;
    protected String telefono;
    protected String direccion;

    Factura[] facturas;

    // GETTERS & SETTERS ---------------------------------------------------



    // BUILDER ---------------------------------------------------

    public Cliente(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.facturas = new Factura[20];
    }

    // METODOS ---------------------------------------------------


}
