package tasks;

/**
 * This program demonstrates the abstraction and calculates the area of different shapes.<br>
 * It includes abstract superclass 'AreaCalculator' and subclasses 'Circle' and 'Rectangle' that extends superclass.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */
abstract class AreaCalculator {

	// Create abstract method to calculate area
	abstract public double findArea();

}

// Circle class represents a circle shape
class Circle extends AreaCalculator {

	final double PI = 3.14;
	private double radius;

	/**
	 * Constructs the Circle with given radius.
	 * 
	 * @param radius the radius of the circle.
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double findArea() {
		return PI * radius * radius;
	}

}

// Rectangle class represents a rectangle shape
class Rectangle extends AreaCalculator {

	private double length;
	private double width;

	/**
	 * Constructs the Rectagle with given length and width.
	 * 
	 * @param length the length of rectangle
	 * @param width  the width of rectangle
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double findArea() {
		return length * width;
	}

}

public class ShapeAreaCalculator {

	public static void main(String[] args) {
		// Create object of Circle class
		Circle findCircleArea = new Circle(10);
		double circleArea = findCircleArea.findArea();
		System.out.println("Area of circle = " + circleArea);

		// Create object of Rectangle class
		Rectangle findRectangleArea = new Rectangle(10, 10);
		double rectangleArea = findRectangleArea.findArea();
		System.out.println("Area of rectangle = " + rectangleArea);
	}

}