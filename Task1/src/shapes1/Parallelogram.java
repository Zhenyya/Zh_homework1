package shapes1;

public class Parallelogram extends Rectangle {
	
	double angle;

	public Parallelogram(double side1, double side2, double angle) {
		super(side1, side2);
		this.angle = angle;
	}

	@Override
	public double calcArea() {
		double area = side1 * side2 * Math.sin(angle * Math.PI / 180);
		return area;
	}
}

