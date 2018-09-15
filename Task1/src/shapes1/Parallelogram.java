package shapes1;

public class Parallelogram extends Quadrangle {
	
	private double sideOne;
	private double sideTwo;
	double angle;

	public Parallelogram(double sideOne, double sideTwo, double angle) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.angle = angle;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * (sideOne + sideTwo);
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = sideOne * sideTwo * Math.sin(angle * Math.PI / 180);
		return area;
	}

}

