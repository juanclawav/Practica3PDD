package e1;

public class Habilidad implements Personaje {

    private Personaje personaje;

    public Habilidad(Personaje personaje){
        this.personaje=personaje;
    }
    @Override
    public String getNombre() {
        return personaje.getNombre();
    }

    @Override
    public int getNivel() {return personaje.getNivel();
    }
    @Override
    public int getArmadura() {
        return personaje.getArmadura();
    }
    @Override
    public int getAtaque() {
        return personaje.getAtaque();
    }
    @Override
    public int getDefensa() {
        return personaje.getDefensa();
    }
    @Override
    public int getRegeneracion() {
        return personaje.getRegeneracion();
    }
}
