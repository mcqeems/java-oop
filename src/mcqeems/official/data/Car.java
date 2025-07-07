package mcqeems.official.data;

import mcqeems.official.annotation.Fancy;

@Fancy(name = "Car", tags = { "application", "java" })
public interface Car extends HasBrand, IsMaintenance {
	@Fancy(name = "Car", tags = { "application", "java" })
	void drive();

	int getTier();

	default boolean isBig() {
		return false;
	};
}
