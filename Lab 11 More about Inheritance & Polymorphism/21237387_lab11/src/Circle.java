public class Circle extends Shape{
    private double radius;

    public Circle(){
        super() ;
        this.radius = 1;
    }

    public Circle(String name, double radius){
        super(name) ;
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI*(radius*radius);
    }

    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle: " + this.getName()+"\nRadius: "+this.radius;
    }




}
