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
	private String[] weeks = {"��", "��", "ȭ", "��", "��", "��", "��"};
	private JButton[] dayButton;
	private String[] days;
	private Day day;
	//�� month�� ���  �� ������ �ֳ� ī��Ʈ
	private int nextCount = 0;

	public DayPanel(Day day) {
		this.day = day;
		setLayout(new GridLayout(7, 7));
		dayButton = new JButton[42];
		days = new String[42];
		weekLabel = new JLabel[7];

		
		//�ʱ� �޷� ���ϱ�
		if(day.years == 2000 && day.months == 1) {
			for(int j = 0; j < 6; j++) {
				dayButton[j] = new JButton(days[j]);
			dayButton[j].setBackground(Color.LIGHT_GRAY);
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

		//�� ��ư
		for(int i = 0; i < 7; i++) {
			weekLabel[i] = new JLabel(weeks[i], SwingConstants.CENTER);
			if(i == 0)
				weekLabel[i].setForeground(Color.RED);
			else if (i < 6)
				weekLabel[i].setForeground(Color.gray);
			else
				weekLabel[i].setForeground(Color.MAGENTA);
			add(weekLabel[i]);
		}

		//��¥ ��ư 
		int index = 0;
		for(int i = nextCount; i < 42; i++) {
			dayButton[i] = new JButton(days[index]);
			dayButton[i].setBackground(Color.LIGHT_GRAY);
			if(i % 7 == 0)
				dayButton[i].setForeground(Color.RED);
			else if(i % 7 == 6)
				dayButton[i].setForeground(Color.MAGENTA);
			else
				dayButton[i].setForeground(Color.blue);

			add(dayButton[i]);
			index++;
		}

		//���� ��¥ ȸ������ ǥ��
		if(day.years == Today.tYear && day.months == Today.tMonth)
			dayButton[Today.tDate-1].setBackground(Color.GRAY);

		for(int i = 0; i < 42; i++) {
			dayButton[i].addActionListener(this); 
		}

	}
	public void change() {

		//���̾���� �� ���� ���� �� �� �ǳ� ������ �Լ� ��������
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		for(int i = 0; i < 42; i++) {
			if(e.getSource() == dayButton[i]) {
				//�� �޸��� ����
				if(SaveMemo.cheakMemo(new Day(day.years, day.months, i+1)) == false)
				{DayMemo dm = new DayMemo(new Day(day.years, day.months, i+1));}                                    
				else	// ������ �� �ִ� �޸��� �ε�
				{new DayMemo(SaveMemo.getMemo(new Day(day.years, day.months, i+1)));}
			}
		}
	}
}

