import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Elgyem extends Pokemon{

    public Elgyem(String name, int level){

        super(name, level);
        setMove(new ScaryFaceMove(), new RockTombMove(), new FireFangMove());
        setType(Type.PSYCHIC);
        setStats(55, 55, 55, 85, 55, 30);

    }

}
