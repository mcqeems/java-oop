package mcqeems.official.app;

public class StackTraceApp {
	public static void main(String[] args) {
		try {
			sampleError();
		} catch (RuntimeException e) {
			e.printStackTrace();// TODO: handle exception
		}
	}

	public static void sampleError() {
		try {
			String[] names = {
					"Mustaqim", "Nawahhudi", "Ma'arif"
			};
			System.out.println(names[100]);
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}

}
