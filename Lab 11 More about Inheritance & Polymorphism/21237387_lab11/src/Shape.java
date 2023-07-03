//You are not allowed to modify this program

public class Shape {
	private String name;

	public Shape() {
		this.name = "";
	}

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public double area(){
		return 0;
	}

	public double perimeter(){
		return 0;
	}

	public String toString() {
		return "Shape: " + this.name;
	}
}
