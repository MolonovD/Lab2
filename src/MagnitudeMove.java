import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MagnitudeMove extends PhysicalMove {

    public MagnitudeMove() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.HP, -3);
    }

    @Override
    protected String describe(){
        return "использует Magnitude";
    }
}
