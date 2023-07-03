public class Point implements Movable {
    private char name;
    private int x;
    private int y;

    public Point(char name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

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

    public void moveLeft() {
        this.x = this.x - DX;
    }

    public void moveRight() {
        this.x = this.x + DX;
    }

    public String toString() {
        return "Point " + name + " (" + x + ", " + y + ")\n";
    }
}
