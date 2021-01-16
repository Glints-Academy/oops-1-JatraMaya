import java.util.ArrayList;

public class Teacher extends Person {

	// Setting up Teacher Class instances
	int numCourse = 0;
	ArrayList<String> courses = new ArrayList<String>();

	// Setting up Teacher class constructor
	public Teacher(String name, String address) {
		super(name, address);
		System.out.println("New Person added");
		System.out.println(super.toString() + "\n");
	}

	// Method addCourse (Return false if course already exist)
	public boolean addCourse(String course) {
		boolean success = true;

		// Add new course if Courses Array is empty
		if (courses.size() == 0) {
			courses.add(course);
		} else {
			for (int i = 0; i < courses.size(); i++) {
				if (courses.get(i) == course) {
					success = false;
				} else {
					courses.add(course);
				}
			}
		}
		return success;
	}

	// Method removeCourse (return false if course does not exist)
	public boolean removeCourse(String course) {
		boolean success = false;
		for (int i = 0; i < courses.size(); i++) {
			if (!(courses.get(i) == null)) {
				courses.remove(i);
				success = true;
			}
		}
		return success;
	}

	public String toString() {
		return "\"Teacher: " + name + "(" + address + ")\"";
	}
}