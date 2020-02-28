package week11.ex1;

public class Rectangle implements Shape {
	private double length, width;

	public Rectangle() {
	}

	public Rectangle(double a, double b) {
		length = a;
		width = b;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double b) {
		length = b;
	}

	public void setWidth(double a) {
		width = a;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public double getArea() {
		return length * width;
	}

}