package sanchez_Question4;

public class sanchez_Square extends sanchez_GemetricObject implements sanchez_Colorable {

	private double side;

	public sanchez_Square() {
	}

	public sanchez_Square(double side) {
		this.side = side;
	}

	public sanchez_Square(double side, String color, boolean filled) {
		super(color, filled);
		setSide(side);
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return side * 4;
	}

	@Override
	public String howToColor() {
		return "Color all four sides";
	}

	@Override
	public String toString() {
		return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
			+ "\nPerimeter: " + getPerimeter();
	}
}
