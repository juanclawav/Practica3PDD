package e2;

public class InstalacionElectrica implements Instalacion {
    private double voltaje;
    private double corriente;
    private double precio;

    public InstalacionElectrica(double voltaje, double corriente, double precio) {
        this.voltaje = voltaje;
        this.corriente = corriente;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }
}
