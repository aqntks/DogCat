package DogCat;

public class SaveMemo {
	static DayMemo[][][] saveMemo = new DayMemo[1000][12][31];
	static int saveCount = 0;
	
	//[a][b][c] 3차원 배열의 a : [0]이 2000년    b : [0]이 1월   c : [0]이 1일
	public static void save(DayMemo dm, Day d) {
		saveMemo[d.years-2000][d.months-1][d.days-1] = dm;
		saveCount++;
	}
	//날짜의 맞는 메모 알아내기
	public static DayMemo getMemo(Day d) {
		return saveMemo[d.years-2000][d.months-1][d.days-1];
	}
	//맞는 날짜에 저장된 메모가 있는지 확인 (있으면 true)
	public static boolean cheakMemo(Day d) {
		return saveMemo[d.years-2000][d.months-1][d.days-1] != null;
	}

	//초기화
	public static void reset() {
		saveMemo = new DayMemo[1000][12][31];
		saveCount = 0;
	}
	//메모 갯수 확인
	public static int count() {
		return saveCount;
	}
}
