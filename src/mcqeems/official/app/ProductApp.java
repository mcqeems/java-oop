package mcqeems.official.app;

import mcqeems.official.app.data.Product;

public class ProductApp {
	public static void main(String[] args) {
		Product product = new Product("Zephyrus", 1000);

		System.out.println(product.name);
		System.out.println(product.price);

		System.out.println(product);

		Product product2 = new Product("Zephyrus", 1000);

		System.out.println(product.equals(product2));
	}
}
