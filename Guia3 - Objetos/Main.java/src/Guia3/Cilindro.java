package Guia3;

public class Cilindro extends Circulo {
    protected double altura = 1.0;
    protected double volumen = CalcularVolumen();

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro() {
        super();
        this.altura = 1;
        this.volumen = CalcularVolumen();
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
        this.volumen = CalcularVolumen();
    }

    public double CalcularVolumen() {
        return super.CalcularArea() * getAltura();
    }

    public void MostrarDatosCilindro() {
        super.MostrarDatosCirculo();
        System.out.println("Altura: " + getAltura());
        System.out.println("Volumen: " + getVolumen());
    }

    public double CalcularArea() {
        return ((2 * Math.PI) * (getRadio() * getAltura()) + (2 * super.CalcularArea()));
    }
}
