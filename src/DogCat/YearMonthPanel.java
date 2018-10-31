package DogCat;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

//년 월 콤보박스를 포함하는 패널
public class YearMonthPanel extends JPanel {
	JComboBox<Integer> yearCb;
	JComboBox<Integer> monthCb;
	
	public YearMonthPanel(){
		yearCb = new JComboBox<Integer>();
		monthCb = new JComboBox<Integer>();

		for(int i = 2000; i <= 2030; i++)
			yearCb.addItem(i);
		for(int i = 1; i<= 12; i++)
			monthCb.addItem(i);

		//콤보박스 초기값(오늘)
		yearCb.setSelectedItem(Today.tYear);
		monthCb.setSelectedItem(Today.tMonth);
		
		//배치
		setLayout(new FlowLayout());
		add(yearCb);
		add(new JLabel(" 년          "));
		add(monthCb);
		add(new JLabel(" 월"));

		
	}
	
	
}

