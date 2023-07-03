//You are not allowed to modify this program

public class Shape {
    private char name;

    public Shape() {
        this.name = ' ';
    }

    public Shape(char name) {
        this.name = name;
    }

    public char getName() {
        return this.name;
    }

    public String toString() {
        return "Shape " + this.name;
    }
}
