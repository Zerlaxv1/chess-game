import java.util.ArrayList;
import java.util.List;

public class king extends Pieces{
    public king(int x, int y) {
        super(x, y);
    }

    @Override
    public void seDeplasser(int x, int y) {
        
    }

    @Override
    public List<position> deplacementPossible(int x, int y) {

        List<position> list = new ArrayList<>();

        list.add(new position(x + 1, y));
        list.add(new position(x - 1, y));
        list.add(new position(x, y + 1));
        list.add(new position(x, y - 1));
        list.add(new position(x + 1, y + 1));
        list.add(new position(x - 1, y - 1));
        list.add(new position(x + 1, y - 1));
        list.add(new position(x - 1, y + 1));

        return list;
    }
}
