package Parcial2;

public class MaterialInexistenteException extends Exception {
    public MaterialInexistenteException() {
        super("No se encontro el material buscado");
    }
}
