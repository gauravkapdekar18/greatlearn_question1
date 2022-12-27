package projectSol.Shape;

public class Shape {

		public String colour;
		
		public Shape(String colour) {
			
			this.colour = colour;
		}
		

		public String getColor() {
			return this.colour;
		}
		public double calculateArea() {
			
			return 0.0;
		}
		
		
		public double calculatePermiter() {
			return 0.0;
		}
		
		public void display(String shape) {
			
			System.out.println("This is the shape " + shape +" With color :: " + getColor());
		}
	
}
