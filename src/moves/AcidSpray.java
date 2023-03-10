package moves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class AcidSpray extends SpecialMove {
    public AcidSpray(){
        super(Type.POISON, 40, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPECIAL_DEFENSE, -2);
    }

    @Override
    protected String describe(){
        return "нерфит особую защиту";
    }
}
