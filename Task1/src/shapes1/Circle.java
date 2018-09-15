package shapes1;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double calculateCircleLength() {
		double circleLength = 2 * Math.PI * radius;
		return circleLength;
	}

}
