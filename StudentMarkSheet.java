package tasks;

/**
 * This program demonstrates the concept of multilevel inheritance.
 * 
 * @author Jayesh Soni
 * @since 2024-04-22
 */

/**
 * This class contains one constructor and one method to get student information and
 * print it respectively. 
 *
 */
class StudentBioData {

	private String name;
	private int rollNo;

	/**
	 * Constructs the StudentBioData with specified name and roll number.
	 * 
	 * @param name the name of student.
	 * @param rollNo the roll number of student.
	 */
	public StudentBioData(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	/**
	 * A method of StudentBioData class.
	 * This method prints the student information.
	 */
	public void printStudentBioData() {
		System.out.println("Name = " + name);
		System.out.println("Roll Number = " + rollNo);
	}

}

/**
 * This class contains one constructor and three method to get student marks and
 * print it respectively. 
 *
 */
class StudentScore extends StudentBioData {

	private int marksInJava;
	private int marksInPython;

	/**
	 * Constucts the StudentScore class.
	 * @param name the name of the student.
	 * @param rollNo the roll number of the student.
	 * @param marksInJava the obtained marks in java.
	 * @param marksInPython the obtained marks in python.
	 */
	public StudentScore(String name, int rollNo, int marksInJava, int marksInPython) {
		super(name, rollNo); // Calls the StudentBIoData  class Constructor
		this.marksInJava = marksInJava;
		this.marksInPython = marksInPython;
	}

	// Gets the marks of java
	public int getMarksInJava() {
		return marksInJava;
	}

	// Get the marks of python
	public int getMarksInPython() {
		return marksInPython;
	}

	/**
	 * A method of StudentScore class.
	 * If the marks is invalid, it prints a messages otherwise it prints marks.
	 */
	public void printStudentScore() {
		// Check if entered marks is within valid range or not
		if ((marksInJava < 0 && marksInPython < 0) && (marksInJava > 100 && marksInPython > 100)) {
			System.out.println("Please enter valid marks");
		} else {
			System.out.println("\n- Obtained Marks- ");
			System.out.println("Java = " + marksInJava);
			System.out.println("Python = " + marksInPython);
		}
	}

}

/**
 * This class contains one constructor and one method that gets the inforamtion and
 * calculates the marks and prints the result it respectively. 
 *
 */
class StudentResultCalculator extends StudentScore {

	private float totalMarks;
	private float percentage;
	final int numberOfSubject = 2;

	/**
	 * Constructs the StudentResultCalculator class.
	 *  
	 * @param name the name of the student.
	 * @param rollNo the roll number of the student.
	 * @param marksInJava the marks obtained in java.
	 * @param marksInPython the marks obtained in python.
	 */
	public StudentResultCalculator(String name, int rollNo, int marksInJava, int marksInPython) {
		super(name, rollNo, marksInJava, marksInPython); // Call the StudentScore class constructor
	}

	/**
	 * A method of StudentResultCalculator class.
	 * This method calls the getter methods to get obtained marks.
	 * It calculates result based on marks and prints the result.
	 */
	public void calculateResult() {
		int marksInJava = getMarksInJava();
		int marksInPython = getMarksInPython();

		// Calculate total marks
		totalMarks = marksInJava + marksInPython;
		System.out.println("Total marks = " + totalMarks);

		// Calculate percentage
		percentage = totalMarks / numberOfSubject;

		// Check if student is pass or fail
		if (marksInJava >= 33 && marksInPython >= 33) {
			System.out.println("Percentage = " + percentage);
			System.out.println("Result = Pass");
		} else {
			System.out.println("Result = Fail");
		}
	}

}

public class StudentMarkSheet {

	public static void main(String[] args) {
		// Create object of StudentResultCalculatore
		StudentResultCalculator firstStudent = new StudentResultCalculator("jayesh", 10, 76, 75); 
		firstStudent.printStudentBioData();
		firstStudent.printStudentScore();
		firstStudent.calculateResult();
	}

}