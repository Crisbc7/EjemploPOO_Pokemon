package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y ataco con Impactrueno");
    }

    @Override
    public void atacarPunotrueno() {
        System.out.println("Hola soy Pikachu y ataco con Puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola soy Pikachu y ataco con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy Pikachu y ataco con Rayo carga");
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Hola soy Pikachu y ataco con Placaje");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Hola soy Pikachu y ataco con Arañazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Hola soy Pikachu y ataco con Mordisco");
    }
}
