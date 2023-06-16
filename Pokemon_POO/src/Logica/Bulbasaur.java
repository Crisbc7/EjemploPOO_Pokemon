package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y voy a atacar con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y voy a atacar con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y voy a atacar con Hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y voy a atacar con Latigo cepa");
    }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Hola soy Bulbasaur y voy a atacar con Placaje");
    }

    @Override
    protected void ataqueAraniazo() {
        System.out.println("Hola soy Bulbasaur y voy a atacar con Arañazo");
    }

    @Override
    protected void ataqueMordisco() {
        System.out.println("Hola soy Bulbasaur y voy a atacar con Mordisco");
    }
}
