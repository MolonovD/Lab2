import ru.ifmo.se.pokemon.Type;

public class Dragonair extends Dratini{

    public Dragonair (String name, int level){

        super(name, level);
        setMove(new DoubleTeamMove(), new RestMove(), new MetalSoundMove());
        setType(Type.DRAGON);
        setStats(61, 84, 65, 70, 70, 70);

    }
}
