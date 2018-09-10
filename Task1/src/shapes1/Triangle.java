package shapes1;

public class Triangle extends Shape {

	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double calcArea() {
		double p = 0.5 * calcPerimeter();
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return area;
	}

	public double calcPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

}
