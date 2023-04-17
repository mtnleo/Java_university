package Guia3;

public class Circulo {
    protected double radio;
    protected String color;
    protected double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double CalcularArea() {
        return Math.PI * Math.pow(getRadio(), 2);
    }


    public Circulo() {
        this.radio = 1;
        this.color = "Blanco";
        this.area = CalcularArea();
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
        this.area = CalcularArea();
    }

    public void MostrarDatosCirculo() {
        System.out.println("-------- DATOS --------");
        System.out.println("Radio: " + getRadio());
        System.out.println("Color: " + getColor());
        System.out.println("Area: " + getArea());
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
