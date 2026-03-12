package Composite;

import java.util.ArrayList;
import java.util.List;

// ClaseComposite: Representa salas, edificios o el campus [cite: 13, 23]
public class Espacio implements Componente {
    private String nombre;
    private List<Componente> hijos = new ArrayList<>(); // Agregación [cite: 8]

    public Espacio(String nombre) {
        this.nombre = nombre;
    }

    public void añadir(Componente componente) {
        hijos.add(componente);
    }

    public void eliminar(Componente componente) {
        hijos.remove(componente);
    }

    @Override
    public double calcularGasto() {
        double total = 0;
        // Calcula el gasto acumulado de todos los elementos internos [cite: 23]
        for (Componente c : hijos) {
            total += c.calcularGasto();
        }
        return total;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}