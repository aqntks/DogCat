package DogCat;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DayPanel {
	private JPanel dayPanel;
	private JButton[] dayButton;
	private String[] days;

	public DayPanel(Day day) {
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
	}
}
