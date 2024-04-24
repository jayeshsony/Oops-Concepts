package tasks;

/**
 * This program demonstrates encapsulation and get and sets the employee's information.
 * It defines base class 'EmpoyeeInfo' that represents the information about employee
 * and encapulates it.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */
public class EmployeeInfo {

	// Declare private variables to demonstrate encapsulation
	private String name;
	private int age;

	/**
	 * Gets the name of employee.
	 * 
	 * @return the name of employee.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of employee.
	 * 
	 * @param name the name of the employee.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age of employee.
	 * 
	 * @return the age of employee
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of employee.
	 * 
	 * @param age the age of employee.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// Create object of Employee class
		EmployeeInfo firstEmployee = new EmployeeInfo();

		// Set values using setter methods
		firstEmployee.setName("Jayesh");
		firstEmployee.setAge(20);

		// Get values using getter methods
		System.out.println("Name = " + firstEmployee.getName());
		System.out.println("Age = " + firstEmployee.getAge());
	}

}