package DogCat;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DayPanel implements ActionListener {
	private JPanel dayPanel;
	private JButton[] dayButton;
	private String[] days;
	private Day day;

	public DayPanel(Day day) {
		this.day = day;
		dayPanel = new JPanel();
		dayPanel.setLayout(new GridLayout(5, 7));
		dayButton = new JButton[35];
		days = new String[35];

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

		int index = 0;

		for(int i = 0; i < 35; i++) {
			dayButton[index] = new JButton(days[index]);
			dayButton[index].setForeground(Color.blue);
			dayButton[index].setBackground(Color.yellow);
			dayPanel.add(dayButton[index]);
			index++;
		}

		for(int i = 0; i < 35; i++) {
			dayButton[i].addActionListener(this); 
		}

	}
	public JPanel panel() {
		return dayPanel;
	}
	public void change() {
		//다이어리에서 년 월을 선택 시 새 판낼 리턴할 함수 만들어야함
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		for(int i = 0; i < 35; i++) {
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

