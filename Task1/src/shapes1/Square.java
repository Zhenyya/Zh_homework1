package shapes1;

public class Square extends Quadrangle {

	private double side;
	
	public Square(double side) {
		super(side, side, side, side);
		this.side = side;
	}

	@Override
	public double calcArea() {
		double area = side * side;
		return area;
	}

}
