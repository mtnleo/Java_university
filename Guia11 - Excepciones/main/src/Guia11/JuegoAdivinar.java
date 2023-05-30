package Guia11;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {
    /// ATRIBUTOS

    private int intentos;
    private int numero;

    /// CONSTRUCTOR

    public JuegoAdivinar() {
        this.intentos = 0;
        this.numero = this.getRandomInt();
    }


    /// METODOS

    private int getRandomInt() {
        Random rand = new Random();
        return rand.nextInt(0, 501);
    }

    public void mainLoop() {
        boolean gano = false;

        Scanner scan = new Scanner(System.in);


        while (!gano) {
            System.out.println("Escribe un numero: ");
            int num_guess;

            try {
                num_guess = scan.nextInt();
                gano = makeGuess(num_guess);
            }
            catch(InputMismatchException e) {
                this.intentos += 1;
                System.out.println("Escriba un numero solo.");
                scan.next();
            }

        }
    }

    private boolean makeGuess(int guess) {
        this.intentos += 1;
        if (guess > numero) {
            System.out.println("El numero que buscas es MENOR");
        } else if (guess < numero) {
            System.out.println("El numero que buscas es MAYOR");
        } else {
            System.out.println("Felicitaciones! El numero correcto era " + numero + ". Solo te llevo " + intentos + " intentos!");
            return true;
        }
        return false;
    }
}
