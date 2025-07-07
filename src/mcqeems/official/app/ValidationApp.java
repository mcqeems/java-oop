package mcqeems.official.app;

import mcqeems.official.data.LoginRequest;
import mcqeems.official.error.ValidationException;
import mcqeems.official.util.ValidationUtil;

public class ValidationApp {
	public static void main(String[] args) {
		LoginRequest loginRequest = new LoginRequest(null, "apa");

		try {
			ValidationUtil.validate(loginRequest);
		} catch (ValidationException | NullPointerException exception) {
			System.out.println("Data invalid: " + exception.getMessage());
		} finally {
			System.out.println("Selalu di eksekusi");
		}

		LoginRequest loginRequest2 = new LoginRequest(null, null);
		ValidationUtil.validateRuntime(loginRequest2);
		System.out.println("Sukses");
	}
}
