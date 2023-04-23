package Fortnite;

public class Jugador extends Persona implements ParticipaPartida {
    /// ATRIBUTOS --------------------------

    protected String posicion;
    protected String nickname;
    protected int victorias;

    /// CONSTRUCTORS --------------------------

    public Jugador() {
        super();
        this.posicion = "";
        this.nickname = "";
        this.victorias = 0;
    }

    public Jugador(String nombre, String apellido, int edad, String localidad, String posicion, String nickname, int victorias) {
        super(nombre, apellido, edad, localidad);
        this.posicion = posicion;
        this.nickname = nickname;
        this.victorias = victorias;
    }

    /// GETTERS AND SETTERS --------------------------

    /// METODO DE INTERFAZ --------------------------

    @Override
    public boolean participarPartida(Object a) {
        return a instanceof Jugador;
    }

    /// METODOS --------------------------

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion='" + posicion + '\'' +
                ", nickname='" + nickname + '\'' +
                ", victorias=" + victorias +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
