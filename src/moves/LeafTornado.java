package moves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LeafTornado extends SpecialMove {
    public LeafTornado(){
        super(Type.GRASS, 65, 90);
    }
    private boolean flag;
    @Override
    protected void applyOppEffects(Pokemon def){
        if (Math.random() <= 0.5){
            flag = true;
            def.setMod(Stat.ACCURACY, -1);
        }
    }
    @Override
    protected String describe() {
        if (flag) return "Понижает точность врага";
        else return "Бьет";
    }
}
