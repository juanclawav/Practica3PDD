package e2;

public class PagoTigoMoney extends FormaPago {
    public PagoTigoMoney(Instalacion instalacion) {
        super(instalacion);
    }

    @Override
    public double obtenerDescuento() {
        return 0.02;
    }
}
