package Guia5;

public class Lavadora extends Electrodomestico {
    // CONSTANTES Y GUIAS PARA COMPROBAR ----------------------------------

    protected static final int CARGA = 5;

    // ATRIBUTOS ----------------------------------

    protected int carga;

    // BUILDERS ----------------------------------

    public Lavadora() {
        super();
        this.carga = CARGA;
        precioFinal();
    }

    public Lavadora(int precio, double peso) {
        super(precio, peso);
        this.carga = CARGA;
        precioFinal();
    }

    public Lavadora(int precio_base, String color, Character consumo, double peso, int carga) {
        super(precio_base, color, consumo, peso);
        this.carga = carga;
        precioFinal();
    }

    // GETTERS & SETTERS ----------------------------------

    public int getCarga() {
        return carga;
    }

    // METODOS ----------------------------------

    private void precioFinal() {
        if (getCarga() > 30) {
            setPrecio_base(getPrecio_base() + 50);
        }
    }

}
