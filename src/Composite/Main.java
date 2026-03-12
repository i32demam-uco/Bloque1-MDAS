package Composite;

public class Main {
    public static void main(String[] args) {
        // 1. Definimos aparatos individuales
        Aparato pc1 = new Aparato("PC Laboratorio", 0.2, 10); // 2 kWh
        Aparato luz1 = new Aparato("Foco Led", 0.05, 12);     // 0.6 kWh
        Aparato vending = new Aparato("Máquina Vending", 0.5, 24); // 12 kWh

        // 2. Configuramos una Sala
        Espacio sala1 = new Espacio("Sala de Computación 1");
        sala1.añadir(pc1);
        sala1.añadir(luz1);

        // 3. Configuramos un Edificio
        Espacio edificioA = new Espacio("Edificio Politécnico");
        edificioA.añadir(sala1);
        edificioA.añadir(vending);

        // 4. Configuramos el Campus (Raíz del Composite)
        Espacio campus = new Espacio("Campus Rabanales");
        campus.añadir(edificioA);

        // 5. Mostrar resultados
        System.out.println("--- Sistema de Control Energético ---");
        System.out.println("Gasto " + sala1.getNombre() + ": " + sala1.calcularGasto() + " kWh");
        System.out.println("Gasto " + edificioA.getNombre() + ": " + edificioA.calcularGasto() + " kWh");
        System.out.println("Gasto Total " + campus.getNombre() + ": " + campus.calcularGasto() + " kWh");
        
        // Ejemplo de coste total si el kWh está a 0.15€
        double costeTotal = campus.calcularGasto() * 0.15;
        System.out.println("Coste estimado total del Campus: " + costeTotal + " euros");
    }
}
