import java.util.ArrayList;

public class ResizableCollection {
   private ArrayList<Resizable> Resizable;

    public ResizableCollection() {
        Resizable = new ArrayList<Resizable>();
    }

    public static void main(String args[]) {
        new MovableCollection().runApp();
    }

    void runApp() {
        Resizable.add(new Rectangle('D', 7, 8, 10, 20));
        Resizable.add(new Rectangle('E', 9, 10, 5, 10));

        Resizable.add(new Circle('F', 5));
        Resizable.add(new Circle('G', 15));


        Resizable.forEach(e -> System.out.println(e.toString()));


        Resizable.forEach(resizable -> resizable.resize());
        System.out.println("After resize...");
        Resizable.forEach(e -> System.out.println(e.toString()));




    }
}
