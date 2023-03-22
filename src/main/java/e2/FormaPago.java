package e2;

public abstract class FormaPago {
    protected Instalacion instalacion;

    public FormaPago(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    public abstract double obtenerDescuento();

    public double obtenerPrecioConDescuento() {
        return instalacion.obtenerPrecio() * (1 - obtenerDescuento());
    }
}
