package moves;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    private boolean flag;
    @Override
    protected void applyOppEffects(Pokemon def){
        if (Math.random() <= 0.3){
            flag = true;
            Effect.flinch(def);
        }
    }

    @Override
    protected String describe(){
        if (flag) return "заставляет жертву ♂flinch♂";
        else return "бьет. Просто бьет..";
    }
}
