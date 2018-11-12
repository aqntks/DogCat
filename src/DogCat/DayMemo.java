package DogCat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DayMemo extends JFrame implements ActionListener{
	private JTextArea taMemo;
	private JPanel pMemo;
	private JButton bSaveMemo, bCloseMemo;
	private JMenuBar mbMemo;
	private JMenu menuMemo;
	private JMenuItem saveMenu, closeMenu;
	public Day yearMonth;
	public Day day;
	private File file;



	public DayMemo(Day day) {
		//��� ��¥�� �޸����� ����
		this.day = day;
		file = new File(day.print() + ".txt");

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //������ ������
		setLocation(1200, 500);  //������ ���� ��ġ
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "�� " + day.months + "�� " + day.days + "��");  //������ �̸�

		//��� â
		taMemo = new JTextArea();


		//���� �б�
		if(file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String str = br.readLine();
				while(str != null){
					taMemo.setText(str);
					str = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("���� �߻�");
			} catch (IOException e) {
				System.out.println("���� �߻�");
			}
		}



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
	//�ε�� ������
	public DayMemo(DayMemo dm) {
		//��� ��¥�� �޸����� ����
		this.day = dm.day;
		file = new File(day.print() + ".txt");

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();

		setSize(500,500);  //������ ������
		setLocation(1200, 500);  //������ ���� ��ġ
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle(day.years + "�� " + day.months + "�� " + day.days + "��");  //������ �̸�



		//��� â
		taMemo = SaveMemo.getMemo(day).taMemo;
		//���� �б�
		if(file.isFile()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String str = br.readLine();
				while(str != null){
					taMemo.setText(str);
					str = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("���� �߻�");
			} catch (IOException e) {
				System.out.println("���� �߻�");
			}
		}

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

			try {
				//file.createNewFile();
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(taMemo.getText()+" ");
				bw.close(); 
			} catch (IOException eI) {
				System.out.println("���� �߻�");
			}

			SaveMemo.save(this, day);
			JOptionPane.showMessageDialog(this, "                               ����Ϸ�", " �ȳ�", JOptionPane.PLAIN_MESSAGE);
		}
		if(e.getSource() == closeMenu || e.getSource() == bCloseMemo)
			dispose();
	}
}
