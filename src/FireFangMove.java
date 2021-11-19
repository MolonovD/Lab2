import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import java.lang.Math;

public class FireFangMove extends PhysicalMove {

    public FireFangMove() {
        super(Type.FIRE, 65, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <= 0.1)
            Effect.burn(pokemon);
        if (Math.random() <= 0.1)
            Effect.flinch(pokemon);
    }

    @Override
    protected String describe(){
        return "использует Fire Fang";
    }
}
