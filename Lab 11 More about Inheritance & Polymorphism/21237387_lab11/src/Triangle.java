public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        super() ;
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(String name, double side){
        super(name) ;
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }

    public Triangle(String name, double side1, double side2, double side3){
        super(name) ;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area(){
        double Perimeter = side1 + side2 + side3;
        double s = Perimeter/2;
        double Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return Area;
    }

    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: " + this.getName()+"\nSide lengths: "+this.side1 +" "+this.side2+ " "+this.side3 ;
    }




}
