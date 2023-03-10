package pokemons;
import moves.*;

public class Eelektross extends Eelektrik {
    public Eelektross(String name, int level) {
        super(name, level);
        setStats(85, 115, 80, 105, 80, 50);
        setMove(new ChargeBeam(), new ThunderWave(), new AcidSpray(), new RockSlide());
    }
}
