package e2;

public class Main {
    public static void main(String[] args) {
        Instalacion instalacionElectrica = new InstalacionElectrica(220, 10, 1000);
        FormaPago pagoEfectivo = new PagoEfectivo(instalacionElectrica);

        System.out.println("Instalación eléctrica - Pago en efectivo: " + pagoEfectivo.obtenerPrecioConDescuento());

        Instalacion instalacionAgua = new InstalacionAgua(5, 1000, 2000);
        FormaPago pagoTransferencia = new PagoTransferencia(instalacionAgua);

        System.out.println("Instalación de agua - Pago en efectivo: " + pagoTransferencia.obtenerPrecioConDescuento());

        Instalacion instalacionAlcantarillado = new InstalacionAlcantarillado("PVC", 200, 3000);
        FormaPago pagoEmpresa = new PagoEmpresa(instalacionAlcantarillado);

        System.out.println("Instalación de alcantarillado - Pago por app empresa: " + pagoEmpresa.obtenerPrecioConDescuento());
    }
}