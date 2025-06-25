public class PolymorphismApp {
	public static void main(String[] args) {
		Employee employee = new Employee("Budi");
		employee.sayHello("Joko");

		employee = new Manager("Husein");
		employee.sayHello("Joko");

		employee = new VicePresident("Raden");
		employee.sayHello("Joko");

		sayHello(new Employee("Joko"));
		sayHello(new Manager("Husein"));
		sayHello(new VicePresident("Raden"));
	}

	static void sayHello(Employee employee) {
		if (employee instanceof VicePresident) {
			VicePresident vicePresident = (VicePresident) employee;
			System.out.println("Hello VP " + vicePresident.name);
		} else if (employee instanceof Manager) {
			Manager manager = (Manager) employee;
			System.out.println("Hello Manager " + manager.name);
		} else {
			System.out.println("Hello " + employee.name);
		}
	}
}
