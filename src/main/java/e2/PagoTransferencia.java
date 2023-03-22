package e2;

public class PagoTransferencia extends FormaPago {
    public PagoTransferencia(Instalacion instalacion) {
        super(instalacion);
    }

    @Override
    public double obtenerDescuento() {
        return 0.05;
    }
}
