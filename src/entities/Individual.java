package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthCare) {
		super(name, annualIncome);
		this.healthExpenditures = healthCare;
	}

	public Double getHealthCare() {
		return healthExpenditures;
	}

	public void setHealthCare(Double healthCare) {
		this.healthExpenditures = healthCare;
	}

	@Override
	public Double tax() {
		if (getAnnualIncome() < 20000.0) {
			return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}
}
