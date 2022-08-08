public class Mypoint {
    private int x;
    private int y;

    public Mypoint(int x1, int y1) {
    }

    public void Mypoint (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Mypoint mypoint ) {
        int xDiff = this.x - mypoint.getX();
        int yDiff = this.y - mypoint.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
