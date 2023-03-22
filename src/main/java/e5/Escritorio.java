package e5;

public class Escritorio implements Empresa2 {

    private String nombre;
    private double lanzamiento;

    public Escritorio(String nombre) {
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
            System.out.println("Iniciando sesion en aplicación de escritorio: " + getNombre());
    }

    @Override
    public void cerrarSesion() {
            System.out.println("Cerrando sesion de aplicación de escritorio: " + getNombre());
    }

    @Override
    public void generarDatos() {
        System.out.println("Datos generados");
    }
}
