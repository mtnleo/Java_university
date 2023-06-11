package Parcial;

public class NumeroEntrenadorExcedidoException extends Exception {
    public NumeroEntrenadorExcedidoException() {
        super("No se puede agregar mas de un entrenador");
    }
}
