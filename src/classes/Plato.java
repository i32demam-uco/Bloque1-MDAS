package classes;

public class Plato {

    private String nombre;
    private float precio;
    private TipoPlato tipo;
    private TipoAcompanamiento acompanamiento;

    public Plato(String nombre, float precio, TipoPlato tipo, TipoAcompanamiento acompanamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.acompanamiento = acompanamiento;
    }

    public void asignarPrecio(float nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public TipoPlato getTipo() {
        return tipo;
    }

    public TipoAcompanamiento getAcompanamiento() {
        return acompanamiento;
    }
}
