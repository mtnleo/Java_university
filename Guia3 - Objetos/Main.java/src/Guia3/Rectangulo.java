package Guia3;

public class Rectangulo extends Figura {
    protected double alto;
    protected double ancho;
    protected double area;
    protected double perimetro;

    // BUILDER/CONSTRUCTOR -------------------------------------------------------

    public Rectangulo() {
        super();
        this.alto = 2;
        this.ancho = 2;
        this.area = CalcularArea();
        this.perimetro = CalcularPerimetro();
    }

    public Rectangulo(String color, double alto, double ancho) {
        super(color);
        this.alto = alto;
        this.ancho = ancho;
        this.area = CalcularArea();
        this.perimetro = CalcularPerimetro();
    }

    // GETTERS AND SETTER -------------------------------------------------------

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    // METODOS -------------------------------------------------------

    public double CalcularArea() {
        return getAlto() * getAncho();
    }

    public double CalcularPerimetro() {
        return getAlto() * 2 + getAncho() * 2;
    }

    public void Mostrar() {
        System.out.println("-------- RECTANGULO --------");
        System.out.println("Ancho: " + getAncho());
        System.out.println("Alto: " + getAlto());
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
