package DogCat;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

//�� �� �޺��ڽ��� �����ϴ� �г�
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

		//�޺��ڽ� �ʱⰪ(����)
		yearCb.setSelectedItem(Today.tYear);
		monthCb.setSelectedItem(Today.tMonth);
		
		//��ġ
		setLayout(new FlowLayout());
		add(yearCb);
		add(new JLabel(" ��          "));
		add(monthCb);
		add(new JLabel(" ��"));

		
	}
	
	
}

