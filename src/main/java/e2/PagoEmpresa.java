package e2;

public class PagoEmpresa extends FormaPago {
    public PagoEmpresa(Instalacion instalacion) {
        super(instalacion);
    }

    @Override
    public double obtenerDescuento() {
        return 0.1;
    }
}
