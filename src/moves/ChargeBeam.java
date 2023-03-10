package moves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        super(Type.ELECTRIC, 50, 90);
    }

    private boolean flag;
    @Override
    protected void applySelfEffects(Pokemon att){
        if (Math.random() <= 0.7){
            flag = true;
            att.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }
    @Override
    protected String describe(){
        if (flag) return "Дамажит и увеличивает особую атаку";
        else return "Просто бьет";
    }
}
