package mcqeems.official.data;

public class Avanza implements Car, IsMaintenance {
	@Override
	public void drive() {
		System.out.println("Avanza Drive");
	}

	@Override
	public int getTier() {
		return 4;
	}

	@Override
	public String getBrand() {
		return "Toyota";
	}

	@Override
	public boolean isMaintenance() {
		return false;
	}

	@Override
	public boolean isBig() {
		return true;
	}
}