package mcqeems.official.data;

public record LoginRequest(String username, String password) {
	public LoginRequest {
		System.out.println("Membuat Object");
	}

	public LoginRequest(String username) {
		this(username, "");
	}

	public LoginRequest() {
		this("", "");
	}
}
