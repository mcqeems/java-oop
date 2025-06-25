package mcqeems.official.app.data;

public class ProductApp {
	public static void main(String[] args) {
		Product product = new Product("Zephyrus", 1000);

		System.out.println(product.name);
		System.out.println(product.price);
	}
}
