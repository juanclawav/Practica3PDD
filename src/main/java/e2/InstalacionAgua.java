package e2;

public class InstalacionAgua implements Instalacion {
    private double presion;
    private double volumen;
    private double precio;

    public InstalacionAgua(double presion, double volumen, double precio) {
        this.presion = presion;
        this.volumen = volumen;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }
}
