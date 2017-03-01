package sanchez_Question4;

public class sanchez_DriverClass {


	public static void main(String[] args) {
		// Create an array of five GeometricObjects
		sanchez_GemetricObject[] squares = {new sanchez_Square(4.5), new sanchez_Square(14), 
			new sanchez_Square(8.2), new sanchez_Square(12), new sanchez_Square(10)};

		// Display the area and invoke the howToColor 
		// method for each GeometricObject
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare #" + (i + 1));
		 	System.out.println("Area: " + squares[i].getArea());
		 	System.out.println("How to color: " + ((sanchez_Square)squares[i]).howToColor());
		 } 
	}
}