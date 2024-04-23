package tasks;

/**
 * This program demonstrates the use of interface.<br>
 * It includes one interface 'Animal' with a 'animalType' method.<br>
 * 'Dog' and 'Lion' implements 'Animal' interface and provide own
 * implementations for 'animalType' method.
 * 
 * @author Jayesh Soni
 * @since 2024-04-23
 */
interface Animal {

	// Method to display type of animal
	void animalType();

}

/**
 * This class represents a Dog, which is domestic animal.<br>
 * It implements 'Animal' interface.
 */
class Dog implements Animal {

	@Override
	public void animalType() {
		System.out.println("Dog is domestic animal");
	}

}

/**
 * This class represents a Lion, which is wild animal.<br>
 * It implements 'Animal' interface.
 */
class Lion implements Animal {

	@Override
	public void animalType() {
		System.out.println("Lion is wild animal.");
	}

}

public class TypesOfAnimal {

	public static void main(String[] args) {
		// Create instance of dog
		Dog dog = new Dog();
		dog.animalType();

		// Create instance of lion
		Lion lion = new Lion();
		lion.animalType();

	}

}