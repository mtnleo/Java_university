package Practica;

public enum PeligroExtincion {
    EXTINTO("Extinto"),
    PELIGRO("Peligro"),
    VULNERABLE("Vulnerable"),
    BIEN("No esta en peligro");

    private final String abreviatura;

    private PeligroExtincion(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura() {
        return abreviatura;
    }
}
