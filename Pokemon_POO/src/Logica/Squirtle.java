package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y estoy atacando con Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squritle y estoy atacando con Pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squritle y estoy atacando con Burbujas");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squritle y estoy atacando con Hidropulso");
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Hola soy Squritle y estoy atacando con Placaje");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Hola soy Squritle y estoy atacando con Arañazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Hola soy Squritle y estoy atacando con Mordisco");
    }
}
