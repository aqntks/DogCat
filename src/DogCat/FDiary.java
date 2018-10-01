package DogCat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FDiary extends JFrame implements ActionListener{
	private JButton[] dayBt;
	private JPanel weekP;
	private JPanel diaryP;
	private JLabel yearMonthL;
	private JLabel weekL;
	private JComboBox yearCb;
	private JComboBox monthCb;
	private String[] year = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", 
			"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2020", "2021"};
	private String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	private String[] days = {"1" ,"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " ", " ", " ", " "};
	public Day btDay = new Day(2010, 1, 11);  // 버튼에 맞는 날짜값  ->> 아직 구현 안함

	public FDiary() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		diaryP = new JPanel();
		weekP = new JPanel();
		weekL = new JLabel();
		yearMonthL = new JLabel("년 월");
		yearCb = new JComboBox(year);
		monthCb = new JComboBox(month);

		setSize(300,300);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setTitle("다이어리");  //프레임 이름

		diaryP.setLayout(new GridLayout(7, 7));
		weekP.setLayout(new GridLayout(7, 7));
		dayBt = new JButton[35];

		weekP.add(weekL = new JLabel("일요일 월요일 화요일 수요일 목요일 금요일 토요일"));

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
		add(yearMonthL, BorderLayout.PAGE_START);
		add(weekP, BorderLayout.CENTER);
		add(yearCb, BorderLayout.LINE_START);
		add(monthCb, BorderLayout.LINE_END);
		add(diaryP, BorderLayout.PAGE_END);
		pack();


			dayBt[10].addActionListener(this);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == dayBt[10]) {
			DayMemo dm = new DayMemo(btDay);
		}

	}

}
