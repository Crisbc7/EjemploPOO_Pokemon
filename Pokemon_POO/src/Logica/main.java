package Logica;

public class main{

    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();

        pikachu.ataquePlacaje();
        pikachu.atacarImpactrueno();

        bulbasaur.ataqueMordisco();
        bulbasaur.atacarLatigoCepa();

        squirtle.atacarPistolaAgua();
        squirtle.ataqueAraniazo();

        charmander.ataquePlacaje();
        charmander.atacarLanzaLlamas();
    }
}
