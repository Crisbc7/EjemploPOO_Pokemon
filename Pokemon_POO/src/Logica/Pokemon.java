package Logica;
public abstract class Pokemon {

    protected int num_pokemon;
    protected String nombrePokemon;
    protected String sexo;
    protected float peso;
    protected int temporada;

    protected abstract void ataquePlacaje();
    protected abstract void ataqueAraniazo();
    protected abstract void ataqueMordisco();

}
