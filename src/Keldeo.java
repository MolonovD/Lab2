import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Keldeo extends Pokemon {

    public Keldeo(String name, int level){

        super(name, level);
        setMove(new ScreechMove(), new ScaryFaceMove(), new FacadeMove(), new LeerMove());
        setType(Type.WATER, Type.FIGHTING);
        setStats(91, 72, 90, 129, 90, 108);

    }
}
