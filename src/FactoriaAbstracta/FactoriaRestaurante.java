package classes;

public class FactoriaRestaurante extends FactoriaAbstracta {

    @Override
    public Menu crearMenuSemanal(TipoAcompanamiento acompanamiento) {

        Menu menu = new MenuSemanal();

        // Primero
        Plato primero = new Plato(
                "Ensalada",
                10,
                TipoPlato.primero,
                null
        );

        // Segundo con acompañamiento
        Plato segundo = new Plato(
                "Filete",
                15,
                TipoPlato.segundo,
                acompanamiento
        );

        // Postre
        Plato postre = new Plato(
                "Flan",
                5,
                TipoPlato.postre,
                null
        );

        menu.asignarPlato(primero);
        menu.asignarPlato(segundo);
        menu.asignarPlato(postre);

        return menu;
    }

    @Override
    public Menu crearMenuTemporada() {

        Menu menu = new MenuTemporada();

        // Solo un primer plato
        Plato especial = new Plato(
                "Cocido especial",
                20,
                TipoPlato.primero,
                null
        );

        menu.asignarPlato(especial);

        return menu;
    }
}
