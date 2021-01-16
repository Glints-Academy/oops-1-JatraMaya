import java.util.ArrayList;

public class Student extends Person {
	int numCourse = 0;
	ArrayList<String> courses = new ArrayList<String>();
	ArrayList<Integer> grades = new ArrayList<Integer>();

	public Student(String name, String address) {
		super(name, address);
		System.out.println("New Person added ");
		System.out.println(super.toString() + "\n");
	}

	public void addCourseGrade(String course, int grade) {
		courses.add(course);
		grades.add(grade);
	}

	public void printGrades() {
		if (grades.size() == 0) {
			System.out.println(getName() + " don\'t have any grade yet.");
		} else {
			System.out.println("List of " + getName() + " grade:");
			System.out.println("-------------------");
			for (int i = 0; i < grades.size(); i++) {

				System.out.println("| " + courses.get(i) + ": " + grades.get(i));
				System.out.println("-------------------");
			}
		}

	}

	public double getAverageGrade() {
		double gradeSum = 0;
		double gradeAverage = 0;

		if (grades.size() == 0) {
			System.out.println("Student " + getName() + " didn\'t have any grade yet!");
		} else {
			for (int i = 0; i < grades.size(); i++) {
				gradeSum += grades.get(i);
			}
		}

		gradeAverage = gradeSum / grades.size();
		return gradeAverage;
	}
	public String toString() {
		return "\"Student: " + name + "(" + address + ")"; 
	}
}
