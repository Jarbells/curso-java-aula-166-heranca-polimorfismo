package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, Integer employeeQuantity) {
		super(name, annualIncome);
		this.numberOfEmployees = employeeQuantity;
	}
	
	public Integer getEmployeeQuantity() {
		return numberOfEmployees;
	}

	public void setEmployeeQuantity(Integer employeeQuantity) {
		this.numberOfEmployees = employeeQuantity;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees <= 10) {
			return getAnnualIncome() * 0.16;
		}
		else {
			return getAnnualIncome() * 0.14;
		}
	}
}
