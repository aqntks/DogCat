package DogCat;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DayPanel extends JPanel implements ActionListener {
	private JLabel[] weekLabel;
	private String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};
	private JButton[] dayButton;
	private String[] days;
	private Day day;
	//그 month에 몇개의  앞 공백이 있나 카운트
	private int nextCount = 0;

	public DayPanel(Day day) {
		this.day = day;
		setLayout(new GridLayout(7, 7));
		dayButton = new JButton[42];
		days = new String[42];
		weekLabel = new JLabel[7];

		
		//초기 달력 정하기
		if(day.years == 2000 && day.months == 1) {
			for(int j = 0; j < 6; j++) {
				dayButton[j] = new JButton(days[j]);
			dayButton[j].setBackground(new Color(250, 237, 210));
				add(dayButton[j]);
				nextCount++;
			}
		}

		switch(day.months) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			for(int i = 1; i < 32; i++)
				days[i-1] = i + "";
			break;
		case 4: case 6: case 9: case 11:
			for(int i = 1; i < 31; i++)
				days[i-1] = i + "";
			break;
		case 2:
			for(int i = 1; i < 29; i++)
				days[i-1] = i + "";
			break;
		}

		//주 버튼
		for(int i = 0; i < 7; i++) {
			weekLabel[i] = new JLabel(weeks[i], SwingConstants.CENTER);
			if(i == 0)
				weekLabel[i].setForeground(new Color(189, 61, 61));
			else if (i < 6)
				weekLabel[i].setForeground(new Color(102, 102, 102));
			else
				weekLabel[i].setForeground(new Color(67, 127, 193));
			add(weekLabel[i]);
		}

		//날짜 버튼 
		int index = 0;
		for(int i = nextCount; i < 42; i++) {
			dayButton[i] = new JButton(days[index]);
			dayButton[i].setBackground(new Color(250, 237, 210));
			if(i % 7 == 0)
				dayButton[i].setForeground(new Color(189, 61, 61));
			else if(i % 7 == 6)
				dayButton[i].setForeground(new Color(67, 127, 193));
			else
				dayButton[i].setForeground(new Color(102, 102, 102));

			add(dayButton[i]);
			index++;
		}

		//오늘 날짜 회색으로 표시
		if(day.years == Today.tYear && day.months == Today.tMonth)
			dayButton[Today.tDate-1].setBackground(new Color(236, 187, 83));

		for(int i = 0; i < 42; i++) {
			dayButton[i].addActionListener(this); 
		}

	}
	public void change() {

		//다이어리에서 년 월을 선택 시 새 판낼 리턴할 함수 만들어야함
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		for(int i = 0; i < 42; i++) {
			if(e.getSource() == dayButton[i]) {
				//새 메모장 생성
				if(SaveMemo.cheakMemo(new Day(day.years, day.months, i+1)) == false)
				{DayMemo dm = new DayMemo(new Day(day.years, day.months, i+1));}                                    
				else	// 생성된 적 있는 메모장 로드
				{new DayMemo(SaveMemo.getMemo(new Day(day.years, day.months, i+1)));}
			}
		}
	}
}

