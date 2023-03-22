package e2;

public class PagoEfectivo extends FormaPago {
    public PagoEfectivo(Instalacion instalacion) {
        super(instalacion);
    }

    @Override
    public double obtenerDescuento() {
        return 0;
    }
}
