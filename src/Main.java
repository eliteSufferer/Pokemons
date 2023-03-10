import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Tropius("Tropius", 1);
        Pokemon p2 = new Eevee("Eevee", 1);
        Pokemon p3 = new Leafeon("Leafeon", 1);
        Pokemon p4 = new Tynamo("Tynamo", 1);
        Pokemon p5 = new Eelektrik("Elektrik", 1);
        Pokemon p6 = new Eelektross("Elektross", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
