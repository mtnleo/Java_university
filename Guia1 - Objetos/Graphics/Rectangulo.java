package Graphics;

public class Rectangulo {
    float ancho = 1;
    float alto = 1;

    public float getAlto(){
        return alto;
    }    
    public float getAncho(){
        return ancho;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }

    public float area() {
        float area = getAlto() * getAncho();
        return area;
    }

    public float perimetro() {
        float perimetro = 2 * getAlto() + 2 * getAncho();
        return perimetro;
    }
}
