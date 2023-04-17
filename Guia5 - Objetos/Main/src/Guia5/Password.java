package Guia5;

import java.util.Random;

public class Password {
    protected int longitud;
    protected String password;
    private String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+=-<>";

    // CONSTRUCTORES ----------------------------------

    public Password() {
        this.longitud = 8;
        this.password = CrearContrasenia(8);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.password = CrearContrasenia(longitud);
    }

    // GETTERS & SETTERS ----------------------------------

    public int getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    // METODOS ----------------------------------

    private String CrearContrasenia(int longitud) {
        String contra = "";
        int characters_length = characters.length();
        Random rand = new Random();

        for (int i = 0; i < longitud; i++) {
            contra = contra.concat(String.valueOf(characters.charAt(rand.nextInt(characters_length))));
        }

        return contra;
    }

    public boolean esFuerte() {
        int minus = 0;
        int mayus = 0;
        int numeros = 0;
        String pass = getPassword();
        boolean fuerte = false;

        for(int i = 0; i < getLongitud(); i++) {
            if (Character.isLowerCase(pass.charAt(i))) {
                minus++;
            }
            else if (Character.isUpperCase(pass.charAt(i))) {
                mayus++;
            }
            else if (Character.isDigit(pass.charAt(i))) {
                numeros++;
            }
        }

        if (minus >= 1 && mayus >= 2 && numeros >= 5) {
            fuerte = true;
        }

        return fuerte;
    }

}
