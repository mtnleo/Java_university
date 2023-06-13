package Parcial2;

public class MaterialNoDisponibleException extends Exception{
    public MaterialNoDisponibleException() {
        super("Ese material ya esta prestado");
    }
}
