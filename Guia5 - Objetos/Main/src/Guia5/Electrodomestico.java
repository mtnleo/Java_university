package Guia5;

public class Electrodomestico {

    // CONSTANTES Y GUIAS PARA COMPROBAR ----------------------------------
    protected double PESO = 5;
    protected String COLOR = "blanco";
    protected int PRECIOBASE = 100;
    protected Character CONSUMO = 'F';
    protected String[] colores_disponibles = {"blanco", "negro", "rojo", "azul", "gris"};
    protected Character[] consumos_disponibles = {'A', 'B', 'C', 'D', 'E', 'F'};

    protected int[] tabla_consumo_precios = {100, 80, 60, 50, 30, 10};
    protected int[] tabla_pesos = {19, 49, 79};
    protected int[] tabla_pesos_precios = {10, 50, 80, 100};


    // ATRIBUTOS ----------------------------------

    protected int precio_base;
    protected String color;
    protected Character consumo;
    protected double peso;


    // BUILDERS ----------------------------------

    public Electrodomestico() {
        this.precio_base = PRECIOBASE;
        this.color = COLOR;
        this.consumo = CONSUMO;
        this.peso = PESO;
    }

    public Electrodomestico(int precio, double peso) {
        this.precio_base = precio;
        this.color = COLOR;
        this.consumo = CONSUMO;
        this.peso = peso;
    }

    public Electrodomestico(int precio_base, String color, Character consumo, double peso) {
        this.precio_base = precio_base;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }


    // GETTERS & SETTERS ----------------------------------

    public int getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio_base(int precio_base) {
        this.precio_base = precio_base;
    }

    // METODOS ----------------------------------

    private Character comprobarConsumoEnergetico(Character comprobar) {
        comprobar = Character.toUpperCase(comprobar);
        boolean comprobado = false;
        for (Character chara: consumos_disponibles) {
            if (comprobar.equals(chara)) {
                comprobado = true;
                break;
            }
        }

        if(!comprobado) {
            comprobar = CONSUMO;
        }
        return comprobar;
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        boolean comprobado = false;

        for (String col_comprobado: colores_disponibles) {
            if(color.equals(col_comprobado)) {
                comprobado = true;
                break;
            }
        }

        if(!comprobado) {
            color = COLOR;
        }

        return color;
    }

    private int precioFinal() {
        int precio_final = 0;

        for (int i = 0; i < 6; i++) {
            if (consumos_disponibles[i].equals(getConsumo())) {
                precio_final += tabla_consumo_precios[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            if(getPeso() < tabla_pesos[i]) {
                precio_final += tabla_pesos_precios[i];
                break;
            }
            if (i == 2) {
                precio_final += tabla_pesos_precios[i+1];
            }
        }

        return precio_final;
    }

}
