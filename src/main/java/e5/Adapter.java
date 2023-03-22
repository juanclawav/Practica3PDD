package e5;

public class Adapter implements Empresa1 {

    private Empresa2 adaptee;

    public Adapter(Empresa2 adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void login() {
        adaptee.cerrarSesion();
    }

    @Override
    public void logout() {
        adaptee.cerrarSesion();
    }

    @Override
    public void reportes() {
        adaptee.generarDatos();
    }
}
