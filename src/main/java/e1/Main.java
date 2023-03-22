package e1;

public class Main {
    public static void main(String[] args) {

        Personaje personaje = new PersonajeBase("Jugador1", 1);
        System.out.println("Personaje base:");
        imprimirEstadisticas(personaje);

        personaje = new ArmaDecorator(personaje);
        System.out.println("\nPersonaje "+personaje.getNombre()+" con arma:");
        imprimirEstadisticas(personaje);

        personaje = new EscudoDecorator(personaje);
        System.out.println("\nPersonaje "+personaje.getNombre()+" con escudo:");
        imprimirEstadisticas(personaje);

        personaje = new CuracionDecorator(personaje);
        System.out.println("\nPersonaje "+personaje.getNombre()+" con curación:");
        imprimirEstadisticas(personaje);
    }

    private static void imprimirEstadisticas(Personaje personaje) {
        System.out.println("Nombre: " + personaje.getNombre());
        System.out.println("Nivel: " + personaje.getNivel());
        System.out.println("Armadura: " + personaje.getArmadura());
        System.out.println("Ataque: " + personaje.getAtaque());
        System.out.println("Defensa: " + personaje.getDefensa());
        System.out.println("Regeneración: " + personaje.getRegeneracion());
    }
}