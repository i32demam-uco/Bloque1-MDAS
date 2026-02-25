package classes;

public class Main {

    public static void main(String[] args) {
        
        // 1. Instanciamos las dos factorías concretas
        FactoriaAbstracta factoriaRestaurante = new FactoriaRestaurante();
        FactoriaAbstracta factoriaParaLlevar = new FactoriaParaLlevar();

        // 2. Pruebas de consumición en el Restaurante
        System.out.println("=== PEDIDOS PARA CONSUMIR EN RESTAURANTE ===");
        Menu menuSemanalRestaurante = factoriaRestaurante.crearMenuSemanal(TipoAcompanamiento.patatas);
        Menu menuTemporadaRestaurante = factoriaRestaurante.crearMenuTemporada();

        imprimirDetallesMenu("Menú Semanal (Restaurante)", menuSemanalRestaurante);
        imprimirDetallesMenu("Menú de Temporada (Restaurante)", menuTemporadaRestaurante);

        // 3. Pruebas de consumición Para Llevar
        System.out.println("=== PEDIDOS PARA LLEVAR (+2% de incremento) ===");
        Menu menuSemanalLlevar = factoriaParaLlevar.crearMenuSemanal(TipoAcompanamiento.ensalada);
        Menu menuTemporadaLlevar = factoriaParaLlevar.crearMenuTemporada();

        imprimirDetallesMenu("Menú Semanal (Para llevar)", menuSemanalLlevar);
        imprimirDetallesMenu("Menú de Temporada (Para llevar)", menuTemporadaLlevar);
    }

    // Método auxiliar para mostrar los platos y el precio total de un menú
    private static void imprimirDetallesMenu(String titulo, Menu menu) {
        System.out.println("--- " + titulo + " ---");
        
        for (Plato plato : menu.obtenerPlatos()) {
            String extra = (plato.getAcompanamiento() != null) ? " (con " + plato.getAcompanamiento() + ")" : "";
            System.out.printf("- %s [%s]%s: %.2f euros\n", 
                    plato.getNombre(), plato.getTipo(), extra, plato.getPrecio());
        }
        
        System.out.printf("Precio total: %.2f euros\n\n", menu.calcularPrecio());
    }
}    