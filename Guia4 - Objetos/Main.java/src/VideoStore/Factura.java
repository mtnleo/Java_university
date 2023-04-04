package VideoStore;

import java.time.LocalDate;

public class Factura {
    Pelicula pelicula;
    Cliente cliente;
    LocalDate fecha_retirado;
    LocalDate fecha_vencimiento;


    public Factura(Pelicula pelicula, Cliente cliente) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fecha_retirado = LocalDate.now();
        this.fecha_vencimiento = LocalDate.now().plusDays(7);
    }

    // METODOS ---------------------------------------------------

    private void DisminuirCopias() {
        pelicula.setCopias(pelicula.getCopias() - 1);
    }

    private void AumentarVecesAlquilada() {
        pelicula.setVeces_alquilada(pelicula.getVeces_alquilada() - 1);
    }

}
