import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dratini extends Pokemon {

    public Dratini (String name, int level){

        super(name, level);
        setMove(new DoubleTeamMove(), new RestMove());
        setType(Type.DRAGON);
        setStats(41, 64, 45, 50, 50, 50);

    }
}
