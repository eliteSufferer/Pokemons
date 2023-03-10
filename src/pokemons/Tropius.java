package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tropius extends Pokemon {
    public Tropius(String name, int level){
        super(name,level);
        setStats(99,68,83,72,87,51);
        setType(Type.GRASS, Type.FLYING);
        setMove(new Growth(), new SweetScent(), new LeafTornado(), new EnergyBall());
    }
}