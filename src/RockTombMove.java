import ru.ifmo.se.pokemon.*;

public class RockTombMove extends PhysicalMove {

    public RockTombMove(){
        super(Type.ROCK, 60, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
         pokemon.setMod(Stat.SPEED, -1);
    }

    @Override
    protected String describe(){
        return "использует Rock Tomb";
    }
}
