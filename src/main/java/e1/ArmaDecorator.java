package e1;

public class ArmaDecorator extends Habilidad {
    public ArmaDecorator(Personaje personaje) {
        super(personaje);
    }

    @Override
    public int getAtaque() {
        return (int) (super.getAtaque() +30);
    }

    @Override
    public int getNivel() {
        return super.getNivel() *2;
    }
}
