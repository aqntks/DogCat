package DogCat;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DayPanel implements ActionListener {
	private JPanel dayPanel;
	private JLabel[] weekLabel;
	private String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};
	private JButton[] dayButton;
	private String[] days;
	private Day day;

	public DayPanel(Day day) {
		this.day = day;
		dayPanel = new JPanel();
		dayPanel.setLayout(new GridLayout(6, 7));
		dayButton = new JButton[35];
		days = new String[35];
		weekLabel = new JLabel[7];

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
				weekLabel[i].setForeground(Color.RED);
			else if (i < 6)
				weekLabel[i].setForeground(Color.gray);
			else
				weekLabel[i].setForeground(Color.MAGENTA);
			dayPanel.add(weekLabel[i]);
		}

		//날짜 버튼 
		int index = 0;
		for(int i = 1; i <= 35; i++) {
			dayButton[index] = new JButton(days[index]);
			dayButton[index].setBackground(Color.LIGHT_GRAY);
			if(i % 7 == 1)
				dayButton[index].setForeground(Color.RED);
			else if(i % 7 == 0)
				dayButton[index].setForeground(Color.MAGENTA);
			else
				dayButton[index].setForeground(Color.blue);

			dayPanel.add(dayButton[index]);
			index++;
		}
		
		//오늘 날짜 회색으로 표시
		dayButton[Today.tDate-1].setBackground(Color.GRAY);

		for(int i = 0; i < 35; i++) {
			dayButton[i].addActionListener(this); 
		}

	}
	public JPanel panel() {
		return dayPanel;
	}
	public void panelRevalidate() {
		dayPanel.revalidate();
	}
	public void panelRepaint() {
		dayPanel.repaint();
	}
	public void panelRemoveAll() {
		dayPanel.removeAll();
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

