package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SweetScent extends StatusMove {
    public SweetScent(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.EVASION, -1);
    }
    @Override
    protected String describe(){
        return "Уменьшает уклонение";
    }
}
