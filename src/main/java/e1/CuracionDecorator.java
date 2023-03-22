package e1;

public class CuracionDecorator extends Habilidad {
    public CuracionDecorator(Personaje personaje) {
        super(personaje);
    }

    @Override
    public int getRegeneracion() {
        return super.getRegeneracion() +80;
    }
}
