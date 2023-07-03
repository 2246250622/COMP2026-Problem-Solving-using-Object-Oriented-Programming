import java.util.*;

public class MovableCollection {
    private List<Movable> movableList;

    public MovableCollection() {
        movableList = new ArrayList<Movable>();
    }

    public static void main(String args[]) {
        new MovableCollection().runApp();
    }

    void runApp() {
        movableList.add(new Point('A', 1, 2));
        movableList.add(new Point('B', 3, 4));
        movableList.add(new Point('C', 5, 6));

        //your code goes here...

        movableList.add(new Rectangle('D', 7, 8, 10, 20));
        movableList.add(new Rectangle('E', 9, 10, 5, 10));

        movableList.forEach(e -> System.out.println(e.toString()));


        movableList.forEach(Movable::moveRight);
        System.out.println("After moving right...");
        movableList.forEach(e -> System.out.println(e.toString()));



    }
}
