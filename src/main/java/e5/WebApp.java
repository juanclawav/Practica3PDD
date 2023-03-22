package e5;

public class WebApp implements Empresa2 {

    private String nombre;
    private double lanzamiento;

    public WebApp(String nombre) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(double lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    @Override
    public void iniciarSesion() {
            System.out.println("Sesion iniciada en la Web " + getNombre());
    }

    @Override
    public void cerrarSesion() {
            System.out.println("Sesion cerrada en la Web: " + getNombre());
    }

    @Override
    public void generarDatos() {
        System.out.println("Datos generados");

    }
}
