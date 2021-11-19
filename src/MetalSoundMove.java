import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class MetalSoundMove extends StatusMove {

    public MetalSoundMove(){
        super(Type.STEEL, 0, 85);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.DEFENSE, -2);
    }

    @Override
    protected String describe(){
        return "использует Metal Sound";
    }
}
