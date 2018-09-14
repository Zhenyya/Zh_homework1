package shapes1;

public class Rectangle extends Quadrangle {

	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	public Rectangle(double a, double b) {
		this.side1 = a;
		this.side2 = b;
		this.side3 = a;
		this.side4 = b;
	}

	@Override
	public double calcArea() {
		double area = side1 * side2;
		return area;
	}

}
