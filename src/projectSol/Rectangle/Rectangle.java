package projectSol.Rectangle;
import projectSol.Shape.*;


public class Rectangle extends Shape{
	
	
	double height;
	double width;
	public Rectangle(String Color, double height, double width) {
		
		super(Color);
		this.height  = height;
		this.width  = width;

		display("Rectangle");
	}
	
	
	@Override
	public double calculateArea() {
		
		return this.height * this.width;
	}
	
	@Override
	public double calculatePermiter() {
		return 2*(this.height + this.width);
	}
	
	
}
