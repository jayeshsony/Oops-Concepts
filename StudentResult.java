package tasks;

/**
 * This program demonstrates the use of single inheritance.<br>
 * It defines superclass 'StudentInfo' and subclass 'StudentMarks' that extends superclass.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */
class StudentInfo {

	private String name;
	private int rollNo;

	/**
	 * Constructs the StudentInfo with the given name and rollno.
	 * 
	 * @param name the name of student.
	 * @param rollNo the roll number of student.
	 */
	public StudentInfo(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	// This method prints the student information
	public void printInfo() {
		System.out.println("Name = " + name);
		System.out.println("Roll No. = " + rollNo);
	}

}

/**
 * Subclass StudentMarks inheriting from StudentInfo.
 * It contains one constructor and one method to get student marks and prints it respectively. 
 */
class StudentMarks extends StudentInfo {

	private int marksInJava;
	private int marksInPython;

	/**
	 * Constructs the StudentMarks with the given name, roll number, marks in java and python.
	 * @param name the name of student.
	 * @param rollNo the roll number of student.
	 * @param marksInJava the marks obtained in java.
	 * @param marksInPython the marks obtained in python.
	 */
	public StudentMarks(String name, int rollNo, int marksInJava, int marksInPython) {
		super(name, rollNo); // Call the super class constructor.
		this.marksInJava = marksInJava;
		this.marksInPython = marksInPython;
	}

	/**
	 * This method prints the obtained marks in java and python.
	 * If the marks is invalid, it prints a messages otherwise it calculates the total marks
	 * and prints marks and total marks.
	 */
	public void printMarks() {
		if ((marksInJava < 0 && marksInPython < 0) && (marksInJava > 100 && marksInPython > 100)) {
			System.out.println("Please enter valid marks");
		} else {
			System.out.println("\n- Result - ");
			System.out.println("Java = " + marksInJava);
			System.out.println("Python = " + marksInPython);
			int totalMarks;
			totalMarks = marksInJava + marksInPython;
			System.out.println("Total = " + totalMarks);
		}
	}

}

public class StudentResult {

	public static void main(String[] args) {
		// Create the object of StudentMarks
		StudentMarks firstStudent = new StudentMarks("jayesh", 10, 90, 90);
		firstStudent.printInfo();
		firstStudent.printMarks();
	}

}