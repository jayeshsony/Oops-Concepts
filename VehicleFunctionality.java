package tasks;

/**
 * This program demonstrates the concept of hybrid inheritance.<br>
 * It includes four classes: Vehicle, Car, Bike, ElectricCar.<br>
 * Vehicle class is parent class of other subclasses.<br>
 * Car and Bike are the subclasses of Vehicle, that inherits its properties and
 * overrides drive method.<br>
 * ElectricCar is subclass of Car, that inherites its properties and overrides
 * drive method.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */
class Vehicle {

	public void drive() {
		System.out.println("This is a parent of all other vehicles.");
	}

}

// Inherits Vehicle properties
class Car extends Vehicle {

	@Override
	public void drive() {
		System.out.println("Car is a four wheeler. It is a subclass of vehicle.");
	}

}

// Inherits Vehicle properties
class Bike extends Vehicle {

	@Override
	public void drive() {
		System.out.println("Bike is a two wheeler. It is a subclass of vehicle.");
	}

}

// Inherits Car properties
class ElectricCar extends Car {

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