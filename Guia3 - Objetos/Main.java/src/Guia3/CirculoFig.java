package Guia3;

public class CirculoFig extends Figura {
    protected double radio;
    protected double area;
    protected double perimetro;

    // BUILDER/CONSTRUCTOR -------------------------------------------------------

    public CirculoFig() {
        super();
        this.radio = 3;
        this.perimetro = CalcularPerimetro();
        this.area = CalcularArea();
    }

    public CirculoFig(String color, double radio) {
        super();
        this.radio = radio;
        this.perimetro = CalcularPerimetro();
        this.area = CalcularArea();
    }

    // GETTERS AND SETTER -------------------------------------------------------

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // METODOS -------------------------------------------------------

    public double CalcularArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    public double CalcularPerimetro() {
        return (2 * Math.PI) * getRadio();
    }

    public void Mostrar() {
        System.out.println("-------- CIRCULO --------");
        System.out.println("Radio: " + getRadio());
        if (isColored()) {
            System.out.println("Color: " + getColor());
        }
        else
        {
            System.out.println("Color: " + "Ninguno");
        }
        System.out.println("Area: " + CalcularArea());
        System.out.println("Perimetro: " + CalcularPerimetro());
    }

}
