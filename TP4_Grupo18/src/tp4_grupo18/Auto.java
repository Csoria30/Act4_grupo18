package tp4_grupo18;

public class Auto {
    private String patente;
    private String modelo;
    private double combustible;

    public Auto(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.combustible = 50; // Tanque lleno
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCombustible() {
        return combustible;
    }
}