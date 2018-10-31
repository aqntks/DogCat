package DogCat;

import java.util.Calendar;

public class Today {
	static Calendar today = Calendar.getInstance();
	public static int tYear = today.get(today.YEAR);
	public static int tMonth = today.get(today.MONTH)+1;
	public static int tDate = today.get(today.DATE);
	public static int tHour = today.get(today.HOUR);
	public static int tMinute = today.get(today.MINUTE);
	public static int tSecond = today.get(today.SECOND);
	public static Day tDay = new Day(tYear, tMonth, tDate);
}
