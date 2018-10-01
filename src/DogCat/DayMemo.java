package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DayMemo extends JFrame implements ActionListener{
	private JTextArea taMemo;
	private JPanel pMemo;
	private JButton bSaveMemo, bCloseMemo;
	private JMenuBar mbMemo;
	private JMenu menuMemo;
	private JMenuItem saveMenu, closeMenu;
	public Day day;

	public DayMemo(Day day) {
		//��� ��¥�� �޸����� ����
		this.day = day;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //������ ������
		setLocation(screenSize.width/2, screenSize.height/2);  //������ ���� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "��" + day.months + "��" + day.days + "��");  //������ �̸�

		//��� â
		taMemo = new JTextArea();
		//�ϴ� �ǳ�
		pMemo = new JPanel();
		//��� �޴� �� 
		mbMemo = new JMenuBar();
		menuMemo = new JMenu("�޴�");
		//��� �޴� �� ���
		saveMenu = new JMenuItem("����");
		closeMenu =new JMenuItem("����");
		//�ϴ� ����, ���� ��ư
		bSaveMemo = new JButton("����");
		bCloseMemo = new JButton("����");

		this.add(taMemo);
		this.add(pMemo, BorderLayout.SOUTH);
		pMemo.add(bSaveMemo);
		pMemo.add(bCloseMemo);

		this.setJMenuBar(mbMemo);
		//�޴� �޴� �߰�
		mbMemo.add(menuMemo);
		//�޴� �� ���
		menuMemo.add(saveMenu);
		menuMemo.add(closeMenu);

		bSaveMemo.addActionListener(this);
		bCloseMemo.addActionListener(this);
		saveMenu.addActionListener(this);
		closeMenu.addActionListener(this); 

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == saveMenu || e.getSource() == bSaveMemo) {
			SaveMemo.save(this, day);
		}
		if(e.getSource() == closeMenu || e.getSource() == bCloseMemo)
			dispose();
	}
}
