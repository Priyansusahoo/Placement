public class Point {
    // write your code here
    private int x;
    private int y;

    // two-constructor
    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getters and Setters
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    // three-distance()
    public double distance() {
        return Math.sqrt((getX() - 0.0) * (getX() - 0) + (getY() - 0) * (getY() - 0));
    }
    public double distance(int x, int y) {
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }
    public double distance(Point xy) {
        return Math.sqrt((getX() - xy.getX()) * (getX() - xy.getX()) + (getY() - xy.getY()) * (getY() - xy.getY()));
    }
}
