package e2;

public class InstalacionAlcantarillado implements Instalacion {
    private String material;
    private double diametro;
    private double precio;

    public InstalacionAlcantarillado(String material, double diametro, double precio) {
        this.material = material;
        this.diametro = diametro;
        this.precio = precio;
    }

    @Override
    public double obtenerPrecio() {
        return precio;
    }
}
