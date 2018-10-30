package DogCat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FDiary extends JFrame implements ActionListener{
	private JButton[] dayBt;
	private JPanel weekP;
	private DayPanel diaryP;
	private JLabel yearMonthL;
	private JLabel weekL;
	private JComboBox yearCb;
	private JComboBox monthCb;
	private String[] year = {"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", 
			"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2020", "2021"};
	private String[] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	public Day yearMonth = new Day(2010 , 3); // 선택된 년 월에 맞는 날짜 패널을 가져오기위한 변수값 선택된 년 월 이 언제인지 저장해야함

	public FDiary() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		diaryP = new DayPanel(yearMonth);
		weekP = new JPanel();
		weekL = new JLabel();
		yearMonthL = new JLabel("년 월");
		yearCb = new JComboBox();
		monthCb = new JComboBox();

		for(int i = 2000; i <= 2030; i++ )
			yearCb.addItem(i);
		for(int i = 1; i<= 12; i++)
			monthCb.addItem(i);

		setSize(500,500);  //프레임 사이즈
		setLocation(screenSize.width/2, screenSize.height/2);  //프레임 생성 위치
		setTitle("다이어리");  //프레임 이름

		weekP.setLayout(new GridLayout(7, 7));
		dayBt = new JButton[35];

		weekP.add(weekL = new JLabel("일요일 월요일 화요일 수요일 목요일 금요일 토요일"));


		add(yearMonthL, BorderLayout.PAGE_START);
		add(weekP, BorderLayout.CENTER);
		add(yearCb, BorderLayout.LINE_START);
		add(monthCb, BorderLayout.LINE_END);
		add(diaryP.panel(), BorderLayout.PAGE_END);
		pack();

		yearCb.addActionListener(this);
		monthCb.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == yearCb) {
			//콤보박스 선택시 그에 맞는 day 패널 만들어야함
			diaryP.panelRemoveAll();
			yearMonth = new Day(yearCb.getSelectedIndex()+2000 , yearMonth.months);
			diaryP = new DayPanel(yearMonth);
			add(diaryP.panel(), BorderLayout.PAGE_END);
			diaryP.panelRevalidate();
			diaryP.panelRepaint();
		}
		if(e.getSource() == monthCb) {

			diaryP.panelRemoveAll();
			yearMonth = new Day(yearMonth.years , monthCb.getSelectedIndex()+1);
			diaryP = new DayPanel(yearMonth);
			add(diaryP.panel(), BorderLayout.PAGE_END);
			diaryP.panelRevalidate();
			diaryP.panelRepaint();


			//콤보박스 선택시 그에 맞는 day 패널 만들어야함
		}

	}

}
