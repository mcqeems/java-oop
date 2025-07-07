package mcqeems.official.app;

import mcqeems.official.data.LoginRequest;

public class RecordApp {
	public static void main(String[] args) {
		LoginRequest loginRequest = new LoginRequest("Qeem", "Rahasia");

		System.out.println(loginRequest);
		System.out.println(loginRequest.username());
		System.out.println(loginRequest.password());

		System.out.println(new LoginRequest());
		System.out.println(new LoginRequest("Qeem"));
		System.out.println(new LoginRequest("Qeem", "Rahasia"));

	}
}
