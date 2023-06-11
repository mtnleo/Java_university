package Parcial;

public class PlantelExcedidoException extends IndexOutOfBoundsException {
    // CONSTRUCTOR

    public PlantelExcedidoException() {
        super("Tamanio maximo del plantel excedido");
    }

    public PlantelExcedidoException(String message) {
        super(message);
    }

}
