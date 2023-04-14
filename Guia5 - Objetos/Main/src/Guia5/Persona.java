package Guia5;

import java.util.Random;


public class Persona {
    protected String nombre;
    protected int edad;
    protected String dni;
    protected char sexo;
    protected double peso;
    protected double altura;

    public int UNDERWEIGHT = -1;
    public int LITTLE_UNDERWEIGHT = 0;
    public int OVERWEIGHT = 1;


    // CONSTRUCTORES ----------------------------------------------

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generaDNI();
        this.sexo = 'm';
        this.peso = 0;
        this.altura = 0;
    }

    // GETTERS AND SETTERS ----------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // METODOS ----------------------------------------------

    public int calcularIMC() {
        int formula = (int) (getPeso() / (getAltura() * getAltura()));
        if (formula < 20) {
            formula = UNDERWEIGHT;
        }
        else if(formula <= 25) {
            formula = LITTLE_UNDERWEIGHT;
        }
        else {
            formula = OVERWEIGHT;
        }
        return formula;
    }

    public boolean esMayorDeEdad() {
        return getEdad() >= 18;
    }

    private String comprobarSexo(String sexo) {
        String sexo_ret = sexo;
        if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("h")) {
            sexo_ret = "m";
        }
        return sexo_ret;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private String generaDNI() {
        int minimo = 50000000;
        int maximo = 99999999;
        Random random = new Random();
        return String.valueOf(random.nextInt(maximo - minimo + 1) + minimo);
    }

    public String informeIMC() {
        int imc = calcularIMC();
        String msj;
        if(imc == -1) {
            msj = "Esta muy underweight";
        }
        else if(imc == 0) {
            msj = "Peso ideal";
        }
        else {
            msj = "Esta overweight";
        }
        return msj;
    }
}
