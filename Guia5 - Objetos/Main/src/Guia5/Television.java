package Guia5;

public class Television extends Electrodomestico {
    // CONSTANTES Y GUIAS PARA COMPROBAR ----------------------------------

    protected static final int RESOLUCION = 20;
    protected static final boolean TDT = false;

    // ATRIBUTOS ----------------------------------

    protected int resolucion;
    protected boolean tdt;

    // BUILDERS ----------------------------------

    public Television() {
        super();
    }

    public Television(int precio, double peso) {
        super(precio, peso);
    }

    public Television(int precio_base, String color, Character consumo, double peso, int resolucion, boolean tdt) {
        super(precio_base, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    // GETTERS & SETTERS ----------------------------------

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    // METODOS ----------------------------------

    private void precioFinal() {
        if (getResolucion() > 40) {
            setPrecio_base(getPrecio_base() + (int) (getPrecio_base() * 0.3));
        }

        if (isTdt()) {
            setPrecio_base(getPrecio_base() + 50);
        }
    }

}
