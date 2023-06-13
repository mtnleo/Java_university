package Parcial2;


public class Libro extends Material implements Alquilar{
    // ATRIBUTOS
    private int numPaginas;

    // CONSTRUCTORES

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion, int cantEjemplares, int numPaginas) {
        super(titulo, autor, anioPublicacion, cantEjemplares);
        this.numPaginas = numPaginas;
    }

    // GETTERS/SETTERS

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    // METODOS

    @Override
    public boolean prestar() {
        boolean prestado = false;
        if (checkDisponibilidad()) {
            prestado = true;
            super.setCantEjemplares(super.getCantEjemplares() - 1);
            if (super.getCantEjemplares() == 0) {
                super.setDisponibilidad(false);
            }
        }

        return prestado;
    }

    @Override
    public void devolver() {
        super.setCantEjemplares(super.getCantEjemplares() + 1);
        if (!checkDisponibilidad()) {
            super.setDisponibilidad(true);
        }
    }

    @Override
    public String toString() {
        return "| Libro -------------" +
                super.toString() +
                "\nNumero de Paginas = " + numPaginas;
    }
}
