package shapes1;

public class Rhombus extends Square {

//	private double side;
	private double angle;

	public Rhombus(double side, double angle) {
		super(side);
		this.angle = angle;
	}
	
	@Override
	public double calcArea() {
		double area = super.calcArea() * Math.sin(angle * Math.PI / 180);
		return area;
	}

}

