package mcqeems.official.app;

public class EqualsApp {
	public static void main(String[] args) {
		String first = "Eko";
		first = first + " " + "Khannedy";

		System.out.println(first);

		String second = "Eko Khannedy";
		System.out.println(second);

		String third = "Eko Khannedy";
		System.out.println(third);

		System.out.println(first == second);
		System.out.println(second == third);
		System.out.println(first.equals(second));
	}
}
