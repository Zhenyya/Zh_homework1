package shapes1;

public class Triangle extends Quadrangle {

	private double sideOne;
	private double sideTwo;
	private double sideThree;

	public Triangle(double sideOne, double sideTwo, double sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	@Override
	public double calculateArea() {
		double p = 0.5 * calculatePerimeter();
		double area = Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = sideOne + sideTwo + sideThree;
		return perimeter;
	}

}
