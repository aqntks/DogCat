package DogCat;

import java.util.Calendar;

public class Diary {
	public static final int ALL_DAY_BUTTON = 37; //다이어리의 날짜 버튼 갯수
	
	private Calendar today;
	private Calendar diaryDay;
	
	public Diary() {
		today = Calendar.getInstance();  //오늘 날짜정보
		
	}


}
