package Guia3;

public class Figura {
    protected boolean coloreada;
    protected String color;

    // BUILDER/CONSTRUCTOR -------------------------------------------------------

    public Figura() {
        this.coloreada = false;
    }

    public Figura(String color) {
        this.coloreada = true;
        this.color = color;
    }

    // METODOS -------------------------------------------------------

    public boolean isColored() {
        return this.coloreada;
    }

    public String getColor() {
        if (isColored()) {
            return this.color;
        }
        return null;
    }
}
