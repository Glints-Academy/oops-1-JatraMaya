import java.util.ArrayList;

public class Student extends Person {
	int numCourse = 0;
	ArrayList<String> courses = new ArrayList<String>();
	ArrayList<Integer> grades = new ArrayList<Integer>();

	// Creating Student constructor
	public Student(String name, String address) {
		super(name, address);
		System.out.println("New Person added ");
		System.out.println(super.toString() + "\n");
	}

	// List of methods
	public void addCourseGrade(String course, int grade) {
		courses.add(course);
		grades.add(grade);
		numCourse++;
	}

	public void printGrades() {
		if (numCourse == 0) {
			System.out.println(getName() + " don\'t have any grade yet."); // Console statement if no grade/course found on student record
		} else {
			
			// Adding System print for console formatting
			System.out.println("List of " + getName() + " grade:");
			System.out.println("-------------------");
			for (int i = 0; i < numCourse; i++) {
				System.out.println("| " + courses.get(i) + ": " + grades.get(i));
				System.out.println("-------------------");
			}
		}
	}

	public double getAverageGrade() {
		double gradeSum = 0;
		double gradeAverage = 0;

		if (numCourse == 0) {
			// Return statement if Student doesn't have any course/grade yet.
			System.out.println("Student " + getName() + " didn\'t have any grade yet!");
		} else {
			for (int i = 0; i < numCourse; i++) {
				gradeSum += grades.get(i);
			}
		}
		gradeAverage = gradeSum / numCourse;
		return gradeAverage;
	}
    
    // Applying polymorphism into toString method from Person (superclass) to Student (subclass)
	public String toString() {
		return "\"Student: " + name + "(" + address + ")\"";
	}
}
