package Practica;

public class BiomaNoExisteException extends Exception {
    public BiomaNoExisteException() {
        super("|X| Ese bioma no esta comprendido en este parque nacional |X|");
    }
}
