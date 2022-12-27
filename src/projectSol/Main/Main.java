package projectSol.Main;
import projectSol.Circle.*;
import projectSol.Rectangle.*;
import projectSol.Square.*;
public class Main {

	public static void main(String[] args) {
		
		// circle
		
		Circle cir = new Circle("Red", 2);
		System.out.println("Area Of Circle: "+cir.calculateArea());
		System.out.println("Permiter Of Circle: "+cir.calculatePermiter());
				
		//rectangle
		
		Rectangle rect = new Rectangle("Blue", 4, 3);
		System.out.println("Area Of Rectangle: "+rect.calculateArea());
		System.out.println("Permiter Of Rectangle: "+rect.calculatePermiter());
				
		//rectangle
		
		Square sqr = new Square("Green", 5);
		System.out.println("Area Of Square: "+sqr.calculateArea());
		System.out.println("Permiter Of Square: "+sqr.calculatePermiter());
		
		
		
		
	}
}
