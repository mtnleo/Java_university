package ClasesParcial;


public class Oficina extends Propiedad {
    // ATRIBUTOS ------------------------------------------

    private final int boxes;

    // CONSTRUCTORES ------------------------------------------

    public Oficina(String direccion, Persona propietario, int precioBase, int boxes) {
        super(direccion, propietario, precioBase, precioBase);
        super.setCostoVenta(calcularCostoVenta(precioBase, boxes));
        this.boxes = boxes;
    }

    // GETTERS & SETTERS ------------------------------------------

    // METODOS ------------------------------------------

        /// IMPLEMENTACION METODO SUPERCLASE

    protected int calcularCostoVenta(int precioBase, int unidades) {
        return precioBase * unidades;
    }

        /// TOSTRING Y EQUALS

    @Override
    public String toString() {
        return "******* Oficina ********" +
                super.toString() +
                "\nboxes = " + boxes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oficina oficina = (Oficina) o;
        return boxes == oficina.boxes;
    }

}
