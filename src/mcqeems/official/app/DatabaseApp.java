package mcqeems.official.app;

import mcqeems.official.error.DatabaseError;

public class DatabaseApp {
	public static void main(String[] args) {
		connectDatabase("Qeem", null);
		System.out.println("Sukses");
	}

	public static void connectDatabase(String username, String password) {
		if (username == null || password == null) {
			throw new DatabaseError("Tidak bisa terhubung ke database");
		}
	}
}
