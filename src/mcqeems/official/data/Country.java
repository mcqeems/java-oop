package mcqeems.official.data;

public class Country {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class City {
		private String name;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

}
