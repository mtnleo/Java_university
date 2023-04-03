package VideoStore;

public class Cliente {
    protected String nombre;
    protected String telefono;
    protected String direccion;

    Factura[] facturas;

    // GETTERS & SETTERS ---------------------------------------------------



    // BUILDER ---------------------------------------------------

    public Cliente{
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // METODOS ---------------------------------------------------

    public Factura GenerarFactura(Pelicula pelicula) {
        if (pelicula.check_disponibilidad_pelicula()) {
            //AGREGAR FACTURA AL ARREGLO
        }
        else {
            return null;
        }
    }

}
