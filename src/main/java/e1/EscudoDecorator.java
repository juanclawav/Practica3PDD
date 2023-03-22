package e1;

public class EscudoDecorator extends Habilidad {
    public EscudoDecorator(Personaje personaje) {
        super(personaje);
    }

    @Override
    public int getDefensa() {
        return (int) (super.getDefensa() + 35);
    }

    @Override
    public int getArmadura() {
        return (int) (super.getArmadura() +10);
    }
}
