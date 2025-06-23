public class Person {
	// Attrbutes
	String name;
	String address;
	final String country = "Indonesia";

	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	Person(String name) {
		this(name, null);
	}

	Person() {
		this(null);

	}

	String sayHello(String name) {
		String say = "Hello " + this.name + ", my name is " + name;
		return say;
	}
}