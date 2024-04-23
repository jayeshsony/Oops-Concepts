package tasks;

/**
 * This program demonstrates the use of run-time polymorphism.<br>
 * It defines a abstract class 'Shapes' that containes a method to draw different shapes and
 * 'CircleShape' and 'RectangleShape' are subclasses of it.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */
abstract class Shapes {

	// Abstract method to draw shapes
	abstract public void draw();

}

/**
 * This class contains two methods one to draw shape and another to calculate
 * area respectively.
 */
class CircleShape extends Shapes {

	// Initialize constant for pi
	final float PI = 3.14f;
	private float radius;

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}

	/**
	 * This method calculates the area of circle.<br>
	 * It represents compile-time polymorphism.
	 * 
	 * @param radius the radius of circle.
	 * @return area of circle.
	 */
	public float calculateArea(float radius) {
		this.radius = radius;
		return PI * radius * radius;
	}

}

/**
 * This class contains two methods one to draw shape and another to calculate
 * area respectively.
 */
class RectangleShape extends Shapes {

	private float length;
	private float width;

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

	/**
	 * This method calculates the area of rectangle.<br>
	 * It represents compile-time polymorphism.
	 * 
	 * @param length the length of rectangle.
	 * @param width  the width of of rectangle.
	 * @return area of rectangle.
	 */
	public float calculateArea(float length, float width) {
		this.length = length;
		this.width = width;
		return length * width;
	}

}

public class ShapeDrawer {

	public static void main(String[] args) {
		// Create instance of circle
		CircleShape circleInstance = new CircleShape();
		circleInstance.draw();
		float circleArea = circleInstance.calculateArea(10);
		System.out.println("Area of circle = " + circleArea);

		// Create instance of rectangle
		RectangleShape rectangleInstance = new RectangleShape();
		rectangleInstance.draw();
		float rectangleArea = rectangleInstance.calculateArea(10, 10);
		System.out.println("Area of Rectangle = " + rectangleArea);
	}

}