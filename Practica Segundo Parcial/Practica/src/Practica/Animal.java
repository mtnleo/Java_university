package Practica;

public class Animal {
    // ATRIBUTOS
    private String nombre;
    private String tipo;
    private String habitat;
    private int poblacion;
    private PeligroExtincion peligro;

    // CONSTRUCTOR
    public Animal(String nombre, String tipo, String habitat, int poblacion, PeligroExtincion peligro) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.habitat = habitat;
        this.poblacion = poblacion;
        this.peligro = peligro;
    }

    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public PeligroExtincion getPeligro() {
        return peligro;
    }

    public void setPeligro(PeligroExtincion peligro) {
        this.peligro = peligro;
    }

    // METODOS

    @Override
    public String toString() {
        return "Animal \n" +
                "nombre: '" + nombre + '\'' +
                "\ntipo = '" + tipo + '\'' +
                "\nhabitat = '" + habitat + '\'' +
                "\npoblacion = " + poblacion +
                "\npeligro = " + peligro;
    }
}
