package mcqeems.official.app;

import mcqeems.official.annotation.Fancy;
import mcqeems.official.data.Animal;
import mcqeems.official.data.Cat;

@Fancy(name = "AnimalApp", tags = { "application", "java" })
public class AnimalApp {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.name = "Puss";
		animal.run();
	}
}
