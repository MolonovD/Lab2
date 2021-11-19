import ru.ifmo.se.pokemon.*;

public class FacadeMove extends PhysicalMove {

    public FacadeMove(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        Status statusOpponent = pokemon.getCondition();
        if (statusOpponent == Status.BURN ||
            statusOpponent == Status.POISON ||
            statusOpponent == Status.PARALYZE){
            pokemon.setMod(Stat.HP, (int)(v * 2));
        }else{
            pokemon.setMod(Stat.HP, (int)v);
        }
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
