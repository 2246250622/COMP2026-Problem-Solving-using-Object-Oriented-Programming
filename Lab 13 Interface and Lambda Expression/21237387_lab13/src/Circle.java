public class Circle extends Shape implements Resizable{
	
	private double radius;	

	public Circle() {
		this(' ', 1);
	}

	public Circle(char name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double area() {
		return radius * radius * Math.PI;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "Circle " + super.getName() + "\nRadius: " + radius + "\n";
	}


	@Override
	public void resize() {
		radius *= DEFAULT_FACTOR;
	}
}
