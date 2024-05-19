import java.util.List;

public abstract class Pieces {

    private position position;

    public Pieces(int x, int y) {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new IllegalArgumentException("Invalid position");
        }

        this.position = new position(x, y);

    }

    public abstract void seDeplasser(int x, int y);

    public abstract List<position> deplacementPossible(int x, int y);

    public position getPosition() {
        return position;
    }

    public void setPosition(position position) {
        this.position = position;
    }

    public boolean equals(Pieces p) {
        return position.equals(p.getPosition());
    }
}
