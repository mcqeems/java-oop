package mcqeems.official.app;

import mcqeems.official.data.City;
import mcqeems.official.data.Country;

public class CountryApp {
	public static void main(String[] args) {
		Country country = new Country();
		country.setName("Indonesia");
		System.out.println(country.getName());
	}
}
