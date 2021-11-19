import ru.ifmo.se.pokemon.*;

public class PoisonJabMove extends PhysicalMove {

    public PoisonJabMove(){
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.DEFENSE, -80);
        if (Math.random() <= 0.3)
            Effect.poison(pokemon);
    }

    @Override
    protected String describe(){
        return "использует Poison Jab";
    }
}
