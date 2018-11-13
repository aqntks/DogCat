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
	// 해당 월에 일 수가 몇일 인지 리턴하는 함수
	public int howDate() {
		switch(months) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			if(years%4 == 0) 
				return 29;
			else
				return 28;
		default:
			return 0;
		}
	}
}
