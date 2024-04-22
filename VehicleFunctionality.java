package tasks;

/**
 * This program demonstrates the concept of hierarchical inheritance.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */

// Parent class of all other class
class Vehicle {

	public void drive() {
		System.out.println("This is a parent of all other vehicles.");
	}

}

//Inherits Vehicle properties
class Car extends Vehicle {

	// Override the drive method for Car
	@Override
	public void drive() {
		System.out.println("Car is a four wheeler. It is a subclass of vehicle.");
	}

}

//Inherits Vehicle properties
class Bike extends Vehicle {

	// Override the drive method for Bike
	@Override
	public void drive() {
		System.out.println("Bike is a two wheeler. It is a subclass of vehicle.");
	}

}

//Inherits Car properties
class ElectricCar extends Car {

	// // Override the drive method for ElectricCar
	@Override
	public void drive() {
		System.out.println("Electric car is a four wheeler. It is a subclass of Car.");
	}

}

public class VehicleFunctionality {

	public static void main(String args[]) {
		// Create instance of vehicle
		Vehicle vehicle = new Vehicle();
		vehicle.drive();

		// Create instance of car
		Car car = new Car();
		car.drive();

		// Create instance of bike
		Bike splendor = new Bike();
		splendor.drive();

		// Create instance of ElectricCar
		ElectricCar NexonEV = new ElectricCar();
		NexonEV.drive();
	}

}