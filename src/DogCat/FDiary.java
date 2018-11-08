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
	private YearMonthPanel yearMonthPanel = new YearMonthPanel();
	private JLabel weekL;
	private JComboBox yearCb;
	private JComboBox monthCb;
	public Day yearMonth = Today.tDay; // 선택된 년 월에 맞는 날짜 패널을 가져오기위한 변수값 선택된 년 월 이 언제인지 저장해야함

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
		setLocation(1200, 200);  //프레임 생성 위치
		setTitle("다이어리");  //프레임 이름

		weekP.setLayout(new GridLayout(7, 7));
		dayBt = new JButton[35];

		weekP.add(weekL = new JLabel("일요일 월요일 화요일 수요일 목요일 금요일 토요일"));


		add(yearMonthPanel, BorderLayout.PAGE_START);
		//add(weekP, BorderLayout.CENTER);
		//add(yearCb, BorderLayout.LINE_START);
		//add(monthCb, BorderLayout.LINE_END);
		add(diaryP, BorderLayout.CENTER);
		pack();

		yearMonthPanel.yearCb.addActionListener(this);
		yearMonthPanel.monthCb.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == yearMonthPanel.yearCb) {
			//콤보박스 선택시 그에 맞는 day 패널 만들어야함
			diaryP.removeAll();
			yearMonth = new Day(yearMonthPanel.yearCb.getSelectedIndex()+2000 , yearMonth.months);
			diaryP = new DayPanel(yearMonth);
			add(diaryP, BorderLayout.CENTER);
			diaryP.revalidate();
			diaryP.repaint();
		}
		if(e.getSource() == yearMonthPanel.monthCb) {

			diaryP.removeAll();
			yearMonth = new Day(yearMonth.years , yearMonthPanel.monthCb.getSelectedIndex()+1);
			diaryP = new DayPanel(yearMonth);
			add(diaryP, BorderLayout.CENTER);
			diaryP.revalidate();
			diaryP.repaint();


			//콤보박스 선택시 그에 맞는 day 패널 만들어야함
		}

	}

}
