package VideoStore;

import java.time.LocalDate;

public class Factura {
    Pelicula pelicula;
    Cliente cliente;
    LocalDate fecha_retirado;
    LocalDate fecha_vencimiento;
    boolean devuelto;

    // GETTERS & SETTERS ---------------------------------------------------

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    // BUILDER ---------------------------------------------------

    public Factura(Pelicula pelicula, Cliente cliente) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fecha_retirado = LocalDate.now();
        this.fecha_vencimiento = LocalDate.now().plusDays(7);
        this.devuelto = false;
    }

    // METODOS ---------------------------------------------------

    public void DisminuirCopias() {
        pelicula.setCopias(pelicula.getCopias() - 1);
    }

    public void AumentarVecesAlquilada() {
        pelicula.setVeces_alquilada(pelicula.getVeces_alquilada() - 1);
    }

    public void AnotarDevolucion() {
        setDevuelto(true);
    }

}
