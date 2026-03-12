package Composite;

public class Aparato implements Componente {
    private String nombre;
    private double consumoPorHora;
    private double horasUso;

    public Aparato(String nombre, double consumoPorHora, double horasUso) {
        this.nombre = nombre;
        this.consumoPorHora = consumoPorHora;
        this.horasUso = horasUso;
    }

    @Override
    public double calcularGasto() {
        return consumoPorHora * horasUso;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
