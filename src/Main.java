public class Main {

	public static void main(String[] args) {

		// Example of Person class usage
		System.out.println("Usage of Person class"); // For console formatting
		Person person1 = new Person("Sherlock Holmes", "Paddington Road 103A"); // Creating new Person object.
		System.out.println(person1.getName()); // Calling getName method.
		System.out.println(person1.getAddress()); // Calling getAddress method.
		person1.setAddress("Baker Street 221B, London"); // Calling setAddress method.
		System.out.println(person1); // Calling toString() method.
		System.out.println("\n"); // For console formatting.

		// Example of Student class usage
		System.out.println("Usage of class Student"); // For console formatting
		Student student1 = new Student("Bambang", "Duren Sawit no.15"); // super.toString() Method will be called in the instance of object creation.
		student1.addCourseGrade("Math", 2);
		student1.setAddress("Tanjung Priok no.105A"); // Use setAddress method from superclass Person to add new address to object;
		student1.addCourseGrade("History", 5);
		student1.printGrades(); // Will return list of course and grade for the course and will return "(Student name) don't have any grade yet if no course/grade added.
		System.out.println(student1.getName() + " have an average grade of: " + student1.getAverageGrade());
        
        // Example of method overriding 
		System.out.println(student1); // Student.toString() method called.
		
        System.out.println("\n"); // For console formatting

		// Example of Teacher class usage
		System.out.println("Usage of class Teacher");
		Teacher teacher1 = new Teacher("Oemar Bakri", "Gg. Jambu no.10"); // super.toString() Method will be called in the instance of object creation.
		System.out.println(teacher1.addCourse("Math")); // Will return true as Course Math hasn't been added yet.
		System.out.println(teacher1.addCourse("Math")); // Will return false as Course Math already exist.
		System.out.println(teacher1.removeCourse("Math")); // Will return true as Course Math exist and can be removed.
		System.out.println(teacher1.removeCourse("Math")); // Will return false as Course Math no longer exist to be removed.

        // Example of method overriding 
		System.out.println(teacher1); // Teacher.toString() method called.
	}
}
