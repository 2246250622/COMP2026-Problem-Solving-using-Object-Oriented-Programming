import java.util.ArrayList;
import java.util.List;

public class MyShapeList {

    private List<Shape> shapeList;

    public MyShapeList() {
        shapeList = new ArrayList<>();
    }

    public void runApp() {
        addShapes();
        System.out.println("==================================");
        System.out.println("Print List: ");
        printList();
        System.out.println("==================================");
        System.out.printf("Total Area: %.2f\n", totalArea());
        System.out.printf("Total Perimeter: %.2f\n", totalPerimeter());
        System.out.println("No. of Circles: " + numOfCircle());
        System.out.println("No. of Triangles: " + numOfTriangle());

    }

    public void addShapes() {
    Circle deafultcircle = new Circle();
    Circle circle = new Circle("MyCircle", 10);
        Triangle deafulttriangle = new Triangle();
        Triangle triangle = new Triangle("EquilateralTriangle", 6);
        Triangle triangle1 = new Triangle("MyTriangle", 6,7,8);

        shapeList.add(deafultcircle);
        shapeList.add(circle);
        shapeList.add(deafulttriangle);
        shapeList.add(triangle);
        shapeList.add(triangle1);
    }

    public void printList() {
        for(int i = 0;i<shapeList.size();i++){
            System.out.println(shapeList.get(i));
        }

    }
    double totalArea() {
    double total = 0;
        for(int i = 0;i<shapeList.size();i++){
            total+=(shapeList.get(i).area());
        }
        return  total;
    }
    double totalPerimeter() {
        double total = 0;
        for(int i = 0;i<shapeList.size();i++){
            total+=(shapeList.get(i).perimeter());
        }
        return  total;
    }

    int numOfCircle() {
        int total = 0;
        for(int i = 0;i<shapeList.size();i++){
            if (shapeList.get(i)instanceof Circle){
                total++;
            };
        }
        return  total;

    }

    int numOfTriangle() {
        int total = 0;
        for(int i = 0;i<shapeList.size();i++){
            if (shapeList.get(i)instanceof Triangle){
                total++;
            };
        }
        return  total;

    }

    public static void main(String[] args) {
        new MyShapeList().runApp();
    }
}
