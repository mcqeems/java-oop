package mcqeems.official.app;

import mcqeems.official.app.data.*;

public class Application {
	public static void main(String[] args) {
		Product product = new Product("ROG", 2000);
		System.out.println(product.name);
		System.out.println(product.price);

		Data data = new Data();
	}
}
