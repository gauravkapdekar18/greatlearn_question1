package projectSol.Circle;
import projectSol.Shape.*;

public class Circle extends Shape{
	
	
	int radius;
	double pi = 3.14;
	public Circle(String Color, int radius) {
		
		super(Color);
		this.radius  = radius;

		display("Circle");
	}
	
	
	@Override
	public double calculateArea() {
		
		return pi* (Math.pow(this.radius, 2));
	}
	
	@Override
	public double calculatePermiter() {
		return 2*pi*this.radius;
	}
	
	
}
