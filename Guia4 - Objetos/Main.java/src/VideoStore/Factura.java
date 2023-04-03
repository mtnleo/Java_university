package VideoStore;

import java.time.LocalDate;

public class Factura {
    Pelicula pelicula;
    Cliente cliente;
    LocalDate fecha_retirado;
    LocalDate fecha_vencimiento;



    // METODOS ---------------------------------------------------

    private void DisminuirCopias() {
        pelicula.setCopias(pelicula.getCopias() - 1);
    }

}
