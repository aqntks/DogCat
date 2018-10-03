package DogCat;

public class SaveMemo {
	static DayMemo[][][] saveMemo = new DayMemo[1000][12][31];
	static int saveCount = 0;
	
	//[a][b][c] 3���� �迭�� a : [0]�� 2000��    b : [0]�� 1��   c : [0]�� 1��
	public static void save(DayMemo dm, Day d) {
		saveMemo[d.years-2000][d.months-1][d.days-1] = dm;
		saveCount++;
	}
	//��¥�� �´� �޸� �˾Ƴ���
	public static DayMemo getMemo(Day d) {
		return saveMemo[d.years-2000][d.months-1][d.days-1];
	}
	//�´� ��¥�� ����� �޸� �ִ��� Ȯ�� (������ true)
	public static boolean cheakMemo(Day d) {
		return saveMemo[d.years-2000][d.months-1][d.days-1] != null;
	}

	//�ʱ�ȭ
	public static void reset() {
		saveMemo = new DayMemo[1000][12][31];
		saveCount = 0;
	}
	//�޸� ���� Ȯ��
	public static int count() {
		return saveCount;
	}
}
