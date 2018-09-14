package shapes1;

public class App {

	public static void main(String[] args) {
		
		Square square1 = new Square(5);
		double p2 = square1.calcPerimeter();
		System.out.println("Square perimeter is: " + p2);
		double ar2 = square1.calcArea();
		System.out.println("Square area is: " + ar2);
		
//		Rhombus rhomb1 = new Rhombus(5, 30);
//		double p3 = rhomb1.calcPerimeter();
//		System.out.println("Rhombus perimeter is: " + p3);
//		double ar3 = rhomb1.calcArea();
//		System.out.println("Rhombus area is: " + ar3);
//		
//		Quadrangle quadr1 = new Quadrangle(3, 4, 7, 5);
//		double p4 = quadr1.calcPerimeter();
//		System.out.println("Quadrangle perimeter is: " + p4);
//		double ar4 = quadr1.calcArea();
//		System.out.println("Quadrangle area is: " + ar4);
		
		Rectangle rect1 = new Rectangle(4, 5);
		double p5 = rect1.calcPerimeter();
		System.out.println("Rectangle perimeter is: " + p5);
		double ar5 = rect1.calcArea();
		System.out.println("Rectangle area is: " + ar5);
		
//		Parallelogram par1 = new Parallelogram(6, 5, 30);
//		double p6 = par1.calcPerimeter();
//		System.out.println("Parallelogram perimeter is: " + p6);
//		double ar6 = par1.calcArea();
//		System.out.println("Parallelogram area is: " + ar6);
//
//		Triangle triangle1 = new Triangle(3, 4, 6);
//		double p1 = triangle1.calcPerimeter();
//		System.out.println("Triangle perimeter is: " + p1);
//		double ar1 = triangle1.calcArea();
//		System.out.println("Triangle area is: " + ar1);
//		
//		Circle circle1 = new Circle(6);
//		double len1 = circle1.calcLengthCircle();
//		System.out.println("Circle perimeter is: " + len1);
//		double ar7 = circle1.calcArea();
//		System.out.println("Circle area is: " + ar7);
		
	}

}

