package shapes1;

public class Square extends Shape {

	double side;
	
	public Square() {
		side = 3.0;
	}

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calcArea() {
		double area = side * side;
		return area;
	}

	public double calcPerimeter() {
		double perimeter = 4 * side;
		return perimeter;
	}

}
