package Logica;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    public void atacarPunoFuego() {
        System.out.println("Hola soy Charmander y ataco con Puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y ataco con Ascuas");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y ataco con Lanza llamas");
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Hola soy Charmander y ataco con Placaje");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Hola soy Charmander y ataco con Arañazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Hola soy Charmander y ataco con Mordisco");
    }
}
