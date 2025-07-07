package mcqeems.official.app;

import mcqeems.official.data.Company;

public class CompanyApp {
	public static void main(String[] args) {
		Company company = new Company();
		company.setName("Mcqeems");

		Company.Employee employee = company.new Employee();
		employee.setName("Qeem");

		System.out.println(employee.getName());
		System.out.println(employee.getCompany());

		Company company2 = new Company();
		company2.setName("Mcqeems Alternate");

		Company.Employee employee2 = company2.new Employee();
		employee2.setName("Qeem2");

		System.out.println(employee2.getName());
		System.out.println(employee2.getCompany());

	}
}
