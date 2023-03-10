package moves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS, 90, 100);
    }

    private boolean flag;
    @Override
    protected void applyOppEffects(Pokemon def){
        if (Math.random() <= 0.1){
            flag = true;
            def.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        if (flag) return "Дамажит и понижает особую защиту";
        else return "Дамажит";
    }
}
