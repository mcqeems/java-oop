package mcqeems.official.util;

import java.lang.reflect.Field;

import mcqeems.official.annotation.NotBlank;
import mcqeems.official.data.LoginRequest;
import mcqeems.official.error.BlankException;
import mcqeems.official.error.ValidationException;

public class ValidationUtil {
	public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is null");
		} else if (loginRequest.username().isBlank()) {
			throw new ValidationException("Username is blank");
		} else if (loginRequest.password() == null) {
			throw new NullPointerException("Password is null");
		} else if (loginRequest.password().isBlank()) {
			throw new ValidationException("Password is blank");
		}
	}

	public static void validateRuntime(LoginRequest loginRequest) {
		if (loginRequest.username() == null) {
			throw new NullPointerException("Username is null");
		} else if (loginRequest.username().isBlank()) {
			throw new BlankException("Username is blank");
		} else if (loginRequest.password() == null) {
			throw new NullPointerException("Password is null");
		} else if (loginRequest.password().isBlank()) {
			throw new BlankException("Password is blank");
		}
	}

	public static void validationReflection(Object object) {
		Class aClass = object.getClass();
		Field[] fields = aClass.getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);

			if (field.getAnnotation(NotBlank.class) != null) {
				try {
					String value = (String) field.get(object);

					if (value == null || value.isBlank()) {
						throw new BlankException("Field " + field.getName() + "is blank");
					}
				} catch (IllegalAccessException e) {
					System.out.println("Tidak bisa mengakses field " + field.getName());// TODO: handle exception
				}
			}
		}
	}

}
