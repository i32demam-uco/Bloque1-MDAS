package Adapter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        prepararFicherosPrueba();

        InterfazRequerida maquetador = new MaquetacionAvanzada();

        System.out.println("--- Iniciando pruebas del Maquetador Avanzado ---");

        System.out.println("\n1. Uniendo 'fichero2.txt' al final de 'fichero1.txt'...");
        maquetador.unirFicheros("fichero1.txt", "fichero2.txt");
        System.out.println("   -> Operación completada.");

        System.out.println("\n2. Combinando e intercalando párrafos en 'destino_intercalado.txt'...");
        int[] iniciosF1 = {1, 3};
        int[] finesF1 = {2, 4};
        int[] iniciosF2 = {1, 3}; 
        int[] finesF2 = {2, 3};
        maquetador.combinarContenidos("fichero1.txt", "fichero2.txt", iniciosF1, finesF1, iniciosF2, finesF2, "destino_intercalado.txt");
        System.out.println("   -> Operación completada.");

        System.out.println("\n3. Separando 'fichero_origen.txt' en varios fragmentos...");
        int[] lineasDeCorte = {3, 5};
        String[] ficherosDestino = {"parte1.txt", "parte2.txt", "parte3.txt"};
        maquetador.separarFicheros("fichero_origen.txt", lineasDeCorte, ficherosDestino);
        System.out.println("   -> Operación completada.");

        System.out.println("\n¡Pruebas finalizadas! Revisa los archivos de texto generados en la raíz de tu proyecto.");
    }

    private static void prepararFicherosPrueba() {
        try {
            escribirFichero("fichero1.txt", "F1 - Linea 1\nF1 - Linea 2\nF1 - Linea 3\nF1 - Linea 4\n");
            escribirFichero("fichero2.txt", "F2 - Linea 1\nF2 - Linea 2\nF2 - Linea 3\n");
            escribirFichero("fichero_origen.txt", "Origen - Linea 1\nOrigen - Linea 2\nOrigen - Linea 3\nOrigen - Linea 4\nOrigen - Linea 5\nOrigen - Linea 6\n");
        } catch (IOException e) {
            System.err.println("Error al crear los ficheros de prueba: " + e.getMessage());
        }
    }

    private static void escribirFichero(String ruta, String contenido) throws IOException {
        try (FileWriter fw = new FileWriter(ruta)) {
            fw.write(contenido);
        }
    }
}