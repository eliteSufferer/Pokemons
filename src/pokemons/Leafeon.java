package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Type;


public class Leafeon extends Eevee {
    public Leafeon(String name, int level){
        super(name, level);
        setStats(65, 110, 130, 60, 65, 95);
        setType(Type.GRASS);
        setMove(new BabyDollEyes(), new Confide(), new Tackle(), new LeafBlade());
    }
}
