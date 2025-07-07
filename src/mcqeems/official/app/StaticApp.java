package mcqeems.official.app;

import mcqeems.official.data.Application;
import mcqeems.official.data.City;
import mcqeems.official.data.Constant;
import mcqeems.official.data.Country;
import mcqeems.official.util.MathUtil;

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Constant.APPLICATION);
		System.out.println(Constant.VERSION);

		System.out.println(
				MathUtil.sum(1, 1, 1, 1, 1));

		Country.City city = new Country.City();
		city.setName("Karawang");

		System.out.println(city.getName());

		System.out.println(Application.PROCESSOR);
	}
}
