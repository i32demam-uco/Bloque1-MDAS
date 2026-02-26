package classes;

public class FactoriaParaLlevar extends FactoriaAbstracta {

    private float aplicarIncremento(float precio) {
        return precio * 1.02f;
    }

    @Override
    public Menu crearMenuSemanal(TipoAcompanamiento acompanamiento) {

        Menu menu = new MenuSemanal();

        // Primero (+2%)
        Plato primero = new Plato(
                "Ensalada",
                aplicarIncremento(10),
                TipoPlato.primero,
                null
        );

        // Segundo (+2%) con acompañamiento
        Plato segundo = new Plato(
                "Filete",
                aplicarIncremento(15),
                TipoPlato.segundo,
                acompanamiento
        );

        menu.asignarPlato(primero);
        menu.asignarPlato(segundo);

        return menu;
    }

    @Override
    public Menu crearMenuTemporada() {

        Menu menu = new MenuTemporada();

        // Solo un primer plato (+2%)
        Plato especial = new Plato(
                "Cocido especial",
                aplicarIncremento(20),
                TipoPlato.primero,
                null
        );

        menu.asignarPlato(especial);

        return menu;
    }
}
