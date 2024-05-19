public class position {
    private int x;
    private int y;

    public position(int x, int y) {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new IllegalArgumentException("Invalid position");
        }

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        if (x < 0 || x > 7) {
            throw new IllegalArgumentException("Invalid position");
        }
        this.x = x;
    }

    public void setY(int y) {
        if (y < 0 || y > 7) {
            throw new IllegalArgumentException("Invalid position");
        }
        this.y = y;
    }

    public boolean equals(position p) {
        return x == p.getX() && y == p.getY();
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
