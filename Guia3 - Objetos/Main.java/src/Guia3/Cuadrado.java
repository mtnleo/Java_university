package Guia3;

public class Cuadrado extends Rectangulo {

    // BUILDER/CONSTRUCTOR -------------------------------------------------------

    public Cuadrado() {
        super();
    }

    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

    // METODOS -------------------------------------------------------

    public void Mostrar() {
        System.out.println("-------- CUADRADO --------");
        System.out.println("Tamanio lado: " + getAncho());
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
