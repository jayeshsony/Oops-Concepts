package tasks;

/**
 * This program demonstrates the concept of hierarchical inheritance.
 * It defines a base class 'student' and two subclasses 'ScienceStream' and 
 * 'CommereceStream' which inherits from 'Student' class.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */

/**
 * This class is a parent class of other two class. It contains one constructor
 * and one method to get the student information and prints it respectively.
 */
class Student {
	private String name;
	private int rollNo;

	/**
	 * Constructs the Student class with the specified name and roll number.
	 * 
	 * @param name   the name of student.
	 * @param rollNo the roll number of student.
	 */
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	/**
	 * A method of student class. It prints the student detail.
	 */
	public void printDetails() {
		System.out.println("\n Student Details ");
		System.out.println("Name = " + name);
		System.out.println("Roll number = " + rollNo);
	}
}

/**
 * A class represents the student of science stream. 
 * It inheritance from Student class.
 */
class ScienceStream extends Student {

	/**
	 * Constructs the ScienceStream class with the specified name and roll number.
	 * It calls the constructor of Student class
	 * 
	 * @param name   the name of the student.
	 * @param rollNo the roll number of the student.
	 */
	public ScienceStream(String name, int rollNo) {
		super(name, rollNo);
	}

	/**
	 * A method of ScienceStream class. It prints the subjects of science stream.
	 */
	public void printScienceStreamSubjects() {
		System.out.println("\n Subject of science stream ");
		System.out.println("-Biology");
		System.out.println("-Chemestry");
		System.out.println("-Physics");
	}
}

/**
 * A class represents the student of commerce stream. It inheritance from
 * Student class.
 */
class CommerceStream extends Student {

	/**
	 * Constructs the ScienceStream class with the specified name and roll number.
	 * It calls the constructor of Student class.
	 * 
	 * @param name   the name of the student.
	 * @param rollNo the roll number of the student.
	 */
	public CommerceStream(String name, int rollNo) {
		super(name, rollNo);
	}

	/**
	 * A method of CommerceStream class. It prints the subjects of science stream.
	 */
	public void printCommerceStreamSubjects() {
		System.out.println("\n Subject of commerce stream ");
		System.out.println("-Accountancy");
		System.out.println("-Economics");
		System.out.println("-Business Studies");
	}
}

public class StudentManagement {

	public static void main(String[] args) {
		// Create ScienceStream student object
		ScienceStream scienceStudent = new ScienceStream("Jayesh", 10);
		scienceStudent.printDetails();
		scienceStudent.printScienceStreamSubjects();

		// Create CommerceStream student object
		CommerceStream commerceStudent = new CommerceStream("Naitik", 20);
		commerceStudent.printDetails();
		commerceStudent.printCommerceStreamSubjects();
	}

}