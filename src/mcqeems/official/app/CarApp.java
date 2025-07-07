package mcqeems.official.app;

import mcqeems.official.data.Avanza;
import mcqeems.official.data.Car;

public class CarApp {

	public static void main(String[] args) {
		Car car = new Avanza();
		System.out.println(car.getTier());
		car.drive();

	}
}