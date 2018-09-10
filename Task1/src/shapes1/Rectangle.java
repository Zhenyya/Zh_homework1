package shapes1;

public class Rectangle extends Shape {

	double side1;
	double side2;

	public Rectangle() {
		side1 = 3;
		side2 = 4;
	}
	
	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public double calcArea() {
		double area = side1 * side2;
		return area;
	}

	public double calcPerimeter() {
		double perimeter = 2 * (side1 + side2);
		return perimeter;
	}
}
