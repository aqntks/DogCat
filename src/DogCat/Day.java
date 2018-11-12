package DogCat;

public class Day {
	int years;
	int months;
	int days;

	public Day(int years, int months, int days) {
		this.years = years;
		this.months = months;
		this.days = days;
	}
	public Day(int years, int months) {
		this.years = years;
		this.months = months;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String print() {
		return years + "." + months + "." + days;
	}
}
