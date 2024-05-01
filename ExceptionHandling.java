package tasks;

import java.util.Scanner;

/**
 * This program demonstrates the concept of exception handling.
 * 
 * @author Jayesh Soni
 * @since 2024-04-23
 */
public class ExceptionHandling {

	/**
	 * This method check the divisor number and if it's not zero then performs
	 * division.
	 * 
	 * @param dividend the number to be divided.
	 * @param divisor  the number by which dividend is divided.
	 * @return the result of the division.
	 * @throws ArithmeticException if the divisor is zero.
	 */
	public static double divideNumber(int dividend, int divisor) throws ArithmeticException {
		if (divisor == 0) {
			throw new ArithmeticException("Can't divide by Zero");
		} else {
			return (double) dividend / divisor;
		}
	}

	public static void main(String[] args) {
		// Create scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter dividend = ");
		int dividend = scanner.nextInt();
		System.out.print("Enter divisor = ");
		int divisor = scanner.nextInt();

		try {
			double answer = divideNumber(dividend, divisor); // Call the method
			System.out.println("Answer= " + answer);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // Handle exception
		} finally {
			System.out.println("This is finally block."); // Cleanup code
			scanner.close();
		}
	}

}
