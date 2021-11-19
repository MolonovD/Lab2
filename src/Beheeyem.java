import ru.ifmo.se.pokemon.Type;

public class Beheeyem extends Elgyem{

    public Beheeyem (String name, int level){

        super(name, level);
        setMove(new ScaryFaceMove(), new RockTombMove(), new FireFangMove(), new MagnitudeMove());
        setType(Type.PSYCHIC);
        setStats(75, 75, 75, 125, 95, 40);

    }

}
