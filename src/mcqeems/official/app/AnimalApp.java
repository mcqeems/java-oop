package mcqeems.official.app;

import mcqeems.official.app.data.Animal;
import mcqeems.official.app.data.Cat;

public class AnimalApp {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.name = "Puss";
		animal.run();
	}
}
