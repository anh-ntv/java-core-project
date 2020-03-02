package week11.ex1;

public class Circle implements Shape {
	private double r;

	public Circle() {
	}

	public Circle(double r) {
		this.r = r;
	}

	public void setRadius(double r) {
		this.r = r;
	}

	public double getRadius() {
		return r;
	}

	public double getDiameter() {
		return 2 * r;
	}

	public double getPerimeter() {
		return 2 * r * Math.PI;
	}

	public double getArea() {
		return r * r * Math.PI;
	}

	public double getFrameArea() {
		return 4 * r * r;
	}

	public int compareTo(Shape shape) {
		if (shape.getClass().getName().equals("Circle")) {
			double radius = ((Circle) shape).getRadius();
			if (r > radius)
				return 1;
			else if (r == radius)
				return 0;
			else
				return -1;
		}

		double frameArea = getFrameArea();
		if (frameArea > shape.getArea()) {
			return 1;
		} else if (frameArea == shape.getArea()) {
			return 0;
		}
		return -1;
	}

}