package DogCat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DayPanel extends JPanel {
	private JLabel[] weekLabel;
	private String[] weeks = {"��", "��", "ȭ", "��", "��", "��", "��"};
	private JButton[] dayButton;
	private String[] days;
	private Day day;
	//�� month�� ���  �� ������ �ֳ� ī��Ʈ
	//month�� ��� �� ������ �ֳ� �����س� �迭 (index[1] �� 2000�� 1��)(index[0]�� ������ ��)
	private int[] blank = new int[373];
	//���� �� ��¥�� blank�� index�� ���°���� �����ϴ� ����
	public int when;

	public DayPanel(Day day) {
		this.day = day;
		setLayout(new GridLayout(7, 7));
		dayButton = new JButton[42];
		days = new String[42];
		weekLabel = new JLabel[7];
		when = (day.years - 2000)*12 + day.months;
		fillBlank();

		//��ư ��¥ ǥ��
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
			if(day.years%4 == 0) 
				days[28] = 29 +"";
			break;
		}

		//�� ��ư
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


		//��¥ �� ����
		for(int j = 0; j < blank[when]; j++) {
			dayButton[j] = new JButton();
			dayButton[j].setBackground(new Color(250, 237, 210));
			add(dayButton[j]);
		}
		//��¥ ��ư 
		int index = 0;
		for(int i = blank[when]; i < 42; i++) {
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

		//���� ��¥ ȸ������ ǥ��
		if(day.years == Today.tYear && day.months == Today.tMonth)
			dayButton[blank[when] + Today.tDate-1].setBackground(new Color(236, 187, 83));

		//���� ����
		fillBirthday();

		//�̺�Ʈ ó����
		for(int i = blank[when]; i < day.howDate()+blank[when]; i++) {
			dayButton[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					for(int i = 0; i < day.howDate(); i++) {
						if(e.getSource() == dayButton[blank[when]+i]) {
							//�� �޸��� ����
							if(SaveMemo.cheakMemo(new Day(day.years, day.months, i+1)) == false)
							{DayMemo dm = new DayMemo(new Day(day.years, day.months, i+1));}                                    
							else	// ������ �� �ִ� �޸��� �ε�
							{new DayMemo(SaveMemo.getMemo(new Day(day.years, day.months, i+1)));}
						}
					}
				}
			}); 
		}

	}
	//���� ���� �Լ�
	public void fillBirthday() {
		if(saveProfile.create && saveProfile.birthday.months == day.months) {
			dayButton[blank[when] + saveProfile.birthday.days-1].setBackground(new Color(233, 187, 219));

			//���� ǥ�ø� ����� ���ο� ���� ���� �ۼ��ϴ� �ڵ� ��������
		}
	}

	public void change() {

		//���̾���� �� ���� ���� �� �� �ǳ� ������ �Լ� ��������
	}
	public void fillBlank() {
		//�� ���� ������� Ȯ�� ���� ����
		int mon = 0;
		//�� �� ���� ���� ����
		blank[0] = 3;
		for(int i = 1; i < blank.length; i++) {
			switch(i%12) {
			case 1:case 2:case 4:case 6:case 8:case 9:case 11:
				mon = 31;
				break;
			case 0:case 5: case 7: case 10:
				mon = 30;
				break;
			case 3:
				if(i%48 == 3) {
					mon = 29;
					break;
				}
				else {
					mon = 28;
					break;
				}
			}
			blank[i] = 7 - (( 42 - (mon + blank[i-1]))  % 7);
		}
	}
}

