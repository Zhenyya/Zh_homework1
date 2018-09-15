package shapes1;

public class Rhombus extends Quadrangle {

	private double side;
	private double angle;

	public Rhombus(double side, double angle) {
		this.side = side;
		this.angle = angle;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 4 * side;
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = side * side * Math.sin(angle * Math.PI / 180);
		return area;
	}

}

