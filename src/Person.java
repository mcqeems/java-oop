public class Person {
	String name;
	String address;
	final String country = "Indonesia";

	String sayHello(String paramName) {
		String say = "Hello " + paramName + ", my name is " + name;
		return say;
	}
}