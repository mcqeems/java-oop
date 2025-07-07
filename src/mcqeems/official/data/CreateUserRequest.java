package mcqeems.official.data;

import mcqeems.official.annotation.NotBlank;

public class CreateUserRequest {
	@NotBlank
	private String username;

	@NotBlank
	private String password;

	@NotBlank
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
