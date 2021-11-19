import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args){
        Battle battle = new Battle();
        battle.addAlly(new Keldeo("Damba", 1) );
        battle.addAlly(new Elgyem("Lena", 1) );
        battle.addAlly(new Beheeyem("Sonya", 1) );
        battle.addFoe(new Dratini("Anya", 1));
        battle.addFoe(new Dragonair("Maksim", 1));
        battle.addFoe(new Dragonite("Saryuna", 1));
        battle.go();
    }
}