package shapes1;

public class Square extends Quadrangle {

	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 4 * side;
		return perimeter;
	}

	@Override
	public double calculateArea() {
		double area = side * side;
		return area;
	}

}
