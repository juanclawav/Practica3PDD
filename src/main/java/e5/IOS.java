package e5;

public class IOS implements Empresa1 {
    private String nombre;
    private double version;

    public IOS(String nombre) {
        this.nombre = nombre;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public void login() {
            System.out.println("Logged into IOS: " + getNombre());

    }

    @Override
    public void logout() {
            System.out.println("Logged out of IOS: " + getNombre());
    }

    @Override
    public void reportes(){
        System.out.println("Reportes generados");
    }
}
