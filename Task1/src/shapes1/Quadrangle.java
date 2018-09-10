package shapes1;

public class Quadrangle extends Shape {

	private double side1;
	private double side2;
	private double side3;
	private double side4;

	public Quadrangle(double side1, double side2, double side3, double side4) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
	}

	@Override
	public double calcArea() {
		// calculation quadrangle's area
		return 0;
	}

	public double calcPerimeter() {
		double perimeter = side1 + side2 + side3 + side4;
		return perimeter;
	}
}
