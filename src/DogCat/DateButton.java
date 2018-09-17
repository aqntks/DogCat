package DogCat;

import javax.swing.JButton;

public class DateButton {
	JButton[] dayBt;
	public DateButton() {
		ButtonIf buttonIf = new ButtonIf(setDayIf("January"));
	}
	public String[] setDayIf(String month) {
		String[] set = null;

		switch(month) {
		case "January":
		case "March": 
		case "May":
		case "July":
		case "September":
		case "November":
		{
			set = new String[31];
			for(int i=0; i<31; i++) {set[i] = Integer.toString(i);}
			break;
		}
		case "April":
		case "June":
		case "August":
		case "October":
		case "December":
		{
			set = new String[30];
			for(int i=0; i<30; i++) {set[i] = Integer.toString(i);}
			break;
		}
		case "February":
		{
			set = new String[28];
			for(int i=0; i<28; i++) {set[i] = Integer.toString(i);}
			break;
		}
		}
		return set;
	}

}
