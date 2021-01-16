public class Person {
	public String name;
	public String address;

	// Creating Person constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// List of methods

	protected String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "\"" + name + "(" + address + ")\"";
	}
}