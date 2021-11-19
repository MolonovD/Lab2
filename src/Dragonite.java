import ru.ifmo.se.pokemon.Type;

public class Dragonite extends Dragonair{

    public Dragonite (String name, int level){

        super(name, level);
        setMove(new DoubleTeamMove(), new RestMove(), new MetalSoundMove(), new PoisonJabMove());
        setType(Type.DRAGON, Type.FLYING);
        setStats(91, 134, 95, 100, 100, 80);
    }
}
