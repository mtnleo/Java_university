package Guia6;

public class Numero implements Relaciones {
    /// ATRIBUTOS ----------------------------------

    private final int numero;

    /// CONSTRUCTOR ----------------------------------

    public Numero(final int numero) {
        this.numero = numero;
    }

    /// GETTERS AND SETTERS ----------------------------------

    public int getNumero() {
        return numero;
    }

    /// METODOS DE LA INTERFAZ ----------------------------------

    public boolean esMayor(Object b) {
        boolean mayor = false;
        if (b instanceof Numero) {
            if (getNumero() > ((Numero)b).getNumero()) {
                mayor = true;
            }
        }

        return mayor;
    }

    public boolean esMenor(Object b) {
        boolean menor = false;
        if (b instanceof Numero) {
            if (getNumero() < ((Numero)b).getNumero()) {
                menor = true;
            }
        }

        return menor;
    }

    public boolean esIgual(Object b) {
        boolean igual = false;
        if (b instanceof Numero) {
            if (getNumero() == ((Numero)b).getNumero()) {
                igual = true;
            }
        }
        return igual;
    }


}
