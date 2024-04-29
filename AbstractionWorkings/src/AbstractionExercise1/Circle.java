package AbstractionExercise1;


public class Circle extends Shape{
	
	private double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2);
		
	}

	@Override
	public double perimeter() {
		return Math.PI*radius*2;
		
	}

	@Override
	public String toString() {
		
		return super.toString();

}
}