package e1;

public class PersonajeBase implements Personaje {
    private String nombre;
    private int nivel;
    private int armadura;
    private int ataque;
    private int defensa;
    private int regeneracion;

    public PersonajeBase(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.armadura = 1;
        this.ataque = 1;
        this.defensa = 1;
        this.regeneracion = 1;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public int getArmadura() {
        return armadura;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public int getRegeneracion() {
        return regeneracion;
    }
}
