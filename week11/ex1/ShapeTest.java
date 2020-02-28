package week11.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Kim-Cuc Nguyen
 *
 * Feb 27, 2020
 *
 */
public class ShapeTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		while (scan.hasNextLine()) {
			String line = scan.nextLine().trim();
			if (line.length() > 0) {
				String[] temp = line.split(" ");
				if (temp[0].equals("c")) {
					double r = Double.parseDouble(temp[1]);
					Circle circle = new Circle(r);
					shapes.add(circle);
				} else if (temp[0].equals("s")) {
					double a = Double.parseDouble(temp[1]);
					Square square = new Square(a);
					shapes.add(square);
				} else if (temp[0].equals("r")) {
					double a = Double.parseDouble(temp[1]);
					double b = Double.parseDouble(temp[2]);
					Rectangle rectangle = new Rectangle(a, b);
					shapes.add(rectangle);
				}
			} else {
				break;
			}
		}
		sort(shapes);
		for (Shape shape : shapes) {
			System.out.println(shape.getClass().getName() + "\t" + shape.getArea());
		}

	}

	public static void sort(List<Shape> shapes) {
		int n = shapes.size();
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++) {
				if ((shapes.get(i)).compareTo(shapes.get(j)) > 0) {
					Shape temp = shapes.get(i);
					shapes.set(i, shapes.get(j));
					shapes.set(j, temp);
				}
			}
	}

}
