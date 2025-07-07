package mcqeems.official.app;

import mcqeems.official.data.CreateUserRequest;
import mcqeems.official.util.ValidationUtil;

public class ReflectionApp {
	public static void main(String[] args) {
		CreateUserRequest request = new CreateUserRequest();
		request.setUsername("Mustaqim");
		request.setPassword("Rahasia");

		ValidationUtil.validationReflection(request);
	}
}
