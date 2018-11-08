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
	public Day yearMonth = Today.tDay; // ���õ� �� ���� �´� ��¥ �г��� ������������ ������ ���õ� �� �� �� �������� �����ؾ���

	public FDiary() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		diaryP = new DayPanel(yearMonth);
		weekP = new JPanel();
		weekL = new JLabel();
		yearMonthL = new JLabel("�� ��");
		yearCb = new JComboBox();
		monthCb = new JComboBox();

		for(int i = 2000; i <= 2030; i++ )
			yearCb.addItem(i);
		for(int i = 1; i<= 12; i++)
			monthCb.addItem(i);

		setSize(500,500);  //������ ������
		setLocation(1200, 200);  //������ ���� ��ġ
		setTitle("���̾");  //������ �̸�

		weekP.setLayout(new GridLayout(7, 7));
		dayBt = new JButton[35];

		weekP.add(weekL = new JLabel("�Ͽ��� ������ ȭ���� ������ ����� �ݿ��� �����"));


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
			//�޺��ڽ� ���ý� �׿� �´� day �г� ��������
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


			//�޺��ڽ� ���ý� �׿� �´� day �г� ��������
		}

	}

}
