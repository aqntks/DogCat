package DogCat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FDiary extends JFrame {
	private JButton[] dayBt;
	private JPanel diaryP;
	private JLabel yearMonthL;
	private JComboBox yearCb;
	private JComboBox monthCb;
	private String[] year = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", 
			"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2020", "2021"};
	private String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	private String[] days = {"1" ,"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " ", " ", " ", " "};

	public FDiary() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		diaryP = new JPanel();
		yearMonthL = new JLabel("�� ��");
		yearCb = new JComboBox(year);
		monthCb = new JComboBox(month);
		
		setSize(300,300);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setTitle("���̾");  //������ �̸�

		diaryP.setLayout(new GridLayout(7, 5));
		dayBt = new JButton[35];

		int index = 0;
		for(int rows = 0; rows < 7; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				dayBt[index] = new JButton(days[index]);
				dayBt[index].setForeground(Color.blue);
				dayBt[index].setBackground(Color.yellow);
				diaryP.add(dayBt[index]);
				index++;
			}
		}
		add(yearMonthL, BorderLayout.CENTER);
		add(yearCb, BorderLayout.LINE_START);
		add(monthCb, BorderLayout.LINE_END);
		add(diaryP, BorderLayout.PAGE_END);
		pack();
		setVisible(true);
	}

}