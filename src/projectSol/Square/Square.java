package projectSol.Square;
import projectSol.Shape.*;


public class Square extends Shape{
	
	
	double side;
	public Square(String Color, double side) {
		
		super(Color);
		this.side = side;
		display("Square");
		
	}
	
	
	@Override
	public double calculateArea() {
		
		return 2* this.side;
	}
	
	@Override
	public double calculatePermiter() {
		return 2*(this.side + this.side);
	}
	
	

	
}

