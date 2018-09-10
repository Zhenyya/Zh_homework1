package shapes1;

public class Parallelogram extends Rectangle {
	
//	private double side1;
//	private double side2;
	double angle;

	public Parallelogram(double side1, double side2, double angle) {
		this.side1 = side1;
		this.side2 = side2;
		this.angle = angle;
	}

	@Override
	public double calcArea() {
		double area = side1 * side2 * Math.sin(angle * Math.PI / 180);
		return area;
	}
}

